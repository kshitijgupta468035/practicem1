package constructor_programs;

public class Constructor5 {
  public Constructor5() {
      System.out.println("Default Constructor");
  }

  public Constructor5(String s) {
      this();
      System.out.println(s);
  }

  public Constructor5(String s, int i) {
      this("heu");
      System.out.println(s + " " + i);
  }

    public static void main(String[] args) {
        Constructor5 con = new Constructor5("Hello", 20);
    }
}
