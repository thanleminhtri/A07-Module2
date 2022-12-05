package com.codegym.casestudy.model;

public class Employee extends Person {
    private String Education;
    private String Job;
    private double Salary;
    private int IdStaff;
    private String level;

    public Employee(String name, String dateOfBirth, String sex, String identify, String phoneNumber, String email, String education, String job, double salary, int idStaff, String level) {
        super(name, dateOfBirth, sex, identify, phoneNumber, email);
        Education = education;
        Job = job;
        Salary = salary;
        IdStaff = idStaff;
        this.level = level;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        this.Education = education;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        this.Job = job;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }

    public int getIdStaff() {
        return IdStaff;
    }

    public void setIdStaff(int idStaff) {
        IdStaff = idStaff;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Education='" + Education + '\'' +
                ", Job='" + Job + '\'' +
                ", Salary=" + Salary +
                ", IdStaff=" + IdStaff +
                ", level='" + level + '\'' +
                '}';
    }

    @Override
    public String getInfo() {
        return String.format("%d,%d,%d",this.getName(),this.getInfo(),this.getIdStaff());
    }

//Mã nhân viên, Họ tên, Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email, Trình độ, Vị trí, lương
}
