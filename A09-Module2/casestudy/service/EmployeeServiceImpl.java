package com.codegym.casestudy.service;

import com.codegym.casestudy.Iservice.IService;
import com.codegym.casestudy.model.Employee;
import com.codegym.ss10.Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IService {
    private static final Scanner sc =new Scanner(System.in);
    private static List<Employee> employeeArraylist =new ArrayList<>();
//    Employee(String name, String birthday, String gender, int personID, String phonenumber, String email, int employeeId, String level, String postion, double salary
    static  {
    employeeArraylist.add(new Employee("a","23/12","male",1990,"123","12",1,"abc","abc",5005));
    employeeArraylist.add(new Employee("b","25/12","male",1992,"1234","123@",2,"abcd","abcd",5020));
    employeeArraylist.add(new Employee("c","24/12","male",1991,"1235","124@",3,"abce","abce",50120));
}

    public Employee inputEmployee(){
        System.out.println("nhap ten");
        String name =sc.nextLine();
        System.out.println("nhap ngay sinh");
        String birthday = sc.nextLine();
        System.out.println("nhap gioi tinh");
        String gender =sc.nextLine();
        System.out.println("nhap ID");
        int personId= Integer.parseInt(sc.nextLine());
        System.out.println("nhap sdt");
        String phone =sc.nextLine();
        System.out.println("nhap email");
        String email =sc.nextLine();
        System.out.println("nhap employeeID");
        int employeId= Integer.parseInt(sc.nextLine());
        System.out.println("nhap level");
        String level = sc.nextLine();
        System.out.println("nhap vi tri");
        String pos =sc.nextLine();
        System.out.println("nhap luong");
        double salary = Double.parseDouble(sc.nextLine());
        return new Employee(name,birthday,gender,personId,phone,email,employeId,level,pos,salary);
    }
    @Override
    public void add() {
        Employee employeetemp=inputEmployee();
        employeeArraylist.add(employeetemp);
        System.out.println("da add");
    }

    @Override
    public void display() {
        if (employeeArraylist.isEmpty()) {
            System.out.println("list empty");
        }else {
                for (Employee employee : employeeArraylist) {
                    System.out.println(employee.getInfo());
                }
            }
        }

    @Override
    public void edit() {
        boolean check = false;
        for ( int i =0; i < employeeArraylist.size(); i++){
            if (inputEmployee().getEmployeeId() == employeeArraylist.get(i).getEmployeeId()){
                Employee temp =inputEmployee();
                employeeArraylist.remove(i);
                employeeArraylist.add(i,temp);
            }
        }
    }
}
