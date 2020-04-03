package array_matrix;

public class StringMethods {
    public static void main(String[] args) {
        String website = "Programming Don";
        System.out.println("length of website " + website.length());
        System.out.println(website.toLowerCase());
        System.out.println(website.toUpperCase());
        System.out.println(website.charAt(2));
        System.out.println(website.indexOf("g"));
        System.out.println(website.substring(0,11));
        System.out.println(website.replace('r', 'x'));
        System.out.println(website.equals("Progrmming"));
        System.out.println(website.concat(" Hello guys"));

    }
}
