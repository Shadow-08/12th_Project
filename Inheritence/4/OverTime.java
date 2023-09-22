public class OverTime extends EmployeeData {
    int ndays;
    double rate;
    OverTime() {
        super(0, 0);
        ndays = 0;
        rate = 0;
    }
    public static void main(String[]args) {
        OverTime in = new OverTime();
        in.printData();
    }
    double calculate() { // calculate salary as basicpay + (ndays * rate)
        double total = basicpay + (ndays * rate);
        return total;
    }
    void printData() {
        super.printData();
    }
}