package com.codegym.casestudy.model;
public abstract class Facility {
    private String ServiceName;
    private double UsableArea;
    private double Cost;
    private int MaximumMember;
    private String RentalType;

    public Facility() {
    }

    public Facility(String ServiceName, double UsableArea, double Cost, int MaximumMember, String RentalType) {
        this.ServiceName = ServiceName;
        this.UsableArea = UsableArea;
        this.Cost = Cost;
        this.MaximumMember = MaximumMember;
        this.RentalType = RentalType;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        this.ServiceName = serviceName;
    }

    public double getUsableArea() {
        return UsableArea;
    }

    public void setUsableArea(double usableArea) {
        this.UsableArea = usableArea;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        this.Cost = cost;
    }

    public int getMaximumMember() {
        return MaximumMember;
    }

    public void setMaximumMember(int maximumMember) {
        this.MaximumMember = maximumMember;
    }

    public String getRentalType() {
        return RentalType;
    }

    public void setRentalType(String rentalType) {
        this.RentalType = rentalType;
    }
}