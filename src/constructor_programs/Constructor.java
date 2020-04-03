package constructor_programs;

public class Constructor {
    public Constructor() {
        System.out.println("Hello from Constructor");
    }

    public void my_method() {
        System.out.println("hello from Method");
    }

    public static void main(String[] args) {
        Constructor con = new Constructor();
        con.my_method();


    }
}
