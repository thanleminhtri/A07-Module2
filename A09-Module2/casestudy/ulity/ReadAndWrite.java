package com.codegym.casestudy.ulity;

import com.codegym.casestudy.model.Customer;
import com.codegym.casestudy.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static final String fileEmployeePath = "C:\\Users\\ADMIN\\baitap\\src\\com\\codegym\\casestudy\\data\\employee.csv";
    public static final String fileCustomerPath = "C:\\Users\\ADMIN\\baitap\\src\\com\\codegym\\casestudy\\data\\customer.csv";
    public static  List <Employee> readEmployee(){

        List<Employee> employeeList =new ArrayList<>();
        FileReader fileReader;
        BufferedReader bufferedReader =null;
        try {
            fileReader = new FileReader(fileEmployeePath);
            bufferedReader =new BufferedReader(fileReader);
            String line;
            String [] temp;
            while ( (line = bufferedReader.readLine()) != null){
                temp = line.split(",");
// String name, String birthday, String gender, int personID, String phonenumber, String email, int employeeId, String level, String postion, double salary
                String name = temp[0];
                String birthday = temp[1];
                String gender = temp[2];
                int personId = Integer.parseInt(temp[3]);
                String phonenumber = temp[4];
                String email = temp[5];
                int  employeeId = Integer.parseInt(temp[6]);
                String level = temp[7];
                String pos = temp[8];
                double salary = Double.parseDouble(temp[9]);
                Employee employee1 =  new Employee(name,birthday,gender,personId,phonenumber,email,employeeId,level,pos,salary);
                employeeList.add(employee1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return employeeList;
    }
    public static  List <Customer> readCustomer(){
        List<Customer> customersList =new ArrayList<>();
        FileReader fileReader;
        BufferedReader bufferedReader =null;
        try {
            fileReader = new FileReader(fileCustomerPath);
            bufferedReader =new BufferedReader(fileReader);
            String line;
            String [] temp;
            while ( (line = bufferedReader.readLine()) != null){
                temp = line.split(",");
// String name, String birthday, String gender, int personID, String phonenumber, String email, int customerID, String customerType, String customerAddres
                String name = temp[0];
                String birthday = temp[1];
                String gender = temp[2];
                int personId = Integer.parseInt(temp[3]);
                String phonenumber = temp[4];
                String email = temp[5];
                int  customerId = Integer.parseInt(temp[6]);
                String customerType = temp[7];
                String customerAddres = temp[8];
                Customer customer1 =  new Customer(name,birthday,gender,personId,phonenumber,email,customerId,customerType,customerAddres);
                customersList.add(customer1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return customersList;
    }
    public static void writeEmployee(List<Employee> employeeList) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(fileEmployeePath);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee1 : employeeList) {
                bufferedWriter.write(employee1.getInfo());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
    public static void writeCustomer(List<Customer> customerList){
        FileWriter fileWriter;
        BufferedWriter bufferedWriter =null;
        try {
            fileWriter = new FileWriter(fileCustomerPath);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer1 :customerList){
                bufferedWriter.write(customer1.getInfo());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}
