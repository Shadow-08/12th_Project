import java.util.*;
public class series {
    int x, n, f, p;
    double sum;
    series() {
        x=0;
        n=0;
        f=0;
        p=0;
        sum=1.0;
    }
    series(int nx, int nn) {
        x=nx;
        n=nn;
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x and n");
        int a = sc.nextInt();
        int b = sc.nextInt();
        series in = new series(a, b);
        in.sumseries();
    }
    int Fact(int d) {
        if(d == 0)
            return 1;
        return (d*Fact(d-1));
    }
    int power(int a, int b) {
        if(b == 0)
            return 1;
        return (a*power(a, b-1));
    }
    void sumseries() {
        sum = 1.0;
        for(int i=2; i<=n; i++)
            sum += (double)power(x, i)/Fact(i+1);
        System.out.println("Sum = "+sum);
    }
}