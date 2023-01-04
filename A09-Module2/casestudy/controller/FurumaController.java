package com.codegym.casestudy.controller;

import com.codegym.casestudy.service.*;

import java.util.Scanner;

public class FurumaController {
    private static final Scanner scanner = new Scanner(System.in);
    public static void displayMain() {
        boolean choice = true;
        while (choice){
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            int id =Integer.parseInt(scanner.nextLine());
            switch (id){
                case 1 :
                    displayEmployee();
                    break;
                case 2:
                    displayCustomer();
                    break;
                case 3:
                    displayFacility();
                    break;
                case 4:
                    dispalyBooking();
                    break;
                case 5:
                    displayPromotion();
                    break;
                case 6:
                    displayMain();
            }
        }
    }
    public static void displayEmployee(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean choice =true;
        while (choice){
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee\n" +
                    "4\tReturn main menu\n");
            int id =Integer.parseInt(scanner.nextLine());
            switch (id){
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.add();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    displayMain();
                    break;
            }
        }
    }
    public static void displayCustomer(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean choice =true;
        while (choice){
            System.out.println("1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n");
            int id =Integer.parseInt(scanner.nextLine());
            switch (id){
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.add();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    displayMain();
                    break;
            }
        }

    }
    public static void displayFacility(){
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean choice =true;
        while (choice){
            System.out.println("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");
            int id =Integer.parseInt(scanner.nextLine());
            switch (id){
                case 1:
                    facilityService.displayFacility();
                    break;
                case 2:
                    facilityService.add();
                    break;
                case 3:
                    facilityService.displayMaintance();
                    break;
                case 4:
                    displayMain();
                    break;
            }
        }

    }public static void dispalyBooking(){
        BookingServiceImpl bookingService = new BookingServiceImpl();
        boolean choice =true;
        while (choice){
            System.out.println("1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new constracts\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n");
            int id =Integer.parseInt(scanner.nextLine());
            switch (id){
                case 1:
                    bookingService.add();
                    break;
                case 2:
                    bookingService.displayBooking();
                    break;
                case 3:
                    bookingService.createContract();
                    break;
                case 4:
                    bookingService.displayContract();
                    break;
                case 5:
                    bookingService.editContract();
                case 6:
                    displayMain();
            }
        }


    }public static void displayPromotion(){
        PromotionServiceImpl promotionService = new PromotionServiceImpl();
        boolean choice =true;
        while (choice) {
            System.out.println("1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n");
            int id =Integer.parseInt(scanner.nextLine());
            switch (id){
                case 1:
                    promotionService.displayUser();
                case 2:
                    promotionService.displayVoucher();
                case 3:
                    displayMain();
            }
        }
    }

    public static void main(String[] args) {
        FurumaController.displayMain();
    }

}
