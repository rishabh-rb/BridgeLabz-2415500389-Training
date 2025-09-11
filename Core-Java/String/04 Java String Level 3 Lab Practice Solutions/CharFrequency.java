// Write a program to find the frequency of characters in a string using the charAt() method and display the result

import java.util.Scanner;

class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;
        System.out.println("Character frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) System.out.println((char)i + " -> " + freq[i]);
        }
    }
}
