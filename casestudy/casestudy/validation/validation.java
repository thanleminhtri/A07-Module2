//package com.codegym.casestudy.validation;
//import com.codegym.casestudy.validation.AgeException
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//put.setLenient(false);
//        Date birtDay;
//        try {
//            birtDay = format.parse(BirtdayAsString);
//            Date now = new Date();
//            if (now.getYear() - birtDay.getYear() < 18 || now.getYear() - birtDay.getYear() > 100) {
//                throw new AgeException(Message.AGE_LESS_THAN);
//            }
//            return birtDay;
//        } catch (ParseException e){
//        throw new AgeException(Message.DATE_FORMAT);
//        }
//        }
//        }
//        public  class Validator {
//            public static Date validateBirtday(String BirtdayAsString) throws AgeException {
//                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//
//            }
//
//        }
//
//    public static Date validateBookingtime(String BookkingTime) throws AgeException {
//        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//        format.setLenient(false);
//        Date bookTime;
//        try {
//            bookTime = format.parse(BookkingTime);
//            return bookTime;
//        } catch (ParseException e) {
//            throw new AgeException(Message.DATE_FORMAT);
//        }
//    }
//
//    public static Date validateBookingDay(String BookkingDay) throws AgeException {
//        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//        format.setLenient(false);
//        Date bookDay;
//        try {
//            bookDay = format.parse(BookkingDay);
//            return bookDay;
//        } catch (ParseException e) {
//            throw new AgeException(Message.DATE_FORMAT);
//        }
//    }
//}