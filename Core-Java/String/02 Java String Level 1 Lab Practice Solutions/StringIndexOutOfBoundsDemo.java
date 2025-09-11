
// Write a program to demonstrate StringIndexOutOfBoundsException

import java.util.Scanner;

class StringIndexOutOfBoundsDemo {
    public static void generateException(String s) {
        System.out.println(s.charAt(s.length()));
    }

    public static void handleException(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException!");
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
