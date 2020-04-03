package exception_handling;

public class Throw_throws2 {
    public static void method() throws newException {
        throw new newException();
    }

    public static void main(String[] args) {
        try {
            method();
        } catch(newException e) {
            System.out.println("New Exception Caught: " + e);
        }
    }
}

class newException extends Exception {

}
