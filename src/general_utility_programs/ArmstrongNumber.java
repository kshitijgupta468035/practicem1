package general_utility_programs;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        int g = n;
        int f;
        int value = 0;
        while (n > 0) {
            f = n % 10;
            value = 10 * value + f;
            n = n / 10;
        }

        if (value == g) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not a Armstrong number");
        }
    }
}
