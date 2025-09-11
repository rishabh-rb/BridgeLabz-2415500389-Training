// Find unique characters in a string using the charAt() method and display the result

import java.util.Scanner;

class UniqueCharacters {
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
        System.out.println("Unique characters: " + uniqueChars(text));
    }
}
