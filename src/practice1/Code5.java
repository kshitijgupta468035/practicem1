package practice1;


import java.util.Scanner;

public class Code5 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java 12");
    }
}

//output is Welcome to java 12

class P2 {
    public static void main(String[] args) {
        System.out.println("Good morning\n" + "Welcome to Programing");
    }
}

//output is  Good morning
//Welcome to Programing

class P3 {
    public static void main(String[] args) {
        System.out.println("enter an integer");
    }
}

//output is enter an integer.

class p4 {
    public static void main(String[] args) {
        System.out.println("Hello world!!!");
    }
}
//ouput is Hello world!!!

class p5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = scan.nextLine();
        System.out.println("My name is " + name);
        scan.close();
    }

}

class p6 {
    public static void main(String[] args) {
        int input1 = 20;
        int input2 = 30;
        int c = 7;
        int p6 = 30;

        System.out.println("input1 = " + input1);
        System.out.println("input2 = " + input2);
        System.out.println(c);
        System.out.println(p6);
    }
}

class uhi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        int j = scan.nextInt();
        String s = scan.nextLine();
        System.out.println(i + " " + j + " " + s);

    }
}

class p7 {
    public static void main(String[] args) {
        byte a = 2;
        short b = 34;
        long c = 345L;
        char d = 'A';
        int e = 643;
        float f = 4.5f;
        double g = 3.5;
        boolean h = true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
//output is 2
//34
//345
//A
//643
//4.5
//3.5
//true

class p8 {
    public static void main(String[] args) {
        int b = 2 + 3 - 5 * 2 / 5;
        int c = 77 / 2;
        System.out.println(c);
        System.out.println(b);
        System.out.println(b + c);
    }
}
//output is 38
//3
//41

class p9 {
    public static void main(String[] args) {
        int a = 23 % 10;
        System.out.println(a);
    }
}

class p10 {
    public static void main(String[] args) {
        double input1 = 3.14;
        double input2 = 5.0;
        double sum = input1 + input2;
        System.out.println(sum);
    }
}

class p11 {
    public static void main(String[] args) {
        int a = -2 % 5;
        int b = -2 % -5;
        int c = 2 % -5;
        double d = 23 / 10;
        int e = 23 / 10;
        System.out.println(b);
        System.out.println(a);
        System.out.println(c);
        System.out.println(d + " " + e);
    }
}

//output -2
//-2
//2
//2.0 2

class p13 {
    public static void main(String[] args) {
        double a = 23.0 / 10;
        double b = 23 / 10.0;
        System.out.println(a);
        System.out.println(b);
    }
}
//output is 2.3
//2.3

class p14 {
    public static void main(String[] args) {
        String name = "Kshiti";
        String email = "kshitij@gmail.com";
        System.out.println(name);
        System.out.println(email);
    }
}

class p15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        int Second = s.nextInt();
        System.out.println(first + "\n" + Second);
        s.close();
    }
}

class p16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Welcome " + name);
    }
}

class p17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        byte a = s.nextByte();
        short b = s.nextShort();
        long c = s.nextLong();
        char d = s.next().charAt(0);
        int e = s.nextInt();
        float f = s.nextFloat();
        double g = s.nextDouble();
        boolean h = s.nextBoolean();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        s.close();

    }
}

//output is

class p18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int age = s.nextInt();
        String gender = s.nextLine();
        System.out.println("Name " + name);
        System.out.println("age " + age);
        System.out.println("gender " + gender);
        s.close();
    }
}

class p21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        double second = s.nextDouble();
        System.out.println(first / second);
        System.out.println(first + "\n" + second);
        System.out.println(first + second);
        System.out.println(first + Math.pow(3.4, 2));
        s.close();
    }
}


class p22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double first = s.nextDouble();
        double second = s.nextDouble();
        double third = s.nextDouble();
        if (first > second && first > third) {
            System.out.println(first);
        } else if ((second > first) && (second > third)) {
            System.out.println(second);
        } else {
            System.out.println(third);
        }
        s.close();
    }
}

