import java.util.Scanner;

public class Problem_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number5 = sc.nextInt();
        if (number5 <= 0) 
        {
            sc.close();
            return;
        }
        for (int i = 0; i <= number5; i++) {
            System.out.print("Position " + i + " = ");
            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
        sc.close();
    }
}
