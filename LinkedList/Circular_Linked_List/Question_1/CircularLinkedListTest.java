package LinkedList.Circular_Linked_List.Question_1;

public class CircularLinkedListTest {
    public static void main(String[] args) {
        CircularLinkedList<Integer> list = new CircularLinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();

        System.out.println(list.size());

        System.out.println(list.search(3));
        System.out.println(list.search(99));

        list.delete(3);
        list.print();

        list.delete(1);
        list.print();

        list.delete(5);
        list.print();

        CircularLinkedList<Integer> single = new CircularLinkedList<>();

        single.add(42);
        single.delete(42);
        System.out.println(single.size());

        CircularLinkedList<Integer> empty = new CircularLinkedList<>();

        empty.print();
        System.out.println(empty.size());
        System.out.println(empty.search(1));
        empty.delete(1);

        CircularLinkedList<Integer> robin = new CircularLinkedList<>();

        robin.add(1);
        robin.add(2);
        robin.add(3);
        robin.add(4);
        robin.add(5);
        robin.roundRobin(2);

        CircularLinkedList<Integer> robin2 = new CircularLinkedList<>();
        
        robin2.add(1);
        robin2.add(2);
        robin2.add(3);
        robin2.roundRobin(1);
    }
}