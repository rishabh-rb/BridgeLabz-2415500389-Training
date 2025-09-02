import java.util.Scanner;

public class Problem_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number4 = sc.nextInt();
        int[] factors = new int[10];
        int factorIndex = 0;
        for (int i = 1; i <= number4; i++) {
            if (number4 % i == 0) {
                if (factorIndex == factors.length) {
                    int[] temp = new int[factors.length * 2];
                    for (int j = 0; j < factors.length; j++) temp[j] = factors[j];
                    factors = temp;
                }
                factors[factorIndex++] = i;
            }
        }
        System.out.print("Factors: ");
        for (int i = 0; i < factorIndex; i++) System.out.print(factors[i] + " ");
        System.out.println();
        sc.close();
    }
}
