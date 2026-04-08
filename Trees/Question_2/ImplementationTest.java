package Trees.Question_2;

public class ImplementationTest {
    public static void main(String[] args) {
        Implementation<Integer> tree = new Implementation<Integer>();

        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(20);

        System.out.println("contains 7: " + tree.contains(7));
        System.out.println("contains 100: " + tree.contains(100));

        System.out.println("isValid: " + tree.isValid());

        System.out.println("distance 3 to 7: " + tree.distance(3, 7));
        System.out.println("distance 3 to 20: " + tree.distance(3, 20));
        System.out.println("distance 5 to 5: " + tree.distance(5, 5));
        System.out.println("distance 3 to 100: " + tree.distance(3, 100));

        System.out.println("root balance factor: " + tree.rootBalanceFactor());

        System.out.println("all balance factors:");
        tree.calculateAllBalanceFactors();

        tree.remove(3);
        System.out.println("contains 3 after remove: " + tree.contains(3));
        System.out.println("isValid after remove 3: " + tree.isValid());

        tree.remove(15);
        System.out.println("contains 15 after remove: " + tree.contains(15));
        System.out.println("isValid after remove 15: " + tree.isValid());

        System.out.println("distance 7 to 20 after removals: " + tree.distance(7, 20));
        System.out.println("root balance factor after removals: " + tree.rootBalanceFactor());

        System.out.println("all balance factors after removals:");
        tree.calculateAllBalanceFactors();
    }
}