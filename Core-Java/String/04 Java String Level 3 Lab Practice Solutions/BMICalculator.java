// An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members.

import java.util.Scanner;

class BMICalculator {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String status(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] people = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) and height(cm) of person " + (i+1) + ": ");
            people[i][0] = sc.nextDouble();
            people[i][1] = sc.nextDouble();
        }
        System.out.println("Weight\tHeight\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            double bmi = calculateBMI(people[i][0], people[i][1]);
            System.out.println(people[i][0] + "\t" + people[i][1] + "\t" + String.format("%.2f", bmi) + "\t" + status(bmi));
        }
    }
}
