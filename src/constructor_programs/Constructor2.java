package constructor_programs;

import java.util.Scanner;

public class Constructor2 {
    int num;

    public Constructor2(int n) {
        num = n;
    }

    public void square() {
        System.out.println(num * num);
    }

    public void cube() {
        System.out.println(num * num * num);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Constructor2 con = new Constructor2(n);
        Constructor2 con2 = new Constructor2(n + 1);

        con.square();
        con.cube();
        con2.square();
        con2.cube();
    }
}
