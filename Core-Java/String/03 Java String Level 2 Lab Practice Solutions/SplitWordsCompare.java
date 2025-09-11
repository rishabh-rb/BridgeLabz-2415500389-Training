
// Write a program to split the text into words, compare the result with the split() method and display the result 

import java.util.Scanner;

class SplitWordsCompare {
    public static String[] splitWords(String text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') count++;
        }
        String[] words = new String[count];
        int index = 0;
        String current = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = current;
                current = "";
            } else {
                current += text.charAt(i);
            }
        }
        words[index] = current;
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] custom = splitWords(text);
        String[] builtin = text.split(" ");
        System.out.println("Arrays equal? " + compareArrays(custom, builtin));
    }
}
