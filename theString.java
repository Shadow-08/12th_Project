import java.util.*;
public class theString {
    String Str;
    int cap, sm;
    theString() {
        Str = "";
        cap = 0;
        sm = 0;
    }
    public static void main(String[]args) {
        theString in = new theString();
        in.Accept();
        in.display();
    }
    void Accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        Str = sc.nextLine();
    }
    void Recursive_fn(int x) {
        if(x>0) {
            if(Character.isUpperCase(Str.charAt(x-1)) && Character.isLetter(Str.charAt(x-1)))
                cap++;
            else if(Character.isLowerCase(Str.charAt(x-1)) && Character.isLetter(Str.charAt(x-1)))
                sm++;
            Recursive_fn(x-1);
        }
    }
    void display() {
        Recursive_fn(Str.length());
        System.out.println("Number of capital letters: "+cap);
        System.out.println("Number of small letters: "+sm);
    }
}