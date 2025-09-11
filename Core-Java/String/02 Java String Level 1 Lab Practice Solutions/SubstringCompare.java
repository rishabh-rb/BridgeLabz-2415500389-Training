
// Write a program to create a substring from a String using the charAt() method. 
// Also, use the String built-in method substring() to find the substring of the text. 
// Finally compare the two strings and display the results

import java.util.Scanner;

class SubstringCompare {
    public static String substringUsingCharAt(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String sub1 = substringUsingCharAt(str, start, end);
        String sub2 = str.substring(start, end);

        System.out.println("Substring using charAt: " + sub1);
        System.out.println("Substring using built-in: " + sub2);
        System.out.println("Are both substrings equal? " + sub1.equals(sub2));
    }
}
