import java.util.Scanner;

public class Problem_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num4 = sc.nextInt();
        int[] freq = new int[10];
        while (num4 != 0) {
            int d = num4 % 10;
            freq[d]++;
            num4 = num4 / 10;
        }
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) System.out.println("Digit " + i + " occurs " + freq[i] + " times");
        }
        sc.close();
    }
}
