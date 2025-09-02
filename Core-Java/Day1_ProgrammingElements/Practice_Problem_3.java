import java.util.Scanner;

public class Practice_Problem_3 {
    public static void main(String args[]){
        
		//Q3. Celsius to Fahrenheit
		Scanner sc = new Scanner(System.in);
        double cTemp=sc.nextDouble();
		double fTemp=(cTemp * 9/5)+32;
		System.out.println("Temperature in fahrenheit is: "+fTemp);
        sc.close();

    }
}
