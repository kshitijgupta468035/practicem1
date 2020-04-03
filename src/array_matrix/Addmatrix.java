package array_matrix;

import java.util.Scanner;

public class Addmatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = scan.nextInt();
                matrix2[i][j] = scan.nextInt();
            }
        }
        int[][] matrix3 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
