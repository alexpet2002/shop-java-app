
public class Customer {
    String name = "Name";
    String phonenumber = "983928932";
//    Order[] orders;


    public Customer(String name, String phonenumber) {
        this.name = name;
        this.phonenumber = phonenumber;
    }

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer name: " + name + " Customer phone: " + phonenumber;
    }
}
