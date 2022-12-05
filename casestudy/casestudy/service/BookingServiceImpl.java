package com.codegym.casestudy.service;

import com.codegym.casestudy.service.imple.IBookingService;
import com.codegym.casestudy.model.Booking;
import com.codegym.casestudy.model.Customer;
import com.codegym.casestudy.model.Facility;

import java.util.Date;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
//
public class BookingServiceImpl implements IBookingService {
    private static Scanner scanner = new Scanner(System.in);
    public static Set<Booking> bookingSet = new TreeSet<>();

    @Override
    public void addBooking() {

    }

    @Override
    public void displayBooking() {

    }

    @Override
    public void editBooking() {

    }



    @Override
    public void add() {
//        int id = 1;
//        if (!bookingSet.isEmpty()) {
//            id = bookingSet.size();
//        }
//        Date bookStarTime = RegexBooking.bookingStarTime();
//        Date bookEndTime = RegexBooking.bookingEndTime();
//        Facility facility = RegexBooking.bookFacility();
//        Customer customer = RegexBooking.bookCustomer();
//        Booking booking = new Booking(id, bookStarTime, bookEndTime, customer, facility);
//        bookingSet.add(booking);
//        ReadAndWrite.write(bookingSet, "D:\\Codegym\\Module2\\src\\castudymodule2\\data\\booking.csv");
//        if (RegexBooking.countBooking(facility.getIdFacility()) == 5) {
//            FacilityServiceImpl.listFacilityMaintain.put(facility, facility.getIdFacility());
//            ReadAndWrite.write((Collection) FacilityServiceImpl.listFacilityMaintain, "D:\\Codegym\\Module2\\src\\castudymodule2\\data\\facitilymaintain.csv");
//        }
    }

    @Override
    public void displayList() {
//        bookingSet = (Set<Booking>) ReadAndWrite.read("D:\\Codegym\\Module2\\src\\castudymodule2\\data\\booking.csv");
        if (bookingSet != null) {
            for (Booking booking : bookingSet) {
                System.out.println(booking.toString());
            }
        }
    }

    public Set<Booking> sendBooking() {
        return bookingSet;
    }
}
