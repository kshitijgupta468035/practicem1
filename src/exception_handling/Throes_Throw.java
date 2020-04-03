package exception_handling;

public class Throes_Throw {

    public static void age(int personAge) throws Exception {
        if (personAge < 18) {
            throw new Exception("Age Error");
        } else {
            System.out.println("you can vote");
        }
    }

    public static void main(String[] args) throws Exception {
        age(12);
    }
}

