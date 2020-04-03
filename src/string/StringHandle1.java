package string;

import java.util.Scanner;

public class StringHandle1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string1 = scan.nextLine();
        System.out.print("Index : ");
        for (int i = 0; i < string1.length(); i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n" + "Chars : ");
        for (int i = 0; i < string1.length(); i++) {
            System.out.print(string1.charAt(i) + " ");
        }
    }
}
