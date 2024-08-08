package com.xworkz.hotelrooms;

import com.xworkz.hotelrooms.hotel.Hotel;
import com.xworkz.hotelrooms.rooms.Rooms;

public class HotelRoomsRunner {

    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        Rooms rooms = new Rooms();
        rooms.roomNum= 5;
        rooms.roomType="Deluxe";
        rooms.checkIn= "12:00 27/06/24";
        rooms.checkOut= "12:00 28/06/24";
        rooms.roomRate = 2489.45 ;


        Rooms rooms1 = new Rooms();
        rooms1.roomNum= 8;
        rooms1.roomType="Standard";
        rooms1.checkIn= "10:00 2/08/24";
        rooms1.checkOut= "10:00 3/08/24";
        rooms1.roomRate = 1000.00 ;

        hotel.roomavailable(rooms);
        hotel.roomavailable(rooms1);

    }
}
