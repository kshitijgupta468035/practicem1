package general_utility_programs;

import java.util.Scanner;

public class fcatorail1toN {

    public static int factorial(int n) {
        int f =1;
        for (int i = 1; i <=n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = factorial(i+1);
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%5d : %d\n", i+1, array[i]);
        }
    }
}
