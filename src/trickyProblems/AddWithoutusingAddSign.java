package trickyProblems;

import java.util.Scanner;

public class AddWithoutusingAddSign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        int add = number1 - (- number2);

        System.out.println("Addition of Numbers " + add);
    }
}
