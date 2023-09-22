public class EmployeeData {
    int empcode;
    double basicpay;
    EmployeeData() {
        empcode = 0;
        basicpay = 0;
    }
    EmployeeData(int c, double b) {
        empcode = c;
        basicpay = b;
    }
    void printData() {
        System.out.println("Name: "+empcode);
        System.out.println("Account Number: "+basicpay);
    }
}