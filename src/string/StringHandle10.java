package string;

import java.util.Scanner;

public class StringHandle10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        char character = scan.nextLine().trim().charAt(0);
        System.out.println(inputString.indexOf(character));
    }
}
