import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num3 = sc.nextInt();
        int temp = num3;
        int count = 0;
        while (temp != 0) { temp = temp / 10; count++; }
        int[] rev = new int[count];
        for (int i = 0; i < count; i++) {
            rev[i] = num3 % 10;
            num3 = num3 / 10;
        }
        System.out.print("Reversed: ");
        for (int i = 0; i < count; i++) System.out.print(rev[i]);
        System.out.println();
        sc.close();
    }
}
