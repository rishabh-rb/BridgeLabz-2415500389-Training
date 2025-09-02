import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int count = 0;
        int originalNumber = number;  

        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number /= 10;  
                count++;        
            }
        }

        System.out.println("Number of digits in " + originalNumber + " is: " + count);
        sc.close();
    }
}
