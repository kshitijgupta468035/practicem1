package general_utility_programs;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = scan.nextInt();
        int sum = 0;
        int f;
        while (n > 0) {
            f = n % 10;
            sum  = sum + f;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
