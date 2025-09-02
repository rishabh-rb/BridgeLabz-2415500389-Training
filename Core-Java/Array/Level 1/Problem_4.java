import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vals = new double[10];
        double total = 0;
        int index = 0;
        while (true) {
            double val = sc.nextDouble();
            if (val <= 0 || index == 10) break;
            vals[index] = val;
            index++;
        }
        for (int i = 0; i < index; i++) total += vals[i];
        System.out.println("Total: " + total);
        sc.close();
    }
}
