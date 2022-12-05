package com.codegym.casestudy.service;

import com.codegym.casestudy.model.Facility;
import com.codegym.casestudy.model.Villa;
import com.codegym.casestudy.service.imple.IFacilityServices;

import java.util.LinkedHashMap;
import java.util.Scanner;
//
public class FacilityServiceImpl implements IFacilityServices {
    @Override
    public void addHouse() {

    }

    @Override
    public void addVilla() {

    }

    @Override
    public void addRoom() {

    }

    @Override
    public void displayFacility() {

    }
}

//    Scanner sc = new Scanner(System.in);
//    private static LinkedHashMap<Facility,Integer> facilityList = new LinkedHashMap<>();
//
//    // Begin Add new facility
//    @Override
//    public void add() {
//        int choice;
//        do {
//            System.out.println("1.Add New Villa\n" +
//                    "2.Add New House\n" +
//                    "3.Add New Room\n" +
//                    "4.Back to menu");
//            System.out.println("input number:");
//            choice = Integer.parseInt(sc.nextLine());
//            switch (choice) {
//                case 1:
//                    Villa tempVilla = FacilityInputAndValidData.addNewVilla();
//                    facilityList.put(tempVilla,0);
//                    F.writeVillaCSV(facilityList);
//                    break;
//                case 2:
//                    House tempHouse = FacilityInputAndValidData.addNewHouse();
//                    facilityList.put(tempHouse,0);
//                    FacilityReadAndWriteFileCSV.writeHouseCSV(facilityList);
//                    break;
//                case 3:
//                    Room tempRoom = FacilityInputAndValidData.addNewRoom();
//                    facilityList.put(tempRoom,0);
//                    FacilityReadAndWriteFileCSV.writeRoomCSV(facilityList);
//                    break;
//                case 4:break;
//            }
//        } while (choice < 4);
//    }
//    @Override
//    public void displayFacilityNeedRepair() {
//        facilityList = FacilityReadAndWriteFileCSV.readAllFile();
//        for(Map.Entry<Facility,Integer> item : facilityList.entrySet()){
//            if(item.getValue() >= 5){
//                System.out.printf("%s - %s",item.getKey(),item.getValue());
//                System.out.println();
//            }
//        }
//    }
//    @Override
//    //Display the collection
//    public void display() {
//        facilityList = FacilityReadAndWriteFileCSV.readAllFile();
//        for(Map.Entry<Facility,Integer> item : facilityList.entrySet()){
//            System.out.printf("%s - %s",item.getKey(),item.getValue());
//            System.out.println();
//        }
//    }
//}