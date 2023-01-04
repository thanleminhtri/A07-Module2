package com.codegym.casestudy.model;

public class Villa extends Facility{
    private String  rooomStandard;
    private double poolarea;
    private int floor;

    public Villa(String rooomStandard, double poolarea, int floor) {
        this.rooomStandard = rooomStandard;
        this.poolarea = poolarea;
        this.floor = floor;
    }

    public Villa(String name, double area, double price, int numberrent, String renttype, String rooomStandard, double poolarea, int floor) {
        super(name, area, price, numberrent, renttype);
        this.rooomStandard = rooomStandard;
        this.poolarea = poolarea;
        this.floor = floor;
    }

    public String getRooomStandard() {
        return rooomStandard;
    }

    public void setRooomStandard(String rooomStandard) {
        this.rooomStandard = rooomStandard;
    }

    public double getPoolarea() {
        return poolarea;
    }

    public void setPoolarea(double poolarea) {
        this.poolarea = poolarea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +super.toString()+
                "rooomStandard='" + rooomStandard + '\'' +
                ", poolarea=" + poolarea +
                ", floor=" + floor +
                '}';
    }

    @Override
    public String getInfo() {
        return null;
    }
}
