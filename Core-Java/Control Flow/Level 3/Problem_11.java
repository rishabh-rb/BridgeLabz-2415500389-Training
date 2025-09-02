import java.util.Scanner;
public class Problem_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter day (1-31): ");
        int d = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100; 
        int j = y / 100; 

        int dayOfWeek = (d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + 5 * j) % 7;

        int dow = (dayOfWeek + 6) % 7;

        System.out.println("Day of the week (0=Sunday, 1=Monday, ... 6=Saturday): " + dow);
        sc.close();
    }
}
