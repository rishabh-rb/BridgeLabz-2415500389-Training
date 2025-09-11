
// Write a program to demonstrate IllegalArgumentException

import java.util.Scanner;

class IllegalArgumentDemo {
    public static void generateException(String s) {
        System.out.println(s.substring(5, 2));
    }

    public static void handleException(String s) {
        try {
            System.out.println(s.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        // generateException(str);
        handleException(str);
    }
}
