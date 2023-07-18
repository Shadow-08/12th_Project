import java.util.*;
public class DectoBin {
    int n;
    DectoBin() {
        n = 0;
    }
    public static void main(String[]args) {
        DectoBin in = new DectoBin();
        in.Accept();
        in.check();
    }
    void Accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = sc.nextInt();
    }
    String convert(int x) {
        if (x == 0)
            return "";
        return convert(x/2) + String.valueOf(x%2);
    }
    void check() {
        System.out.println("Binary Form: " + convert(n));
    }
}