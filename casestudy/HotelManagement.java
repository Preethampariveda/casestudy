package com.casestudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelManagement {
    static List<Hotel> hotelList = HotelDataBase.getAllHotels();
    static List<Integer> bookings = new ArrayList<>();
    public static void availableHotelRooms(){
        hotelList.forEach(Hotel -> System.out.println("hotel name :"+Hotel.getHotelName()+" <--> Available rooms :"+Hotel.getRoomnumber()));
    }
    public static List<Integer> Bookings( String name,int number){
        bookings.add(210);
        if (hotelList.stream().anyMatch(Hotel -> Hotel.getHotelName().contains(name))
                && hotelList.stream().anyMatch(Hotel -> Hotel.getRoomnumber().contains(number))) {
            bookings.add(number);
        }
        else{
            System.out.println("The requested room or hotel is currently not available");
        }
        return bookings;
    }
    public static void cancellations(int number){
        if (bookings.contains(number)){
            bookings.remove(bookings.size()-1);
        }
        else{
            System.out.println("Your booking is not confirmed yet. Please try after some time");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The hotels and their respective rooms available for bookings are");
        availableHotelRooms();
        System.out.println("Enter the Hotel Name");
        String name = sc.nextLine();
        System.out.println("Enter the Room number");
        int number = sc.nextInt();
        System.out.println(Bookings(name,number));
        System.out.println("Enter Check in time in 24 Hours format");
        double ci = sc.nextDouble();
        System.out.println("Enter Check out time in 24 Hours format");
        double co = sc.nextDouble();
        System.out.println("Your booking for the Room number "+number+" in the hotel "+name+" is confirmed. Your check in time is "+ci+" o'clock and check out time is "+co+" o'clock");
        System.out.println("press 1 to continue else press 2 to cancel" );
        int c = sc.nextInt();
        if (c==2){
            cancellations(number);
        }
        else {
            System.out.println("Thank You for your booking.Have a nice day");
        }
        System.out.println(bookings);
    }
}
