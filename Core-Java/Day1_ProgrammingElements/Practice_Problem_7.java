import java.util.Scanner;

public class Practice_Problem_7 {
    public static void main(String args[]){
        
		//Self Problems
		//Q2. Perimeter of Rectangle
		Scanner sc = new Scanner(System.in);
        double rLength=sc.nextDouble();
		double rWidth=sc.nextDouble();
		double rPerimeter=2*(rLength + rWidth);
		System.out.println("Perimeter of Rectangle is: "	+rPerimeter);
        sc.close();

    }
}
