import java.util.*;
public class Students {
    String nam, dobirth;
    int rol;
    void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name:");
        nam = sc.nextLine();
        System.out.println("Enter the DOB:");
        dobirth = sc.nextLine();
        System.out.println("Enter the Roll Number:");
        rol = sc.nextInt();
    }
    void printData() {
        System.out.println("Name: " + nam);
        System.out.println("DOB: " + dobirth);
        System.out.println("Roll Number: " + rol);
    }
}