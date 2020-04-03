package constructor_programs;

import java.util.Scanner;

public class Constructor4 {
    private int a;

    public Constructor4() {
        System.out.println("Constructor with no Argument" + "\n" + "Default Constructor");
    }

    public Constructor4(int i) {
        System.out.println("Constructor with Argument" + i);
        a = i;
    }

    public Constructor4(int i, int j) {
        System.out.println("Constructor with two Arguments" + i + " " + j);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();

        Constructor4 con = new Constructor4();
        Constructor4 con1 = new Constructor4(i);
        Constructor4 con2 = new Constructor4(i, j);

    }
}
