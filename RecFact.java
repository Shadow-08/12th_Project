import java.util.*;
public class RecFact
{
    int n, r;
    RecFact()
    {
        n=0;
        r=0;
    }
    public static void main(String[]args)
    {
        RecFact in = new RecFact();
        in.accept();
        in.Result();
    }
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        n = sc.nextInt();
        System.out.println("enter the value of r");
        r = sc.nextInt();
    }
    int factorial(int v)
    {
        if(v == 0)
            return 1;
        return (v*factorial(v-1));
    }
    void Result()
    {
        System.out.println("Result = "+(factorial(n)/(factorial(r)*factorial(n-r))));
    }
}