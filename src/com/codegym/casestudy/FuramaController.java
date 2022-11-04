package com.codegym.casestudy;
import java.util.Scanner;
public class FuramaController {
    public void DisplayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        System.out.println("Employee Management");
        System.out.println("Customer Management");
        System.out.println("Facility Management");
        System.out.println("Booking Management");
        System.out.println("Management Promotion");
        System.out.println("exit");
        do {
            System.out.println("Please enter your valid choice (1->6): ");
            choice = scanner.nextInt();
        } while (choice > 6 || choice < 0);

        switch (choice){
            case 1 :
                System.out.println("1 Display list employees");
                System.out.println("2 Add new employee");
                System.out.println("3 Edit employee");
                System.out.println("4 Return main menu");
                break;
            case 2 :
                System.out.println("1 Display list customers");
                System.out.println("2 Add new customer");
                System.out.println("3 Edit customer");
                System.out.println("4 Return main menu");
                break;
            case 3 :
                System.out.println("1 Display list facility");
                System.out.println("2 Add new facility");
                System.out.println("3 Display list facility maintenance");
                System.out.println("4 Return main menu");
                break;
            case 4 :
                System.out.println("1 Add new booking");
                System.out.println("2 Display list booking");
                System.out.println("3 Create new contracts");
                System.out.println("4 Display list contracts");
                System.out.println("5 Edit contracts");
                System.out.println("6 Return main menu");
                break;
            case 5 :
                System.out.println("1 Display list customers use service");
                System.out.println("2 Display list customers get voucher");
                System.out.println("3 Return main menu");
                break;
            case 6 :
                System.exit(0);
        }
    }
    public static void main(String[] args) {
        FuramaController a = new FuramaController();
        a.DisplayMenu();
    }
    }