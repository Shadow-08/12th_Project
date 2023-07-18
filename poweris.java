import java.util.*;
public class poweris
{
    int base, expn;
    double p;
    poweris()
    {
        base=0;
        expn=0;
        p=0.0;
    }
    public static void main(String[]args)
    {
        poweris in = new poweris();
        in.findresults();
        in.printresult();
    }
    int power(int n, int m)
    {
        if(m == 0)
            return 1;
        return (n*power(n, m-1));
    }
    void findresults()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of base and exponent");
        base = sc.nextInt();
        expn = sc.nextInt();
        p = power(base, expn);
    }
    void printresult()
    {
        System.out.println("Result = "+p);
    }
}