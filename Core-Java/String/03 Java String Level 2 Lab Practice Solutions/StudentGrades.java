
// Write a program to take input marks of students in 3 subjects and compute percentage and grade

import java.util.Scanner;

class StudentGrades {
    public static String grade(double percentage) {
        if (percentage >= 90) return "A";
        else if (percentage >= 80) return "B";
        else if (percentage >= 70) return "C";
        else if (percentage >= 60) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics, Chemistry, Math marks for student " + (i+1) + ": ");
            scores[i][0] = sc.nextInt();
            scores[i][1] = sc.nextInt();
            scores[i][2] = sc.nextInt();
        }
        System.out.println("Student	Total	Percentage	Grade");
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double percentage = total / 3.0;
            System.out.println((i+1) + "	" + total + "	" + String.format("%.2f", percentage) + "		" + grade(percentage));
        }
    }
}
