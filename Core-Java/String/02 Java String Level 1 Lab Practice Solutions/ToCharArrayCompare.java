
// Write a program to return all the characters in a string using a user-defined method, 
// compare the result with the String built-in toCharArray() method, and display the result

import java.util.Scanner;

class ToCharArrayCompare {
    public static char[] customToCharArray(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        char[] arr1 = customToCharArray(str);
        char[] arr2 = str.toCharArray();

        System.out.println("Arrays equal? " + compareArrays(arr1, arr2));
    }
}
