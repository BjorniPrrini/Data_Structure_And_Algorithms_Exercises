package Array_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class OurUniversity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] catalog = {"Data Structures and Algorithms", "Programming Language Paradigms", "Web Technology", "Software Design", "Communication Skills"};

        ArrayList<String> enrolledStudents = new ArrayList<>();
        ArrayList<String> waitList = new ArrayList<>();

        int capacity = 4;

        printCatalog(catalog);

        printEnrolled(enrolledStudents);

        printWaitList(waitList);

        System.out.print("Enter student name to enroll: ");
        String name = scanner.nextLine();
        enrollStudent(enrolledStudents, waitList, name, capacity);

        System.out.print("Enter student name to delete: ");
        String nameDelete = scanner.nextLine();
        dropStudent(enrolledStudents, waitList, nameDelete);

        System.out.println("Availability: " + countAvailable(enrolledStudents, capacity));

        scanner.close();
    }

    public static void printCatalog(String[] catalog){
        for(String c : catalog){
            System.out.println(c);
        }
    }

    public static void printEnrolled(ArrayList<String> enrolled){
        for(String e : enrolled){
            System.out.println(e);
        }
    }

    public static void printWaitList(ArrayList<String> waitList){
        for(String w : waitList){
            System.out.println(w);
        }
    }

    public static void enrollStudent(ArrayList<String> enrolled, ArrayList<String> waitList, String student, int capacity){
        if(enrolled.contains(student) || waitList.contains(student)){
            System.out.println("Student already registered.");

            return;
        }

        if(enrolled.size() < capacity){
            enrolled.add(student);

            System.out.println("Student was added to the enrollment list.");
        }else{
            waitList.add(student);

            System.out.println("Student was added to the wait list.");
        }
    }

    public static void dropStudent(ArrayList<String> enrolled, ArrayList<String> waitList, String student){
        if(!enrolled.contains(student)){
            System.out.println(student + " is not enrolled.");

            return;
        }

        enrolled.remove(student);

        if(!waitList.isEmpty()){
            String movedStudent = waitList.remove(0);

            enrolled.add(movedStudent);

            System.out.println(movedStudent + " has been moved from wait list to enrolled.");
        }
    }

    public static int countAvailable(ArrayList<String> enrolled, int capacity){
        return capacity - enrolled.size();
    }
}