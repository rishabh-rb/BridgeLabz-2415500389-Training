import java.util.Scanner;

public class Level_2_Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = input.nextInt();

        System.out.print("Enter b: ");
        int b = input.nextInt();

        System.out.print("Enter c: ");
        int c = input.nextInt();

        int result1 = a + b * c;      // multiplication has higher precedence
        int result2 = a * b + c;
        int result3 = c + a / b;      // division first, then addition
        int result4 = a % b + c;      // modulus first, then addition

        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", " + result4);
        input.close();
    }
}
