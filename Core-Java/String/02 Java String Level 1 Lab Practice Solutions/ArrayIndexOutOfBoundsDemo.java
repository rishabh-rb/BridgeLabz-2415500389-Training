
// Write a program to demonstrate ArrayIndexOutOfBoundsException

import java.util.Scanner;

class ArrayIndexOutOfBoundsDemo {
    public static void generateException(String[] arr) {
        System.out.println(arr[arr.length]);
    }

    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"A","B","C"};
        // generateException(arr);
        handleException(arr);
    }
}
