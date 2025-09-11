
// Write a program to find and return the length of a string without using the length() method 

import java.util.Scanner;

class StringLength {
    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        int length = getLength(str);
        System.out.println("Length using custom method: " + length);
        System.out.println("Length using built-in method: " + str.length());
    }
}
