package conversions_important_left;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int decimal = scan.nextInt();

        String s = Integer.toBinaryString(decimal);
        int len = 8 - s.length();
        s = "0".repeat(len) + s;

        System.out.println(s);
    }
}

class DecimalToHexaDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine().trim();

    }
}

