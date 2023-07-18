import java.util.*;
public class DectoHex {
    int n;
    char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    DectoHex() {
        n = 0;
    }
    public static void main(String[]args) {
        DectoHex in = new DectoHex();
        in.Accept();
        in.check();
    }
    void Accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = sc.nextInt();
    }
    String convert(int x) {
        if (x < 10)
            return String.valueOf(x);
        else if (x < 16)
            return String.valueOf(hex[x]);
        else
            return convert(x/16) + convert(x%16);
    }
    void check() {
        System.out.println("Hexadecimal Form: " + convert(n));
    }
}