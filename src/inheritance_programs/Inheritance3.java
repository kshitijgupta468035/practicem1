package inheritance_programs;

public class Inheritance3 {
    int a = 10;
    int total = 0;

    public void funA() {
        System.out.println("value of a " + a);
        System.out.println("value of total " + total);
    }
}

class C extends Inheritance3 {
    // class C extending class Inhertance3

    int b = 20;

    @Override
    public void funA() {
        super.funA();
    }

    public void funB() {
        total = a + b;

        System.out.println("value of a " + a);
        System.out.println("value of b " + b);
        System.out.println("value of total " + total);
    }
}

class D extends C {
    //A sub class Extending another sub Class

    int c = 30;




    public void funC() {
        total = a + b + c;

        System.out.println("value of a " + a);
        System.out.println("value of b " + b);
        System.out.println("value of c " + c);
        System.out.println("value of total " + total);

    }
}

class MultilevelInheritance {
    public static void main(String[] args) {
        Inheritance3 i1 = new Inheritance3();
        C c = new C();
        D d = new D();
        i1.funA();
        d.funB();
        d.funC();

    }
}