class p23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        if (first % 5 == 0) {
            System.out.print("even");
        } else {
            System.out.print("odd");
        }
    }
}


class p24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hello = 56;
        int first = s.nextInt();
        int f = 0;
        while (first > 0) {
            first = first / 10;
            f = f + 1;
        }
        System.out.println(f);

        if (3 > 1) {
            hello = 8;
            System.out.println(hello);
        }

        System.out.println(hello);
    }
}

class p25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        int f;
        while (first > 0) {
            f = first % 10;
            System.out.println(f);
            first = first / 10;
        }

    }
}

class p26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        switch (first) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("invalid");
        }
    }
}

class p27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        int f;
        while (first > 0) {
            f = first % 10;
            switch (f) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                default:
                    System.out.println("ivalid");
            }
            first = first / 10;
        }

    }
}

class p28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        int second = s.nextInt();
        int sum = first + second;
        System.out.println(sum);
    }
}

class p29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        int f;
        while (first > 0) {
            f = first % 10;
            System.out.print(f);
            first = first / 10;
        }
    }
}

class p30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        int h = first;
        int f;
        int g = 0;
        while (first > 0) {
            f = first / 10;
            g = g + f;

        }
        if (g == h) {
            System.out.println("palan");
        } else {
            System.out.println("not palan");

        }
    }

}
//Important COde 5

class p31 extends p35 {
    int rubber = 5;
    int first;
    int p31 = 40;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        int second = s.nextInt();
        int rubber = 6;
        p31 d = new p31();
        d.rubber = rubber;
        int addition = d.add(second);
        int multi = d.multi(first, second);
        System.out.println(addition);
        System.out.println(d.rubber);
        System.out.println(d.first);
        System.out.println(multi);
        System.out.println(d.p31);
    }


    public int add(int second) {
        int first = 9;
        return first + second;
    }

    public int multi(int third, int second5) {
        return third * second5;
    }
}

class p34 extends p35 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        p34 d = new p34();
        d          .                       reverse(first);
        d.hello();
        d.a = 5;
    }

    public void reverse(int first) {
        int f;
        while (first > 0) {
            f = first % 10;
            System.out.print(f);
            first = first / 10;
        }
    }


}

class p35 {
    int a;

    public void hello() {
        System.out.println("My name is you.");
        System.out.println("Hi" + a);
    }
}

class p36 extends p35 {
    int d;
    int b;

    public void hi() {
        System.out.println(d * b);
    }
}

class p37 extends p36 {
    int c;
    int a;

    @Override
    public void hi() {
        System.out.println("lovely");

    }

    public void nice() {
        System.out.println(c + a);
    }
}

class InheritanceConcept {
    public static void main(String[] args) {
        p37 Hello = new p37();
        Hello.hello();
        Hello.a = 5;
        Hello.b = 6;
        Hello.c = 5;
        Hello.d = 4;
        Hello.hi();
        Hello.nice();

    }
}

class Confusion {
    static int b = 9;
    int a = 26;

    public static void main(String[] args) {
        Confusion clear = new Confusion();
        clear.say(4.5);
        clear.say(5.6);
        clear.say(6.7);
        int a = 35;
        double c = 34;
        int b = 9;
        System.out.println(b);
        System.out.println((a * b) + "" + 10000);
    }

    public void say(int c) {
        b = 5;
        System.out.println(a * b * c);
    }

    public void say(float c) {
        b = 6;
        System.out.println(a * b * c);
    }

    public void say(double c) {
        System.out.println(c);
        b = 22;
        System.out.println(a * b * c);
    }
}

class p40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String d = scan.nextLine();
        System.out.println(s);
        System.out.println(d);

    }
}


class p45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        // int a = scan.nextInt();
        //scan.nextLine().trim();
        String a = scan.nextLine();
        System.out.println(b);
        System.out.println(a);
    }
}

