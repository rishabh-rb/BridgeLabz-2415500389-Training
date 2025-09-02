import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int persons = sc.nextInt();
        double[] weight = new double[persons];
        double[] heightP = new double[persons];
        double[] bmi = new double[persons];
        String[] status = new String[persons];
        for (int i = 0; i < persons; i++) {
            weight[i] = sc.nextDouble();
            heightP[i] = sc.nextDouble();
            bmi[i] = weight[i] / (heightP[i] * heightP[i]);
            if (bmi[i] <= 18.5) status[i] = "Underweight";
            else if (bmi[i] <= 24.9) status[i] = "Normal";
            else if (bmi[i] <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        for (int i = 0; i < persons; i++)
            System.out.println("H=" + heightP[i] + " W=" + weight[i] + " BMI=" + bmi[i] + " Status=" + status[i]);
        sc.close();
    }
}
