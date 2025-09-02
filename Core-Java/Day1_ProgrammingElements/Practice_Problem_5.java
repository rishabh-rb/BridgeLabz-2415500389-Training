import java.util.Scanner;

public class Practice_Problem_5 {
    public static void main(String args[]){

		//Q5. Volume of cylinder
		Scanner sc = new Scanner(System.in);
        double pi=22/7;
        double radCylinder=sc.nextDouble();
		double heightCylinder=sc.nextDouble();
		double vol=pi * Math.pow(radCylinder, 2)*heightCylinder;
		System.out.println("Volume of cylinder is: "+vol);
        sc.close();

    }
}
