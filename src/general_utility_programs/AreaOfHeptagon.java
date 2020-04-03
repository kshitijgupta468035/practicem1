package general_utility_programs;

import java.util.Scanner;

public class AreaOfHeptagon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side");
        int side = scan.nextInt();
        System.out.println("Enter Apothem");
        double apothem = scan.nextDouble();
        double area = (7 * side * apothem) / 2;
        System.out.println("Heptagon area " + area );
    }
}
