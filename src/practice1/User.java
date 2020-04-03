package practice1;

import java.util.Scanner;

public class User {
    private String name;
    private String college;
    private int value;

    public User(String name, String college, int value) {
        this.name = name;
        this.college = college;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s_%d@%s.com", getName(), getValue(), getCollege());
    }

}

class Execution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine().trim();
        User[] user = new User[n];
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String college = scanner.nextLine();
            int value = Integer.parseInt(scanner.nextLine());
            user[i] = new User(name, college, value);
        }

        for (int i = 0; i < user.length; i++) {
            System.out.println(user[i]);
        }
    }
}








