package com.codegym.casestudy.model;

public abstract class Facility {
    private String name;
    private double area;
    private  double price;
    private int numberrent;
    private String renttype;
    public Facility(){}
    public Facility(String name, double area, double price, int numberrent, String renttype) {
        this.name = name;
        this.area = area;
        this.price = price;
        this.numberrent = numberrent;
        this.renttype = renttype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberrent() {
        return numberrent;
    }

    public void setNumberrent(int numberrent) {
        this.numberrent = numberrent;
    }

    public String getRenttype() {
        return renttype;
    }

    public void setRenttype(String renttype) {
        this.renttype = renttype;
    }

    @Override
    public String toString() {
        return "Facility{"+
                "name='" + name + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", numberrent=" + numberrent +
                ", renttype='" + renttype + '\'' +
                '}';
    }

    public abstract String getInfo();

}
