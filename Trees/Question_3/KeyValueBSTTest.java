package Trees.Question_3;

public class KeyValueBSTTest {
    public static void main(String[] args) {
        KeyValueBST<Integer, String> table = new KeyValueBST<Integer, String>();

        table.put(10, "ten");
        table.put(5, "five");
        table.put(15, "fifteen");
        table.put(3, "three");
        table.put(7, "seven");

        System.out.println(table.get(10));
        System.out.println(table.get(5));
        System.out.println(table.get(100));

        table.put(5, "FIVE");
        System.out.println(table.get(5));

        table.remove(3);
        System.out.println(table.get(3));

        table.remove(10);
        System.out.println(table.get(10));
        System.out.println(table.get(15));
    }
}