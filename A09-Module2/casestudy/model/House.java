package com.codegym.casestudy.model;

public class House extends Facility{
    private String roomstandard;
    private int floor;

    public House(String roomstandard, int floor) {
        this.roomstandard = roomstandard;
        this.floor = floor;
    }

    public House(String name, double area, double price, int numberrent, String renttype, String roomstandard, int floor) {
        super(name, area, price, numberrent, renttype);
        this.roomstandard = roomstandard;
        this.floor = floor;
    }

    public String getRoomstandard() {
        return roomstandard;
    }

    public void setRoomstandard(String roomstandard) {
        this.roomstandard = roomstandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +super.toString()+
                "roomstandard='" + roomstandard + '\'' +
                ", floor=" + floor +
                '}';
    }

    @Override
    public String getInfo() {
        return null;
    }
}
