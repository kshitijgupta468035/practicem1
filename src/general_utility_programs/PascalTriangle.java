package general_utility_programs;

import java.util.Scanner;

public class PascalTriangle {

    public static int fact(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int line = scan.nextInt();
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + fact(i) / (fact(j) * fact(i - j)));
            }
            System.out.println();
        }
    }
}
