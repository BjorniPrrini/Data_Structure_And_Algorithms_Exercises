package Recursions;

import java.util.Scanner;

public class RecursivePalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter palindrome: ");
        String palindrome = scanner.next();

        System.out.println("Is palindrome: " + palindrome(palindrome));

        scanner.close();
    }

    public static boolean palindrome(String palindromeString){
        if(palindromeString.length() <= 1){
            return true;
        }else if(palindromeString.charAt(0) != palindromeString.charAt(palindromeString.length() - 1)){
            return false;
        }

        return palindrome(palindromeString.substring(1, palindromeString.length() - 1));
    }
}