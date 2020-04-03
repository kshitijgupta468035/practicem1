package general_utility_programs;

import java.util.Scanner;

public class VolumeCuboid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length, breath, height");
        int l = scan.nextInt();
        int b = scan.nextInt();
        int h = scan.nextInt();
        int volume = l * b * h;
        System.out.println("Volume " + volume);

    }
}
