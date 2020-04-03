package practice1;

public class Code2 {
    final int speed =20;

    public int hello(int speed){
        speed=500;
        return speed;
    }
}

class Main{
    public static void main(String[] args) {
        Code2 h = new Code2();
        int d = h.hello(5);
        System.out.println(d);
    }
}
