import java.util.*;
public class PrimeSeries
{
    int limit, arr[];
    PrimeSeries()
    {
        limit = 0;
        arr = null;
    }
    public static void main(String[]args)
    {
        PrimeSeries in = new PrimeSeries();
        in.accept();
        in.displayPrime();
    }
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit");
        limit = sc.nextInt();
        arr = new int[limit];
        System.out.println("enter the array");
        for(int i=0; i<limit; i++)
            arr[i] = sc.nextInt();
    }
    int isPrime(int n, int k, int p)
    {
        for(; p<=n; p++)
        {
            if(n%p == 0)
                k++;
        }
        if(k==2)
            return 1;
        else
            return 0;
    }
    void displayPrime()
    {
        for(int i=0; i<limit; i++)
        {
            if(isPrime(arr[i], 0, 1) == 1)
                System.out.println(arr[i]+" is Prime");
        }
    }
}