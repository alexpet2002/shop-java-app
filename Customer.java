/*
    Names: ALEKSANDRA PETUKHOVA, AIKATERINI VANTARAKI
    Student Numbers: 3210229, 3210020
    Team number: 011

*/
public class Customer {
    String name = "Name";
    String phonenumber = "983928932";

    //Constructor for Customer
    public Customer(String name, String phonenumber) {
        this.name = name;
        this.phonenumber = phonenumber;
    }

    public Customer() {
    }

    // toString method for Customer
    @Override
    public String toString() {
        return "Customer name: " + name + " Customer phone: " + phonenumber;
    }

    public String getName() {
        return name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }
}
