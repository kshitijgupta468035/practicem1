package general_utility_programs;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b =1;
        int n = scan.nextInt();
        int c ;
        System.out.println(a);
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }

    }
}
