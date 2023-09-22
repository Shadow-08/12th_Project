public class Bill extends Detail {
    int n;
    double amt;
    Bill(String x, String y, int a, int b, int c, int d) {
        super(x, y, a, b);
        n = c;
        amt = d;
    }
    public static void main(String[]args) {
        Bill in = new Bill("Ahad", "Anata no okāsan no ie", 696969, 69, 6969, 0);
        in.cal();
        in.show();
    }
    void cal() {
        if(n >= 1 && n <= 100)
            amt = rent;
        else if(n >= 101 && n <= 200)
            amt = (0.6*n) + rent;
        else if(n >= 201 && n <= 300)
            amt = (0.8*n) + rent;
        else
            amt = (1*n) + rent;
    }
    void show() {
        super.show();
        System.out.println("Number of Calls: " + n);
        System.out.println("Bill: " + amt);
    }
}