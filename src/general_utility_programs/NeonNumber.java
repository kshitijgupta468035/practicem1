package general_utility_programs;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        int square = n * n;
        int f;
        int sum = 0;
        while (square > 0) {
            f = square % 10;
            sum = sum + f;
            square = square / 10;
        }

        if (sum == n) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not a NeonNumber");
        }
    }
}
