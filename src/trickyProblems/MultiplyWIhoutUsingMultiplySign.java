package trickyProblems;

import java.util.Scanner;

public class MultiplyWIhoutUsingMultiplySign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        int mul = 0;

        for (int i = 1; i <= number2; i++) {
            mul = mul + number1;
        }

        System.out.println(mul);
    }
}
