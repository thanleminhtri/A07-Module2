package com.codegym;
import java.util.Scanner;
public class NumbertoString {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int number;
            System.out.println("Nhập số cần đọc: ");
            number = input.nextInt();
            if (number < 10) {
                switch (number) {
                    case 0:
                        System.out.println("zero");
                        break;
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;

                }
            } else if (number < 20) {
                switch (number - 10) {
                    case 0:
                        System.out.println("ten");
                        break;
                    case 1:
                        System.out.println("Eleven");
                        break;
                    case 2:
                        System.out.println("Twelve");
                        break;
                    case 3:
                        System.out.println("Thirteen");
                        break;
                    case 4:
                        System.out.println("Fourteen");
                        break;
                    case 5:
                        System.out.println("Fifteen");
                        break;
                    case 6:
                        System.out.println("Sixtten");
                        break;
                    case 7:
                        System.out.println("Seventeen");
                        break;
                    case 8:
                        System.out.println("Eighteen");
                        break;
                    case 9:
                        System.out.println("Nineteen");
                        break;
                }
            } else if (number < 100) {
                //number/10
                switch (number / 10) {
                    case 2:
                        System.out.print("two");
                        break;
                    case 3:
                        System.out.print("three");
                        break;
                    case 4:
                        System.out.print("four");
                        break;
                    case 5:
                        System.out.print("five");
                        break;
                    case 6:
                        System.out.print("six");
                        break;
                    case 7:
                        System.out.print("seven ");
                        break;
                    case 8:
                        System.out.print("eight");
                        break;
                    case 9:
                        System.out.print("nine");
                        break;
                }
//                System.out.print(" mươi");
                switch (number % 10) {
                    case 1:
                        System.out.println(" one");
                        break;
                    case 2:
                        System.out.print(" two");
                        break;
                    case 3:
                        System.out.print(" three");
                        break;
                    case 4:
                        System.out.print(" four");
                        break;
                    case 5:
                        System.out.print(" five");
                        break;
                    case 6:
                        System.out.print(" six");
                        break;
                    case 7:
                        System.out.print(" seven");
                        break;
                    case 8:
                        System.out.print(" eight");
                        break;
                    case 9:
                        System.out.print(" nine");
                        break;
                }
            } else if (number > 100) {
                switch (number / 100) {
                    case 1:
                        System.out.print("one");
                        break;
                    case 2:
                        System.out.print("two");
                        break;
                    case 3:
                        System.out.print("three");
                        break;
                    case 4:
                        System.out.print("four");
                        break;
                    case 5:
                        System.out.print("five");
                        break;
                    case 6:
                        System.out.print("six");
                        break;
                    case 7:
                        System.out.print("seven");
                        break;
                    case 8:
                        System.out.print("eight");
                        break;
                    case 9:
                        System.out.print("nine");
                        break;
                }switch ((number % 100) / 10) {
                    case 0:
                        System.out.print(" zero");
                        break;
                    case 1:
                        System.out.print(" one");
                        break;
                    case 2:
                        System.out.print(" two");
                        break;
                    case 3:
                        System.out.print(" three");
                        break;
                    case 4:
                        System.out.print(" four");
                        break;
                    case 5:
                        System.out.print(" five");
                        break;
                    case 6:
                        System.out.print(" six");
                        break;
                    case 7:
                        System.out.print(" seven");
                        break;
                    case 8:
                        System.out.print(" eight");
                        break;
                    case 9:
                        System.out.print(" nine");
                        break;
                }switch (number % 10) {
                    case 0:
                        System.out.print(" zero");
                        break;
                    case 1:
                        System.out.print(" one");
                        break;
                    case 2:
                        System.out.print(" two");
                        break;
                    case 3:
                        System.out.print(" three");
                        break;
                    case 4:
                        System.out.print(" four");
                        break;
                    case 5:
                        System.out.print(" five");
                        break;
                    case 6:
                        System.out.print(" six");
                        break;
                    case 7:
                        System.out.print(" seven");
                        break;
                    case 8:
                        System.out.print(" eight");
                        break;
                    case 9:
                        System.out.print(" nine");
                        break;
                }
            }
        }
    }



