package exception_handling;

import java.util.Random;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 10;
        int b, result;
        Random r = new Random();

        if (r.nextBoolean()) {
            b = 0;
        } else {
            b = 2;
        }

        try {
            result = a / b;
            System.out.println("try box executes no excepton");

        } catch(Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Always Executes");
        }

    }
}
