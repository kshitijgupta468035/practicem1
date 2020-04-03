package general_utility_programs;

import java.util.Scanner;

public class TrimorphicNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = scan.nextInt();
        int cube = n * n * n;
        int num = n;
        int f;
        int t = 10;
        boolean flag = false;

        while (n > 0) {
            f = cube % t;
            if (f == num) {
                flag = true;
                break;
            }
            n = n / 10;
            t = t * 10;
        }

        if (flag == true) {
            System.out.println("trimorphic");
        } else {
            System.out.println("Not");
        }
    }
}
