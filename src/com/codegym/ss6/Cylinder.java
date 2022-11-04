package com.codegym.ss6;
public class Cylinder extends Circle {

    private double height;

    public Cylinder() {
        System.out.println("Constructed a Cylinder with Cylinder()");
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(double radius, String color, double height)");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString() +
                ", area=" + getArea() +
                ", height=" + getHeight() +
                ", volume=" + getVolume() +
                '}';
    }
}