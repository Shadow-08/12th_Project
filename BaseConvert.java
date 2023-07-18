import java.util.*;
public class BaseConvert {
    Scanner sc = new Scanner(System.in);
    int n;
    BaseConvert() {
        n = 0;
    }
    public static void main(String[]args) {
        BaseConvert in = new BaseConvert();
        System.out.println("Enter the Base:");
        in.display(in.sc.nextInt());
    }
    void Accept() {
        System.out.println("Enter the number:");
        n = sc.nextInt();
    }
    String convert_to_bin(int x) {
        if (x != 0)
            return convert_to_bin(x/2) + String.valueOf(x%2);
        return "";
    }
    String convert_to_hex(int x) {
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        if (x < 10)
            return String.valueOf(x);
        else if (x < 16)
            return String.valueOf(hex[x]);
        else
            return convert_to_hex(x/16) + convert_to_hex(x%16);
    }
    void display(int x) {
        switch(x) {
            case 10:
                Accept();
                System.out.println("Binary Form = " + convert_to_bin(n));
                break;

            case 16:
                Accept();
                System.out.println("Binary Form = " + convert_to_hex(n));
                break;

            default: System.out.println("Wrong Input !!!!");
        }
    }
}