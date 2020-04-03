package exception_handling;

public class Try_Catch_Block {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = a / 0;
        } catch(ArithmeticException e) {
            System.out.println("Exception Occured : Divide by Zero");
        }
    }
}
