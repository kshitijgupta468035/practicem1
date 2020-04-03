package general_utility_programs;

import java.util.Scanner;

public class PrimeNumberLogic1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c = c + 1;
            }
        }
        if (c == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
