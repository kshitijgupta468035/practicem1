package practice1;

public abstract class Code3 {
    int rubber;

    public Code3() {
        System.out.println("Code3");
    }

    public abstract void fun();
}

class Student extends Code3 {
    //Student(){
    //  System.out.println("Student");
    //}
    int rubber;
    int _r = 5;

    public void fun() {
        System.out.println("I love everything.");
    }

    public void rf() {
        System.out.println("hwy");
    }

    public void rg() {
        System.out.println("kya haal hai");
    }
}

class Main1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.fun();
        s.rubber = 5;
        System.out.println(s.rubber);
        s.rf();
        System.out.println(s._r);

    }
}
