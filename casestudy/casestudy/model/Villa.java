package com.codegym.casestudy.model;

public class Villa extends Facility {
    private String RoomStyle;
    private int AreaPool;
    private int Floor;

    public Villa() {
    }

    public Villa(String ServiceName, double UsableArea, double Cost, int MaximumMember, String RentalType, String roomStyle, int areaPool, int floor) {
        super(ServiceName, UsableArea, Cost, MaximumMember, RentalType);
        this.RoomStyle = roomStyle;
        this.AreaPool = areaPool;
        this.Floor = floor;
    }

    public String getRoomStyle() {
        return RoomStyle;
    }

    public void setRoomStyle(String roomStyle) {
        this.RoomStyle = roomStyle;
    }

    public int getAreaPool() {
        return AreaPool;
    }

    public void setAreaPool(int areaPool) {
        this.AreaPool = areaPool;
    }

    public int getFloor() {
        return Floor;
    }

    public void setFloor(int floor) {
        this.Floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "RoomStyle='" + RoomStyle + '\'' +
                ", AreaPool=" + AreaPool +
                ", Floor=" + Floor +
                '}';
    }
}
