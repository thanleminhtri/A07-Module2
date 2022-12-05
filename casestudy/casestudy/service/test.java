//package com.codegym.casestudy.services;
//
//
//import com.codegym.casestudy.model.Employee;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class test implements ICustomerService {
//    Scanner sc = new Scanner(System.in);
//    private static ArrayList<Employee> employeeArrayList = new ArrayList<>();
//
//    @Override
//    public void display() {
//        if (employeeArrayList.size() == 0) {
//            System.out.println("list empty");
//        } else {
//            for (Employee employee : employeeArrayList) {
//                System.out.println(employeeArrayList.toString());
//            }
//        }
//
//    }
//
//    public Employee  inputEmployeeInfo() {
//        System.out.println("Input Name: ");
//        String name = sc.nextLine();
//        System.out.println("Input Date Of Birth: ");
//        String birthDay = sc.nextLine();
//        System.out.println("Gender: ");
//        String gender = sc.nextLine();
//        System.out.println("Input id: ");
//        String identify = sc.nextLine();
//        System.out.println("Input phone number: ");
//        String phone = sc.nextLine();
//        System.out.println("Input Email: ");
//        String email = sc.nextLine();
//        System.out.println("Input education");
//        String education = sc.nextLine();
//        System.out.println("Input Position: ");
//        String position = sc.nextLine();
//        System.out.println("Input Level: ");
//        String level = sc.nextLine();
//        System.out.println("Input Salary :");
//        double salary = sc.nextDouble();
//        System.out.println("Input Employee id: ");
//        int employeeId = Integer.parseInt(sc.nextLine());
//        return new Employee(name, birthDay, gender, identify, phone, email, education, phone, level, salary, employeeId);
//    }
//    @Override
//    public void add() {
//        Employee temp =inputEmployeeInfo();
//        employeeArrayList.add(temp);
//    }
//
//    @Override
//    public void edit(int customerId) {
//
//
//    }
//    }
//
//
//
