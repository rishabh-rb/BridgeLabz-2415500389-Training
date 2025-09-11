
// Write a program to demonstrate NumberFormatException

import java.util.Scanner;

class NumberFormatDemo {
    public static void generateException(String s) {
        int num = Integer.parseInt(s);
        System.out.println(num);
    }

    public static void handleException(String s) {
        try {
            int num = Integer.parseInt(s);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException!");
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
