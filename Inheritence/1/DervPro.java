public class DervPro extends BasePro {
    double result;
    public static void main(String[]args) {
        DervPro in = new DervPro();
        in.prod();
        in.disp();
    }
    void prod() {
        enter();
        result = n1 * n2;
    }
    void disp() {
        show();
        System.out.println("Result: " + result);
    }
}