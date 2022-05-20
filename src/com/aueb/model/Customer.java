package com.aueb.model;

public class Customer {
    String name;
    int phonenumber;
//    Order[] orders;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Customer name: " + name + " Customer phone: " + phonenumber;
    }
}
