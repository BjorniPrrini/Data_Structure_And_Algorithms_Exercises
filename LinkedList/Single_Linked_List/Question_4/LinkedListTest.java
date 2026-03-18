package LinkedList.Single_Linked_List.Question_4;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        list.printRecursive();

        list.printRecursiveReverse();

        System.out.println(list.sum());

        System.out.println(list.max());

        System.out.println(list.count(2));
        System.out.println(list.count(5));
        System.out.println(list.isPalindrome());

        LinkedList<Integer> notPalindrome = new LinkedList<>();

        notPalindrome.add(1);
        notPalindrome.add(2);
        notPalindrome.add(3);
        System.out.println(notPalindrome.isPalindrome());

        LinkedList<Integer> delList = new LinkedList<>();

        delList.add(2);
        delList.add(2);
        delList.add(3);
        delList.add(2);
        delList.add(4);
        delList.deleteAll(2);
        delList.printRecursive();

        LinkedList<Integer> allSame = new LinkedList<>();

        allSame.add(5);
        allSame.add(5);
        allSame.add(5);
        allSame.deleteAll(5);
        System.out.println(allSame.sum());

        LinkedList<Integer> dupList = new LinkedList<>();

        dupList.add(1);
        dupList.add(3);
        dupList.add(1);
        dupList.add(2);
        dupList.add(3);
        dupList.deleteAllDuplicates();
        dupList.printRecursive();

        LinkedList<Integer> sortList = new LinkedList<>();

        sortList.add(4);
        sortList.add(1);
        sortList.add(3);
        sortList.add(2);
        sortList.sort();
        sortList.printRecursive();

        LinkedList<Integer> insList = new LinkedList<>();

        insList.add(1);
        insList.add(3);
        insList.add(5);
        insList.insertSorted(4);
        insList.printRecursive();

        System.out.println(sortList.toArray());

        LinkedList<Integer> a = new LinkedList<>();

        a.add(1);
        a.add(2);

        LinkedList<Integer> b = new LinkedList<>();

        b.add(3);
        b.add(4);
        a.addList(b);
        a.printRecursive();
    }
}