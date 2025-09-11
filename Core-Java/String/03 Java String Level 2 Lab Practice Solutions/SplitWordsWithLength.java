
// Write a program to split the text into words and return the words along with their lengths in a 2D array

import java.util.Scanner;

class SplitWordsWithLength {
    public static String[] splitWords(String text) {
        return text.split(" ");
    }

    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] result = wordsWithLength(words);
        System.out.println("Word	Length");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "	" + result[i][1]);
        }
    }
}
