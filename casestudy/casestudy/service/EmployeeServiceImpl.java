package com.codegym.casestudy.service;
import com.codegym.casestudy.model.Employee;
import com.codegym.casestudy.service.imple.IEmployeeService;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


    public class EmployeeServiceImpl implements IEmployeeService {
        Scanner sc = new Scanner(System.in);
        private static ArrayList<Employee> employeeList = new ArrayList<Employee>();
        static {
            employeeList.add(new Employee("a","23/12/1996","male","1990","0123","123@","12","abc",5300,500,"18"));
            employeeList.add(new Employee("b","23/12/1996","male","1990","0123","123@","12","abc",5300,500,"18"));
            employeeList.add(new Employee("c","23/12/1996","male","1990","0123","123@","12","abc",5300,500,"18"));

        }


        @Override
        public void display() {
            if (employeeList.size() == 0) {
                System.out.println("The list is empty");
            } else {
                for (Employee employee : employeeList) {
                    System.out.println(employee.toString());
                }
            }
        }

        public Employee inputEmployeeInfo() {
            System.out.println("Input Name: ");
            String name = sc.nextLine();
            System.out.println("Input Date Of Birth: ");
            String birthDay = sc.nextLine();
            System.out.println("Gender: ");
            String gender = sc.nextLine();
            System.out.println("Input id: ");
            String identify = sc.nextLine();
            System.out.println("Input phone number: ");
            String phone = sc.nextLine();
            System.out.println("Input Email: ");
            String email = sc.nextLine();
            System.out.println("Input education");
            String education = sc.nextLine();
            System.out.println("Input Position: ");
            String position = sc.nextLine();
            System.out.println("Input Level: ");
            String level = sc.nextLine();
            System.out.println("Input Salary :");
            double salary = Double.parseDouble(sc.nextLine());
            System.out.println("Input Employee id: ");
            int employeeId = Integer.parseInt(sc.nextLine());
            return new Employee(name,birthDay,gender,identify,phone,email,education,position,salary,employeeId,level);


        }
            @Override
            public void add() {
                Employee temp = inputEmployeeInfo();
                employeeList.add(temp);
            }

            @Override
                public void edit(int employee) {
                boolean found = false;
                for (int i = 0; i < employeeList.size(); i++) {
                    if(Objects.equals(inputEmployeeInfo().getId(),employeeList.get(i).getId())){
                        Employee temp = inputEmployeeInfo();
                        employeeList.remove(i);
                        employeeList.add(i,temp);
                        found = true;
                    }
                }
                if (!found){
                    System.out.println("Not found");
                }
            }

        public static void main(String[] args) {
            EmployeeServiceImpl employ= new EmployeeServiceImpl();
            employ.edit(2);
            employ.add();
        }
        }

