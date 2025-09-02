import java.util.Scanner;

public class Practice_Problem_9 {
    public static void main(String args[]){
        
        //Self Problems
    	//Q4. Average
		Scanner sc = new Scanner(System.in);
        double one=sc.nextDouble();
		double two=sc.nextDouble();
		double three=sc.nextDouble();
		double avg=(one + two + three)/3;
		System.out.println("Average of "+one+","+two+" and "+three+" is: "+avg);
        sc.close();

    }
}
