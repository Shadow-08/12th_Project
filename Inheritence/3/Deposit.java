public class Deposit extends Bank {
    double amt;
    Deposit(double q) {
        super("Ahad", 69696969);
        amt = q;
    }
    public static void main(String[]args) {
        Deposit in = new Deposit(696969.69);
        in.display();
    }
    void display() {
        super.display();
        System.out.println("Amount: "+amt);
    }
}