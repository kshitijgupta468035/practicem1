package constructor_programs;

public class Constructor6 {
    private static Constructor6 instance = null;

    private Constructor6() {
        // private Conctructor will prevent the creation of objects of this class directly
    }

    public static Constructor6 createObject() {
        // Logic which ensure that no more than one object can be created at a time

        if (instance == null) {
            instance = new Constructor6();
        }
        return instance;
    }

    public void msg() {
        System.out.println("Private Constructor Exampele");
    }

    public static void main(String[] args) {
        Constructor6 obj = Constructor6.createObject();
        obj.msg();

        //Objects can not be created directly because constructor is private;
        // Object can be created via method which contain code for only one object creation
    }
}
