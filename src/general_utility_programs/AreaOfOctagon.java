package general_utility_programs;

import java.util.Scanner;

public class AreaOfOctagon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int side = scan.nextInt();
        double area = 2 * (1 + Math.sqrt(2)) * side * side;
        System.out.println("Octagon Area " + 2 * (1 + Math.sqrt(2)) * side * side);
    }
}
