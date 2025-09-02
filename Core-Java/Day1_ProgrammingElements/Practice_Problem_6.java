import java.util.Scanner;

public class Practice_Problem_6 {
    public static void main(String args[]){

		//Self Problems
		//Q1. Simple Interest
		Scanner sc = new Scanner(System.in);
        double principle=sc.nextDouble();
		double rate=sc.nextDouble();
		double time=sc.nextDouble();
		double si=(principle*rate*time)/100;
		System.out.println("Simple Interest is: "+si);	
        sc.close();
    }
}
