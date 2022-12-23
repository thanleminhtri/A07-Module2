package com.codegym.ss7;

import java.util.Scanner;

public class Square implements IColor{
    private double side;
    private String color;
    private static Scanner scanner= new Scanner(System.in);

    public Square() {
    }

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public String  Color() {
        System.out.println("nhap mau hien thi");
        String color = scanner.nextLine();
        setColor(color);
        return getColor();
    }
}
