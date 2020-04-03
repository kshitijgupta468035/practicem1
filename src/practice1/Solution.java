import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();

        if (n > 0) {
            Book[] books = new Book[n];
            r.nextLine().trim();
            for (int i = 0; i < n; i++) {
                String bookName = r.nextLine().trim();
                String autherName = r.nextLine().trim();
                String ISBN = r.nextLine().trim();
                books[i] = new Book(bookName, autherName, ISBN);
            }
            for (int i = 0; i < books.length; i++) {
                System.out.println(books[i]);
            }
            r.close();
        } else {
            System.out.println("N/A");
        }
    }
}

class Book {
    private String autherName;
    private String bookName;
    private String ISBN;

    public Book(String bookName, String autherName, String ISBN) {
        this.bookName = bookName;
        this.autherName = autherName;
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutherName() {
        return autherName;
    }

    public void setAutherName(String autherName) {
        this.autherName = autherName;
    }

    public String getbookName() {
        return bookName;
    }

    public void setbookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "-----------------------------\n" +
                "Book Name:\t" + getbookName() +
                "\nAuthor Name:\t" + getAutherName() +
                "\nISBN:\t" + getISBN() +
                "\n-----------------------------";
    }


}