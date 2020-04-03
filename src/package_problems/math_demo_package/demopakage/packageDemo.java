package package_problems.math_demo_package.demopakage;

import package_problems.math_demo_package.MyMath;

public class packageDemo {
    public static void main(String[] args) {
        MyMath math = new MyMath();
        math.showSquare(5);
        System.out.println(math.cube(5));
    }
}
