package com.codegym.casestudy.model;

public class House extends Facility{
    private String RoomStandard;
    private int Floor;

    public House() {

    }

    public House(String serviceName, double usableArea, double cost, int maximumMember, String rentalType, String roomStandard, int floor) {
        super(serviceName, usableArea, cost, maximumMember, rentalType);
        this.RoomStandard = roomStandard;
        this.Floor = floor;
    }



    public String getRoomStandard() {
        return RoomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.RoomStandard = roomStandard;
    }

    public int getFloor() {
        return Floor;
    }

    public void setFloor(int floor) {
        this.Floor = floor;
    }
}