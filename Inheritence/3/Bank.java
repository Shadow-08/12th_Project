public class Bank {
    String name;
    long accno;
    Bank(String na, long x) {
        name = na;
        accno = x;
    }
    void display() {
        System.out.println("Name: "+name);
        System.out.println("Account Number: "+accno);
    }
}