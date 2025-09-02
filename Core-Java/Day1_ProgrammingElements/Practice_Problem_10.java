import java.util.Scanner;

public class Practice_Problem_10 {
    public static void main(String args[]){
            
        //Self Problems
        //Q5. Kilometer to Miles
        Scanner sc = new Scanner(System.in);
        double km=sc.nextDouble();
        double mile=km * 0.621371;
        System.out.println(km+" in miles is: "+mile);
        sc.close();

    }
}
