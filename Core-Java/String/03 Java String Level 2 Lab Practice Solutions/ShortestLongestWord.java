
// Write a program to split the text into words and find the shortest and longest strings in a given text

import java.util.Scanner;

class ShortestLongestWord {
    public static String[] splitWords(String text) {
        return text.split(" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String shortest = words[0], longest = words[0];
        for (String word : words) {
            if (word.length() < shortest.length()) shortest = word;
            if (word.length() > longest.length()) longest = word;
        }
        System.out.println("Shortest word: " + shortest);
        System.out.println("Longest word: " + longest);
    }
}
