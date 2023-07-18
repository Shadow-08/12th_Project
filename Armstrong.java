import java.util.*;
public class Armstrong {
    long num, cube;
    Armstrong(long nx) {
        num = nx;
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int x = sc.nextInt();
        Armstrong in = new Armstrong(x);
        in.display();
    }
    long RecCubeDigit(long q) {
        return (q*q*q);
    }
    long RecGetDigitSum(long N) {
        if(N==0)
            return 0;
        return RecCubeDigit(N%10) + RecGetDigitSum(N/10);
    }
    boolean isArmstrong() {
        if(num == RecGetDigitSum(num))
            return true;
        else
            return false;
    }
    void display() {
        if(isArmstrong() == true)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not An Armstrong Number");
    }
}