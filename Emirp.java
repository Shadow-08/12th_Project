import java.util.*;
public class Emirp
{
    int n, rev, f;
    Emirp(int nn)
    {
        n = nn;
        rev = 0;
        f = 2;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int x = sc.nextInt();
        Emirp in = new Emirp(x);
        in.isEmirp();
    }
    int isprime(int x)
    {
        if(n==x)
            return 1;
        else if(n%x == 0)
            return 0;
        else
            return isprime(x+1);
    }
    void isEmirp()
    {
        int x=n;
        while(x>0)
        {
            rev = rev * 10 + (x%10);
            x/=10;
        }
        int t1 = isprime(f);
        n = rev;
        f = 2;
        int t2 = isprime(f);
        if(t1 == 1 && t2 == 1)
            System.out.println("Emirp Number");
        else
            System.out.println("Not An Emirp Number");
    }
}