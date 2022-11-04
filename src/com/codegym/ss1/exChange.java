package com.codegym.ss1;

import java.util.Scanner;
public class exChange {
    public static void main(String[] args) {
        double USD , quyDoi;
        double VND = 23000;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào USD: ");
        USD = input.nextDouble();
        quyDoi = USD*VND;
        System.out.println( "so tien la "+quyDoi+" VND");
    }
}