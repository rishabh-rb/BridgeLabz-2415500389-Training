import java.util.Scanner;

public class Level_2_Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / (2.54 * 2.54); // 1 in = 2.54 cm → 1 sq in = 6.4516 sq cm

        System.out.println("The Area of the triangle in sq cm is " + areaCm + " and sq in is " + areaInches);
        input.close();
    }
}
