package constructor_programs;

import java.util.Scanner;

public class Constructor3 {
    int eligibleAge;

    public Constructor3(int age) {
        eligibleAge = age;
    }

    public void isEligible(int user_age) {
        if (user_age >= eligibleAge) {
            System.out.println("You are eligible for voting");
        } else {
            System.out.println("You are not eligible for voting");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eligibleAge = 18;

        boolean b = true;
        while (b) {
            int personAge = scan.nextInt();

            if (personAge <= 0) {
                b = false;
                break;
            }

            Constructor3 con = new Constructor3(eligibleAge);
            con.isEligible(personAge);
        }
    }
}
