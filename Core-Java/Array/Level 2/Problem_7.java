import java.util.Scanner;

public class Problem_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int persons2 = sc.nextInt();
        double[][] personData = new double[persons2][3];
        String[] status2 = new String[persons2];
        for (int i = 0; i < persons2; i++) {
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            if (w <= 0 || h <= 0) { i--; continue; }
            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = w / (h * h);
            if (personData[i][2] < 18.5) status2[i] = "Underweight";
            else if (personData[i][2] < 24.9) status2[i] = "Normal";
            else if (personData[i][2] < 39.9) status2[i] = "Overweight";
            else status2[i] = "Obese";
        }
        for (int i = 0; i < persons2; i++)
            System.out.println("H=" + personData[i][1] + " W=" + personData[i][0] + " BMI=" + personData[i][2] + " Status=" + status2[i]);
        sc.close();
    }
}
