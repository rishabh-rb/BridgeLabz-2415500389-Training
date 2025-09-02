import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] digits = new int[10];
        int idx = 0;
        while (num != 0 && idx < 10) {
            digits[idx] = num % 10;
            num = num / 10;
            idx++;
        }
        int largest = 0, second = 0;
        for (int i = 0; i < idx; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }
        System.out.println("Largest = " + largest + ", Second Largest = " + second);
        sc.close();
    }
}
