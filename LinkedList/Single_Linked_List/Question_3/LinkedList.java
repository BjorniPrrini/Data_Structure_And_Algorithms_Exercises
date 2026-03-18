package LinkedList.Single_Linked_List.Question_3;

public class LinkedList {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(20);
        list.append(40);

        System.out.println("Size: " + list.size());

        System.out.println("isEmpty: " + list.isEmpty());

        System.out.println("Exists 30: " + list.exists(30));
        System.out.println("Exists 99: " + list.exists(99));

        Object[] arr = list.toArray();

        System.out.print("toArray: ");

        for(Object o : arr){
            System.out.print(o + " ");
        }

        System.out.println("Value at index 1: " + list.getValueByIndex(1));
        System.out.println("Value at index 3: " + list.getValueByIndex(3));

        list.removeAtIndex(3);
        
        System.out.println("After removeAtIndex(3), size: " + list.size());
        System.out.println("Value at index 3 now: " + list.getValueByIndex(3));

        list.insertAtIndex(99, 2);
        System.out.println("After insertAtIndex(99, 2): " + list.getValueByIndex(2));

        System.out.println("indexOf(20): " + list.indexOf(20));

        System.out.println("lastIndexOf(20): " + list.lastIndexOf(20));
    }
}