package patterns_Important;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        for (int i = size; i >= -size; i--) {
            for (int j = size; j >= Math.abs(i); j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


