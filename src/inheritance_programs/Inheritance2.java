package inheritance_programs;

public class Inheritance2 {
    int a = 10;
    int b = 20;
}

class A extends Inheritance2 {
    // first sub class

    public void sum() {
        int add = a + b;
        System.out.println("Addition " + add);
    }
}

class B extends Inheritance2 {
    // second sub class

    public void product() {
        int product = a * b;
        System.out.println("Product " + product);
    }
}

class HeiarachicalInheritance {
    public static void main(String[] args) {
         A obj = new A();
         B obj2 = new B();
         obj.sum();
         obj2.product();
    }
}
