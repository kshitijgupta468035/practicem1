package inheritance_programs;

public abstract class Show {
   public abstract void message();

   public void result() {
        System.out.println("This method is showing Result");
    }
}

class ShowSum extends Show {
    int a =10;
    int b =20;
    int c;


    @Override
    public void message() {
        c = a + b;
        result();
        System.out.println("Value of c " + c);

    }
}

class Showsubtract extends Show {
    int a = 12;
    int b = 8;

    @Override
    public void message() {
        int c = a - b;
        result();
        System.out.println("value of c " + c );
    }
}

class Work {
    public static void main(String[] args) {
        ShowSum sum = new ShowSum();
        Showsubtract sub = new Showsubtract();
        sum.message();
        sub.message();
    }
}