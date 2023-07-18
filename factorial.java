import java.util.*;
public class factorial
{
    int n, f;
    factorial()
    {
        n=0;
        f=0;
    }
    public static void main(String[]args)
    {
        factorial in = new factorial();
        in.getFactorial();
    }
    int fact(int num)
    {
        if(num == 0)
            return 1;
        return (num*fact(num-1));
    }
    void getFactorial()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        System.out.println("Factorial = "+fact(n));
    }
}