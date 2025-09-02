import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];
        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextInt();
        }
        int youngest = 0, tallest = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngest]) youngest = i;
            if (height[i] > height[tallest]) tallest = i;
        }
        String[] names = {"Amar","Akbar","Anthony"};
        System.out.println("Youngest: " + names[youngest]);
        System.out.println("Tallest: " + names[tallest]);
        sc.close();
    }
}
