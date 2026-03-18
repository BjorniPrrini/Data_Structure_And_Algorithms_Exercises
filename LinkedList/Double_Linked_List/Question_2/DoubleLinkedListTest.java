package LinkedList.Double_Linked_List.Question_2;

public class DoubleLinkedListTest {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        list.printForward();
        
        list.printBackward();
        
        System.out.println(list.size());
        
        System.out.println(list.search(2));
        System.out.println(list.search(99));

        list.insertAtFront(0);
        list.printForward();
        
        list.insertAtEnd(4);
        list.printForward();

        list.insertBefore(2, 99);
        list.printForward();

        list.delete(99);
        list.printForward();
        
        list.delete(0);
        list.printForward();

        list.delete(4);
        list.printForward();
        
        System.out.println(list.hasDuplicates());
        
        list.add(2);

        System.out.println(list.hasDuplicates());
        
        list.add(3);
        list.add(3);
        list.printForward();

        list.removeDuplicates();
        list.printForward();

        list.printBackward();

        DoubleLinkedList<Integer> empty = new DoubleLinkedList<>();

        System.out.println(empty.size());

        System.out.println(empty.search(1));

        System.out.println(empty.hasDuplicates());

        empty.delete(1);
        
        empty.removeDuplicates();
    }
}