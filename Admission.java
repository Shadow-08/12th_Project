import java.util.*;
public class Admission {
    int Admno[] = new int[100];
    Admission() {
        for(int i=0; i<100; Admno[i] = 0, i++);
    }
    public static void main(String[]args) {
        Admission in = new Admission();
        in.fillArray();
        Arrays.sort(in.Admno);
        if(in.binSearch(0, 99, 870) == 1)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
    void fillArray() {
        System.out.println("Enter admission numbers:");
        for(int i=0; i<100; Admno[i] = new Scanner(System.in).nextInt(), i++);
    }
    int binSearch(int l, int u, int n) {
        int mid = (l+u)/2;
        if(l>u)
            return -1;
        else if(n == Admno[mid])
            return 1;
        else if(n > Admno[mid])
            return binSearch(mid+1, u, n);
        else
            return binSearch(l, mid-1, n);
    }
}