import java.util.*;
public class StrPalindrome {
    String str;
    StrPalindrome() {
        str = "";
    }
    public static void main(String[]args) {
        StrPalindrome in = new StrPalindrome();
        in.accept();
        in.check();
    }
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        str = sc.nextLine();
    }
    String RevStr(int len) {
        if ((len) >= 0)
            return str.charAt(len) + RevStr(len-1);
        return "";
    }
    void check() {
        if(str.equals(RevStr(str.length()-1)))
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome String");
    }
}