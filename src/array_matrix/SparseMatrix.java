package array_matrix;

import java.util.Scanner;

public class SparseMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        do {
            int n = scan.nextInt();
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scan.nextInt();
                }
            }

            int count = 0;
            int number = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == 0) {
                        count++;
                    } else {
                        number++;
                    }
                }
            }
            if (count > number) {
                System.out.println("Sparse");
            } else {
                System.out.println("Non sparse");
            }
            System.out.println("If you want to check another matrix +" +
                    " press y other wise n");
            scan.nextLine();
            String c = scan.nextLine();
            if (c.charAt(0) == 'y') {
                flag = true;
            }
            else if (c.charAt(0) == 'n') {
                flag = false;
            } else {
                System.out.print("Invalid Input");
            }
        } while (flag);
    }
}
