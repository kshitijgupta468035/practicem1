package practice1;

public class Code1 {
    public Code1() {
        System.out.println("river");
    }

    public void eat() {
        System.out.println("eating");
    }

    public void try7() {
        System.out.println("uyo");

    }
}

class Dog extends Code1 {
   Dog(){
       super();
   }
    int rubber;
    @Override
    public void eat() {
        System.out.println("bread");
    }

    public void bark() {
        System.out.println("barking");
    }

    public void work() {
        super.eat();
        bark();

        System.out.println("real");
    }

}

class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.work();
        d.eat();
        d.try7();
        d.rubber=5;
        int rubber = d.rubber;
        System.out.println(rubber);
    }
}


