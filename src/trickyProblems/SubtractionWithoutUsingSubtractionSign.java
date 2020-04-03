package trickyProblems;

import java.util.Scanner;

public class SubtractionWithoutUsingSubtractionSign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        int sub = number1 + (~number2 + 1);
        System.out.println(sub);
    }
}
