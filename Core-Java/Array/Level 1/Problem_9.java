import java.util.Scanner;

public class Problem_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) for (int j = 0; j < cols; j++) matrix[i][j] = sc.nextInt();
        int[] array1D = new int[rows * cols];
        int idx = 0;
        for (int i = 0; i < rows; i++) for (int j = 0; j < cols; j++) array1D[idx++] = matrix[i][j];
        System.out.print("1D Array: ");
        for (int i = 0; i < array1D.length; i++) System.out.print(array1D[i] + " ");
        System.out.println();
        sc.close();
    }
}
