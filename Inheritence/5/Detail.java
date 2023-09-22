public class Detail {
    String name, address;
    int telno, rent;
    Detail(String x, String y, int a, int b) {
        name = x;
        address = y;
        telno = a;
        rent = b;
    }
    void show() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Telephone Number: " + telno);
        System.out.println("Rental Charge: " + rent);
    }
}