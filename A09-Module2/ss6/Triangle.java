package com.codegym.ss6;

import java.util.Scanner;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    Scanner scanner =new Scanner(System.in);
    public Triangle(){}
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
//    Double.parseDouble(scanner.nextLine());
    public double getArea(double side1, double side2, double side3){
        double p= Math.sqrt((side1+side2+side3)/2);
        double area=4;
        return  area;
    }
    public double getPerimeter(double side1, double side2, double side3){
        double perimeter=(side1+side2+side3);
        return perimeter;
    }
}
