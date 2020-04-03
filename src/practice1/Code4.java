package practice1;

import java.util.Scanner;

public class Code4 {
    public static void main(String[] args) {
        int roll_No = 1;
        // while (1) {
        System.out.print("Roll No" + roll_No);
        //     }
    }
}
// output is error.

class Test1 {
    public static void main(String[] args) {
        int x = 10;
        int y = ++x;
        int z = ++y;
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("value of z: " + z);
    }
}
//output is 11
// 12
//12

class Test2 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        byte res = (byte) (a + b);
        //byte c =  (a + b);
        byte c = (byte) (a + b);
        System.out.println("value of c: " + c);
    }
}
//output is error but after fixing it will give something.

class Test3 {
    public static void main(String[] args) {
        int x = 10;
        double y = x / 0.0;
        System.out.println("Value of y: " + y);
    }
}
//output is Infinity

class Test4 {
    public static void main(String[] args) {
        long it_is_a_long_identifir_jbj_jufbfud_jbvujbc = 0x999fffL;
        System.out.println(it_is_a_long_identifir_jbj_jufbfud_jbvujbc);
    }
}
//10067967

class Test5 {
    public static void main(String[] args) {
        if (true) {
            System.out.println("I will do this.");
        }
        System.out.println("I will do that.");
    }
}
//output is I will do this.
//I will do that.

class Test6 {
    public static void main(String[] args) {
        char[] c = new char[4];
        int[] arr = new int[3];

    }
}
//both are right.

class Test7 {
    public static void main(String[] args) {
        int x = 20;
        switch (x + 1) {
            case 10:
                System.out.println("hi");
            case 20:
                System.out.println("bye");
            default:
                System.out.println("Krishna Krishna");
        }
    }

}
//output is Krishna Krishna

class Test8 {
    public static void main(String[] args) {
        System.out.println("G" + "L" + "A");
        System.out.println('A' + 'A' + "A");
        System.out.println("G" + 'L' + "A");
        System.out.println('G' + "L" + 'A');
    }
}

//output is GLA
// 130A
//GLA
//GLA

class Test9 {
    public static void main(String[] args) {
        int n = 10;
        int square = 10;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + (i * i));
        }
    }

}
//ouput come properly.

class Test10 {
    public static void main(String[] args) {
        // for (int i=0; 0; i++){
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
            break;
        }
    }
}
//output is error.

class Test11 {
    public static void main(String[] args) {
        double d = 0xBeef;
        System.out.println(d);
    }
}
//output is 48876.0

class Test12 {
    public static void main(String[] args) {
        int String = 10;
        System.out.println(String);
    }
}
//output is 10.

class Test13 {
    public static void main(String[] args) {
        int x;
        if (args.length > 0) {
            x = 13;
        } else {
            x = 786;
        }
        System.out.println(x);
    }
}
//output is 786.

class Test14 {
    public static void main(String[] args) {
        int cse = 10;
        int ece = 010;
        int me = 0x10;
        System.out.println(cse + "" + ece + "" + me);
    }
}
//output is 10816.

class Test15 {
    public static void main(String[] args) {
        double a = 35;
        // int  b =20;
        int b = 20;
        System.out.println("a-b " + (a - b));
    }
}
//output is error.

class Test16 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = 6;
        n = arr[arr[n] / 2];
        System.out.println(arr[n] / 3);
    }
}
//output is 1.

class Test17 {
    public static void main(String[] args) {


        int[] array = {10, 20, 30, 40, 50};

        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }
}
//output is 10 20 30 40 50

class Test18 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] d = a;
        int sum = 0;
        for (int j = 0; j < 3; ++j) {
            sum += (a[j] * d[j + 1] + a[j + 1] * d[j]);
            System.out.println(sum);
        }
    }
}
//output is 4
//16
//40

class Test19 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
            System.out.print(array[i] + " ");
            i++;
        }
    }
}
//output is 0 2 4 6 8

class Test20 {
    public static void main(String[] args) {
        int t = 0;
        System.out.println(t);
    }
}
//ouput is 0.

class Test21 {
    public static void main(String[] args) {
        char a = 'A';
        System.out.println((int) a);
    }
}
//output is 65.

class Test22 {
    public static void main(String[] args) {
        int n = 20;
        //int f;
        int f = 1;
        while (n > 0) {
            f = f * n;
            n--;
            System.out.println("Factorial of " + n + "is" + f);
        }
    }
}
//output error f is not initialized.

class Test30 {
    int nerd1 = 2;
    int nerd11 = 2;

    public static void main(String[] args) {
        Test30 nerd1 = new Test30();
        nerd1.nerd1 = 5;
        nerd1.nerd11 = 5;
        double nerd11 = nerd1.rubber(1, 2);

        System.out.println(nerd11);
    }

    public double rubber(double a, double b) {
        return a + b + nerd1 + nerd11;
    }
}

class Test31 {
    int c;
    int d;

    public static void main(String[] args) {

        Test31 nerd1 = new Test31();
        Test30 obj = new Test30();
        obj.nerd1 = 10;
        obj.nerd11 = 10;
        nerd1.c = 20;
        nerd1.d = 20;


        double nerd11 = nerd1.rubber(1, 2);
        double nerd12 = obj.rubber(1, 2);

        System.out.println(nerd11);
        System.out.println(nerd12);
    }

    public double rubber(double a, double b) {
        return a + b + c + d;
    }
}

class Test32 {
    public static void main(String[] args) {
        //int hi; not applicable when I declared a in thi already in the loop.

        for (int i = 1; i < 100; i++) {
            int hi = 56;
            System.out.println(hi);
            System.out.println(i);
        }
        int hi = 59;
        System.out.println(hi);
    }
}


class Solution34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int s = a + (int) (Math.pow(2, 0) * b);
            System.out.print(s + " ");

            for (int j = 1; j < n; j++) {
                s = s + (int) (Math.pow(2, j) * b);
                System.out.print(s + " ");
            }
            System.out.print("\n");
        }
        in.close();

    }
}

class Solution35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            int d = s1.length();
            String s = "";
            for (int j = 0; j < 15 - d; j++) {
                s = s + " ";
            }
            if (x > 0 && x < 100) {
                System.out.println(s1 + s + "0" + x);
            }
            if (x == 0) {
                System.out.println(s1 + s + "0" + "0" + x);
            }
            if (x >= 100) {
                System.out.println(s1 + s + x);
            }


        }
        System.out.print("================================");

    }
}



