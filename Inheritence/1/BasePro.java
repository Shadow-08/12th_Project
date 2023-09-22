import java.util.*;
public class BasePro {
    double n1, n2;
    void enter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
    }
    void show() {
        System.out.println("Numbers: " + n1 + " and " + n2);
    }
}