package Array_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentRegister {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Bjorni");
        studentList.add("Bajrami");
        studentList.add("Henea");
        studentList.add("Stiliano");
        studentList.add("Genti");
        studentList.add("BjorniPasha");

        printReg(studentList);

        System.out.print("Enter letter to filter: ");
        char l = scanner.next().charAt(0);

        ArrayList<String> newList = filterLetter(studentList, l);

        printReg(newList);

        System.out.print("Enter name of student to add: ");
        String name = scanner.next();

        addStd(studentList, name);

        System.out.println("First alphabetically: " + firstAlphabetically(studentList));
        System.out.println("Last alphabetically: " + lastAlphabetically(studentList));

        scanner.close();
    }

    public static void printReg(ArrayList<String> list){
        for(String l : list){
            System.out.println(l);
        }
    }

    public static ArrayList<String> filterLetter(ArrayList<String> list, char letter){
        ArrayList<String> newList = new ArrayList<>();

        for(String l : list){
            if(l.charAt(0) == letter){
                newList.add(l);
            }
        }

        return newList;
    }

    public static void addStd(ArrayList<String> list, String name){
        if(!list.contains(name)){
            list.add(name);
        }
    }

    public static String firstAlphabetically(ArrayList<String> list){
        Collections.sort(list);

        return list.getFirst();
    }

    public static String lastAlphabetically(ArrayList<String> list){
        Collections.sort(list);

        return list.getLast();
    }
}