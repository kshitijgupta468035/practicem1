package general_utility_programs;

import java.util.Scanner;

public class AreaOfHeagon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side");
        int side = scan.nextInt();
        double area = (3 * Math.sqrt(3) * side * side) / 2;
        System.out.println(area);
    }
}
