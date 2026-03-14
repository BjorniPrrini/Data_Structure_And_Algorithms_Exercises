package LinkedList.Question_4;

public class DoubleLinkedListIterator {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();

        list.append(10);
        list.append(20);
        list.append(30);
        printList(list);

        list.add(1, 15);
        printList(list);

        list.add(0, 5);
        printList(list);

        Integer oldValue = list.set(2, 99);
        System.out.println("Replaced: " + oldValue);
        printList(list);

        Integer removed = list.remove(3);
        System.out.println("Removed: " + removed);
        printList(list);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.append(50);
        list2.append(60);
        list2.append(70);

        list.addAll(list2);
        printList(list);

        DoubleLinkedList<Integer> list3 = new DoubleLinkedList<>();
        list3.append(111);
        list3.append(222);

        list.addAll(2, list3);
        printList(list);

        DoubleLinkedList<Integer> removeList = new DoubleLinkedList<>();
        removeList.append(99);
        removeList.append(50);

        list.removeAll(removeList);
        printList(list);

        DoubleLinkedList<Integer> retainList = new DoubleLinkedList<>();
        retainList.append(10);
        retainList.append(60);
        retainList.append(222);

        list.retainAll(retainList);
        printList(list);
    }

    public static void printList(DoubleLinkedList<Integer> list){
        Node<Integer> curr = list.head;

        System.out.print("List: ");

        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

        System.out.println();
    }
}