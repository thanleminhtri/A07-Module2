package com.codegym.casestudy.model;

public class Room extends Facility{
    private String freeService;

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String name, double area, double price, int numberrent, String renttype, String freeService) {
        super(name, area, price, numberrent, renttype);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +super.toString()+
                "freeService='" + freeService + '\'' +
                '}';
    }

    @Override
    public String getInfo() {
        return null;
    }
}
