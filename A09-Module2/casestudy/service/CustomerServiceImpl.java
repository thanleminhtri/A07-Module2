package com.codegym.casestudy.service;

import com.codegym.casestudy.Iservice.IService;
import com.codegym.casestudy.model.Customer;
import com.codegym.casestudy.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements IService {
    private static final Scanner sc =new Scanner(System.in);
    private static List<Customer> customerArrayList =new ArrayList<>();
    static {
//  String name, String birthday, String gender, int personID, String phonenumber, String email, int customerID, String customerType, String customerAddress) {
        customerArrayList.add(new Customer("a","23/12","male",1990,"123","12@",1,"abc","abc"));
        customerArrayList.add(new Customer("b","24/12","male",1992,"1235","122@",2,"abcd","abcd"));
        customerArrayList.add(new Customer("c","25/12","male",1991,"1234","123@",3,"abce","abcf"));
    }

    public Customer inputCustomer(){
        System.out.println("nhap ten");
        String name =sc.nextLine();
        System.out.println("nhap ngay sinh");
        String birthday = sc.nextLine();
        System.out.println("nhap gioi tinh");
        String gender =sc.nextLine();
        System.out.println("nhap Id");
        int personId= Integer.parseInt(sc.nextLine());
        System.out.println("nhap sdt");
        String phone =sc.nextLine();
        System.out.println("nhap email");
        String email =sc.nextLine();
        System.out.println("nhap customerID");
        int customerId= Integer.parseInt(sc.nextLine());
        System.out.println("nhap customerType");
        String customerType = sc.nextLine();
        System.out.println("nhap customerAdrress");
        String customerAdrress =sc.nextLine();
        return new Customer(name,birthday,gender,personId,phone,email,customerId,customerType,customerAdrress);
    }


    @Override
    public void add() {
        Customer customertemp=inputCustomer();
        customerArrayList.add(customertemp);
        System.out.println("da add");
    }

    @Override
    public void display() {
        if (customerArrayList.isEmpty()) {
            System.out.println("list empty");
        }else {
            for (Customer customer : customerArrayList) {
                System.out.println(customer.getInfo());
            }
        }
    }

    @Override
    public  void edit() {
        boolean check = false;
        for ( int i =0; i < customerArrayList.size(); i++){
            if (inputCustomer().getCustomerID() == customerArrayList.get(i).getCustomerID()){
                Customer temp =inputCustomer();
                customerArrayList.remove(i);
                customerArrayList.add(i,temp);
            }
        }

    }
}
