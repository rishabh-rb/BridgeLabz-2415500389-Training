import java.util.Scanner;

public class Practice_Problem_4 {
    public static void main(String args[]){
        
		//Q4. Area of circle
        Scanner sc = new Scanner(System.in);
		double rad=sc.nextDouble();
		double pi=22/7;
		double area= pi * Math.pow(rad, 2);
		System.out.println("Area of circle is: "+area);
        sc.close();
    }
}
