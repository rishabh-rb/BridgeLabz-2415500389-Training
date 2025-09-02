import java.util.Scanner;

public class Problem_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number3 = sc.nextInt();
        if (number3 <= 0) 
        {
            sc.close();
            return;
        }
        int[] odds = new int[number3];
        int[] evens = new int[number3];
        int oddIndex = 0, evenIndex = 0;
        for (int i = 1; i <= number3; i++) 
        {
            if (i % 2 == 0) evens[evenIndex++] = i;
            else odds[oddIndex++] = i;
        }
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) System.out.print(odds[i] + " ");
        System.out.println();
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) System.out.print(evens[i] + " ");
        System.out.println();
        sc.close();
    }
}
