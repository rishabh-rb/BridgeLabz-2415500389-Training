
// Write a program to take user input for the age of all 10 students in a class and check whether the student can vote

import java.util.Scanner;

class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i+1) + ": ");
            ages[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Student " + (i+1) + " age " + ages[i] + " can vote? " + (ages[i] >= 18));
        }
    }
}
