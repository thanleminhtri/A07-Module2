package com.codegym.casestudy.model;

public class Customer extends Person{
    private int customerID;
    private String customerType;
    private String customerAddress;

    public Customer(){}

    public Customer(String name, String birthday, String gender, int personID, String phonenumber, String email, int customerID, String customerType, String customerAddress) {
        super(name, birthday, gender, personID, phonenumber, email);
        this.customerID = customerID;
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +super.toString()+
                "customerID=" + customerID +
                ", customerType='" + customerType + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s," ,getName(),getBirthday(),getGender(),getPersonID(),getPhonenumber(),getEmail(),getCustomerID(),getCustomerType(),getCustomerAddress());
    }
}
