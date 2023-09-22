import java.util.*;
public class Marks extends Students {
    double tot, per;
    char gd;
    public static void main(String[]args) {
        Marks in = new Marks();
        in.inputData();
        in.compute();
        in.showData();
    }
    void inputData() {
        super.inputData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total Marks:");
        tot = sc.nextDouble();
        System.out.println("Enter the Percentage:");
        per = sc.nextDouble();
    }
    void compute() {
        if(per >= 85)
            gd = 'A';
        else if(per >= 60 && per < 85)
            gd = 'B';
        else if(per >= 40 && per < 60)
            gd = 'C';
        else
            gd = 'D';
    }
    void showData() {
        printData();
        System.out.println("Total Marks: " + tot);
        System.out.println("Perecentage: " + per + "%");
        System.out.println("Grade: " + gd);
    }
}