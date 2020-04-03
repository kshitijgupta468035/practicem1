package array_matrix;

import java.util.Scanner;

public class CommandLineARgs {
    public static void main(String[] args) {
        //int a = Integer.parseInt(input[0]);
        //int b = Integer.parseInt(input[1]);
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        int day = scan.nextInt();
        int month = scan.nextInt();
        System.out.println(n + " " + day + " " + month);
    }
}
