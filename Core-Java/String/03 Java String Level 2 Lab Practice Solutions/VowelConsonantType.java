
// Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter

import java.util.Scanner;

class VowelConsonantType {
    public static String typeOfChar(char c) {
        if (Character.isLetter(c)) {
            char lower = Character.toLowerCase(c);
            if ("aeiou".indexOf(lower) != -1) return "Vowel";
            else return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            System.out.println(c + " -> " + typeOfChar(c));
        }
    }
}
