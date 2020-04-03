package general_utility_programs;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the rows of FloydTriangle");
        int n = scan.nextInt();
        int a = 1;
        for(int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}
