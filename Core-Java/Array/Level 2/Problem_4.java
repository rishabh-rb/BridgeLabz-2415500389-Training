import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        int maxDigit = 10;
        int[] digits2 = new int[maxDigit];
        int idx2 = 0;
        while (num2 != 0) {
            if (idx2 == maxDigit) {
                maxDigit = maxDigit + 10;
                int[] temp = new int[maxDigit];
                for (int j = 0; j < digits2.length; j++) temp[j] = digits2[j];
                digits2 = temp;
            }
            digits2[idx2] = num2 % 10;
            num2 = num2 / 10;
            idx2++;
        }
        int largest2 = 0, second2 = 0;
        for (int i = 0; i < idx2; i++) {
            if (digits2[i] > largest2) {
                second2 = largest2;
                largest2 = digits2[i];
            } else if (digits2[i] > second2 && digits2[i] != largest2) {
                second2 = digits2[i];
            }
        }
        System.out.println("Largest = " + largest2 + ", Second Largest = " + second2);
        sc.close();
    }
}
