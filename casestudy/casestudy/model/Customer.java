package com.codegym.casestudy.model;

public class Customer extends Person{
    private String CustomerID;
    private String CustomerType;
    private String address;
//: Mã khách hàng, Họ tên , Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email, Loại khách, Địa chỉ.
    public Customer(String name, String dateOfBirth, String sex, String identify, String phoneNumber, String email, String customerID, String customerType, String address) {
        super(name, dateOfBirth, sex, identify, phoneNumber, email);
        this.CustomerID = customerID;
        this.CustomerType = customerType;
        this.address = address;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }

    public String getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(String customerType) {
        CustomerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getInfo() {
        return String.format("%d,%d,%d",getName(),getCustomerID(),getAddress());}
    }
