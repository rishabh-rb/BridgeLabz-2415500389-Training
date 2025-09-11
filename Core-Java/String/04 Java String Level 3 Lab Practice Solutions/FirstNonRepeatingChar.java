// Write a program to find the first non-repeating character in a string and show the result

import java.util.Scanner;

class FirstNonRepeatingChar {
    public static char firstNonRepeating(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) return s.charAt(i);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char res = firstNonRepeating(text);
        if (res != 0) System.out.println("First non-repeating character: " + res);
        else System.out.println("No non-repeating character found.");
    }
}
