package com.codegym.casestudy.model;

public class Room extends Facility{
    private String FreeService;
    public Room() {
    }

    public Room(String ServiceName, double UsableArea, double Cost, int MaximumMember, String RentalType, String freeService) {
        super(ServiceName, UsableArea, Cost, MaximumMember, RentalType);
        this.FreeService = freeService;
    }
    public String getFreeService(){
        return FreeService;
    }

    public void setFreeService(String freeService) {
        this.FreeService = freeService;
    }
}