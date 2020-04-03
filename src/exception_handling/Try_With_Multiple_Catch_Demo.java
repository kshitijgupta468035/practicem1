package exception_handling;

import java.util.Scanner;

public class Try_With_Multiple_Catch_Demo {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);

            int a = 5;
            int b;
            int[] arr = {1,2,3,4};

            int choice = scan.nextInt();

            if (choice == 1) {
                b = a / 0;
            } else if(choice == 2) {
                b = arr[0]/arr[5];
            } else {
                System.out.println("Program executed without Exception");
            }
        } catch(ArithmeticException e) {
            System.out.println(e);
        } catch(ArrayIndexOutOfBoundsException arr) {
            System.out.println(arr);
        }
    }
}
