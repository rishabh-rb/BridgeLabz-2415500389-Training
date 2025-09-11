// Write a program to find the frequency of characters in a string using nested loops and display the result

import java.util.Scanner;

class CharFrequencyNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            for (int j = i+1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                System.out.println(chars[i] + " -> " + freq[i]);
            }
        }
    }
}
