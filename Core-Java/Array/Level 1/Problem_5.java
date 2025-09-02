import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        for (int i = 6; i <= 9; i++) System.out.println(num2 + " * " + i + " = " + (num2 * i));
        sc.close();
    }
}
