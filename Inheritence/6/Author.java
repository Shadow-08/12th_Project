public class Author {
    long authorno;
    String name;
    Author(long nx, String n) {
        authorno = nx;
        name = n;
    }
    void show() {
        System.out.println("Author Name   : "+name);
        System.out.println("Author Number : "+authorno);
    }
}