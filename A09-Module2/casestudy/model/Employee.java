package com.codegym.casestudy.model;

public class Employee extends Person{
    private int employeeId;
    private String level;
    private String postion;
    private double salary;
    public Employee(String name, String birthday, String gender, int personID, String phonenumber, String email, int employeeId, String level, String postion, double salary) {
        super(name, birthday, gender, personID, phonenumber, email);
        this.employeeId = employeeId;
        this.level = level;
        this.postion = postion;
        this.salary = salary;
    }



    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +super.toString()+
                "employeeId=" + employeeId +
                ", level='" + level + '\'' +
                ", postion='" + postion + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s," ,getName(),getBirthday(),getGender(),getPersonID(),getPhonenumber(),getEmail(),getEmployeeId(),getLevel(),getPostion(),getSalary());
    }
}
