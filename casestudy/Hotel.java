package com.casestudy;

import java.util.List;

public class Hotel {
    public String hotelname;
    public List<Integer> roomnumber;

    public Hotel(String hotelname, List<Integer> roomnumber) {
        this.hotelname = hotelname;
        this.roomnumber = roomnumber;
    }


    public List<Integer> getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(List<Integer> roomnumber) {
        this.roomnumber = roomnumber;
    }
    public String getHotelName() {
        return hotelname;
    }

    public void setHotelName(String hotelname) {
        this.hotelname = hotelname;
    }

}
