package com.codegym;
import java.util.Scanner;
public class SayHello {
    public static void main(String[] args) {
        System.out.println("Vui lòng nhập tên: ");
        String name;
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println("Hello " +name);
    }
}

