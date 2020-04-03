package general_utility_programs;

import java.util.Scanner;

public class SpyNumber {
    public static int sum(int n) {
        int f;
        int sum = 0;
        while (n > 0) {
            f = n % 10;
            sum  = sum + f;
            n = n / 10;
        }
        return sum;
    }

    public static int product(int n) {
        int f;
        int product = 1;
        while (n > 0) {
            f = n % 10;
            product = product * f;
            n = n / 10;
        }

        return product;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        int sumOfNumber = sum(n);
        int productOfNumber = product(n);
        if (sumOfNumber == productOfNumber) {
            System.out.println("Spy NUmber");
        } else {
            System.out.println("Not a Spy Number");
        }

    }
}
