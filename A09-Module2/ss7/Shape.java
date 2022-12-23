package com.codegym.ss7;

public abstract class Shape implements IResiable {
    private String color = "green";
    private boolean filled = true;
    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }

    @Override
    public abstract double resize();
//        System.out.println("nhap ty le % resize");
//        int num =scanner.nextInt();
//


//    @Override
//    public void Color() {
//
//    }
}