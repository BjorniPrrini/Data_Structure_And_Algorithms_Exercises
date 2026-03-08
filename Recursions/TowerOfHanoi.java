package Recursions;

public class TowerOfHanoi {
    public static void main(String[] args) {
        swap(3, 'A', 'B', 'C');
    }

    private static void swap(int n, char from, char to, char help){
        if(n == 1){
            System.out.println("Move disk 1 " + from + " -> " + to);

            return;
        }

        swap(n - 1, from, help, to);

        System.out.println("Move disk " + n + " " + from + " -> " + to);

        swap(n - 1, help, to, from);
    }
}