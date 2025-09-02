import java.util.Scanner;

public class Problem_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int students = sc.nextInt();
        int[] phy = new int[students];
        int[] chem = new int[students];
        int[] math = new int[students];
        double[] perc = new double[students];
        char[] grade = new char[students];
        for (int i = 0; i < students; i++) {
            phy[i] = sc.nextInt();
            chem[i] = sc.nextInt();
            math[i] = sc.nextInt();
            if (phy[i] < 0 || chem[i] < 0 || math[i] < 0) { i--; continue; }
            perc[i] = (phy[i] + chem[i] + math[i]) / 3.0;
            if (perc[i] >= 90) grade[i] = 'A';
            else if (perc[i] >= 75) grade[i] = 'B';
            else if (perc[i] >= 50) grade[i] = 'C';
            else grade[i] = 'D';
        }
        for (int i = 0; i < students; i++)
            System.out.println("Phy=" + phy[i] + " Chem=" + chem[i] + " Math=" + math[i] + " %=" + perc[i] + " Grade=" + grade[i]);
        sc.close();
    }
}
