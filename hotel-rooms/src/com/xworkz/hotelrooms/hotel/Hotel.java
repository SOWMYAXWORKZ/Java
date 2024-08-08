package com.xworkz.hotelrooms.hotel;

import com.xworkz.hotelrooms.rooms.Rooms;

public class Hotel {

    Rooms rooms;

    public void roomavailable(Rooms rooms){
        this.rooms=rooms;
        this.rooms.roomDetails();
    }
}
