
// Write a program to convert the complete text to lowercase and compare the results

import java.util.Scanner;

class ToLowerCaseCompare {
    public static String toLowerCustom(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32);
            }
            result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = sc.nextLine();

        String custom = toLowerCustom(str);
        String builtin = str.toLowerCase();

        System.out.println("Custom lowercase: " + custom);
        System.out.println("Built-in lowercase: " + builtin);
        System.out.println("Equal? " + custom.equals(builtin));
    }
}
