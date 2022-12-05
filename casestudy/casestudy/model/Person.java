package com.codegym.casestudy.model;

public abstract class Person{
    private String Name;
    private String DateOfBirth;
    private String Sex;
    private String Identify;
    private String PhoneNumber;
    private String Email;

//    private String Education;
//    private String Job;
//    private double Salary;
//    private int IdStaff;


    public Person() {
    }

    public Person(String name, String dateOfBirth, String sex, String identify, String phoneNumber, String email) {
        this.Name = name;
        this.DateOfBirth = dateOfBirth;
        this.Sex = sex;
        this.Identify = identify;
        this.PhoneNumber = phoneNumber;
        this.Email = email;
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
       this.DateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        this.Sex = sex;
    }

    public String getId() {
        return Identify;
    }

    public void setId(String id) {
        this.Identify = id;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }
   public abstract String getInfo();
}

