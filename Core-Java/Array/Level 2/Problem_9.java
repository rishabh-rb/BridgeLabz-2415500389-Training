import java.util.Scanner;

public class Problem_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students2 = sc.nextInt();
        int[][] marks = new int[students2][3];
        double[] perc2 = new double[students2];
        char[] grade2 = new char[students2];
        for (int i = 0; i < students2; i++) {
            for (int j = 0; j < 3; j++) marks[i][j] = sc.nextInt();
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) { i--; continue; }
            perc2[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if (perc2[i] >= 90) grade2[i] = 'A';
            else if (perc2[i] >= 75) grade2[i] = 'B';
            else if (perc2[i] >= 50) grade2[i] = 'C';
            else grade2[i] = 'D';
        }
        for (int i = 0; i < students2; i++)
            System.out.println("Phy=" + marks[i][0] + " Chem=" + marks[i][1] + " Math=" + marks[i][2] + " %=" + perc2[i] + " Grade=" + grade2[i]);
        sc.close();
    }   
}
