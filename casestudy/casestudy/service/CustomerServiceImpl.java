package com.codegym.casestudy.service;


import com.codegym.casestudy.model.Customer;
import com.codegym.casestudy.service.imple.ICustomerService;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;
public class CustomerServiceImpl implements ICustomerService {
    Scanner sc = new Scanner(System.in);
    private static LinkedList<Customer> customersList = new LinkedList<>();

    @Override
    public void display() {
        if(customersList.size()==0){
            System.out.println("The list is empty");
        }
        else{
            for (Customer customer : customersList) {
                System.out.println(customer.toString());
            }
        }
//        : Mã khách hàng, Họ tên , Ngày sinh, Giới tính, Số CMND, Số Điện Thoại,
//        Email, Loại khách, Địa chỉ
    }public Customer inputCustomerinfo(){
        System.out.println("Input Name: ");
        String name = sc.nextLine();
        System.out.println("Input Date Of Birth: ");
        String birthDay = sc.nextLine();
        System.out.println("Gender: ");
        String gender = sc.nextLine();
        System.out.println("Input id: ");
        String identify = sc.nextLine();
        System.out.println("Input phone number: ");
        String phone =sc.nextLine();
        System.out.println("Input Email: ");
        String email = sc.nextLine();
        System.out.println("Input Customer Type: ");
        String customerType= sc.nextLine();
        System.out.println("Input CUstomer ID");
        String customerId = sc.nextLine();
        System.out.println("Input Address");
        String address =sc.nextLine();
        return new Customer(name,birthDay,gender,identify,phone,email,customerId,customerType,address);


    }

    @Override
    public void add() {
        Customer temp = inputCustomerinfo();
        customersList.add(temp);
    }

    @Override
    public void edit(int Customer) {
        boolean found = false;
        for (int i = 0; i < customersList.size(); i++) {
            if(Objects.equals(inputCustomerinfo().getId(), customersList.get(i).getId())){
                Customer temp = inputCustomerinfo();
                customersList.remove(i);
                customersList.add(i,temp);
                found = true;
            }
        }
        if (!found){
            System.out.println("Not found");
        }
    }


//    public static void main(String[] args) {
//        EmployeeServiceImpl n = new EmployeeServiceImpl();
//        n.add();
//        n.display();
//        n.edit();
//        n.display();

    }


