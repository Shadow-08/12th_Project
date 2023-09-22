import java.util.*;
public class BookList extends Author {
    long bookno, edition;
    String bookName;
    double price;
    BookList(long a, String b, long c, String d, double e, long f) {
        super(a, b);
        bookno = c;
        bookName = d;
        price = e;
        edition = f;
    }
    public static void main(String[]args) {
        BookList in = new BookList(123456789, "Joseph Nguyen", 987654321, "Think Again", 69.69, 3);
        in.show();
    }
    void show() {
        super.show();
        System.out.println("Book Name     : "+bookName);
        System.out.println("Book Number   : "+bookno);
        System.out.println("Book Edition  : "+edition);
        System.out.println("Book Price    : "+price);
    }
}