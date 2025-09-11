
// Write a program to convert the complete text to uppercase and compare the results

import java.util.Scanner;

class ToUpperCaseCompare {
    public static String toUpperCustom(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - 32);
            }
            result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = sc.nextLine();

        String custom = toUpperCustom(str);
        String builtin = str.toUpperCase();

        System.out.println("Custom uppercase: " + custom);
        System.out.println("Built-in uppercase: " + builtin);
        System.out.println("Equal? " + custom.equals(builtin));
    }
}
