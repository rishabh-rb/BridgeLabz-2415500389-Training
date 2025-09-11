// Write a program to find the frequency of characters in a string using unique characters and display the result

import java.util.Scanner;

class CharFrequencyUnique {
    public static String uniqueChars(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (result.indexOf(c) == -1) result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String uniques = uniqueChars(text);
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;
        for (int i = 0; i < uniques.length(); i++) {
            char c = uniques.charAt(i);
            System.out.println(c + " -> " + freq[c]);
        }
    }
}
