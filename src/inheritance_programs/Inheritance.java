package inheritance_programs;


public class Inheritance {
    int a = 10;

    public void displaySuper() {
        System.out.println("Value of a" + a);
    }
}

class Sub_class extends Inheritance {
    public void displaysub() {
        System.out.println("value of a" + a);
    }
}

class SingleInheritance extends Inheritance2{
    public static void main(String[] args) {
        Sub_class sub = new Sub_class();
        sub.displaySuper();
        sub.displaysub();

    }
}
