package com.casestudy;

import java.util.Arrays;
import java.util.List;

public class HotelDataBase {
    public static List<Hotel> getAllHotels()
    {
       Hotel hotel1 = new Hotel("taj",Arrays.asList(201,202,203,204,205));
       Hotel hotel2 = new Hotel("radisson",Arrays.asList(201,202,203,204,205));
       Hotel hotel3 = new Hotel("lemonTree",Arrays.asList(201,202,203,204,205));
       Hotel hotel4 = new Hotel("trident",Arrays.asList(201,202,203,204,205));
       Hotel hotel5 = new Hotel("oyo",Arrays.asList(201,202,203,204,205));

        return Arrays.asList(hotel1,hotel2,hotel3,hotel4,hotel5);
    }

}
