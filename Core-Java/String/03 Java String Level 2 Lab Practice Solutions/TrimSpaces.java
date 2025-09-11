
// Write a program to trim the leading and trailing spaces from a string using the charAt() method

import java.util.Scanner;

class TrimSpaces {
    public static String trimCustom(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;
        String result = "";
        for (int i = start; i <= end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();
        String custom = trimCustom(text);
        String builtin = text.trim();
        System.out.println("Custom trim: '" + custom + "'");
        System.out.println("Built-in trim: '" + builtin + "'");
        System.out.println("Equal? " + custom.equals(builtin));
    }
}
