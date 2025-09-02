import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] service = new double[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];
        double totalBonus = 0, totalOld = 0, totalNew = 0;
        for (int i = 0; i < 10; i++) {
            double s = sc.nextDouble();
            double y = sc.nextDouble();
            if (s <= 0 || y < 0) { i--; continue; }
            salary[i] = s; service[i] = y;
        }
        for (int i = 0; i < 10; i++) {
            if (service[i] > 5) 
            {
                bonus[i] = salary[i] * 0.05;
            }
            else 
            {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i]; totalOld += salary[i]; totalNew += newSalary[i];
        }
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOld);
        System.out.println("Total New Salary = " + totalNew);
        sc.close();
    }
}
