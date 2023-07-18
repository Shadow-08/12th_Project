import java.util.*;
public class Palindrome {
    int n;
    Palindrome() {
        n = 0;
    }
    public static void main(String[]args) {
        Palindrome in = new Palindrome();
        in.accept();
        in.check();
    }
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        n = sc.nextInt();
    }
    String RevNum(int x) {
        if (x == 0)
            return "";
        return String.valueOf(x%10) + RevNum(x/10);
    }
    void check() {
        if(n == Integer.valueOf(RevNum(n)))
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }
}