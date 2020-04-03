package trickyProblems;

import java.util.Scanner;

public class AddTwoNUmbersUsingBitWise {
    public static int add(int number1, int number2) {
        int sum = number1 ^ number2;
        int carry = number1 & number2;

        while (carry != 0) {
            carry <<= 1;
            number1 = sum;
            number2 = carry;

            sum = number1 ^ number2;
            carry = number1 & number2;
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        System.out.println("Addition is " + (number1 + number2));

        System.out.println(add(number1, number2));

    }
}
