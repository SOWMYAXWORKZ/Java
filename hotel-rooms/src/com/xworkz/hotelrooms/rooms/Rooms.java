package com.xworkz.hotelrooms.rooms;

public class Rooms {

    public int roomNum;
    public String roomType;
    public String  checkIn;
    public String checkOut;
    public double roomRate;

    public void  roomDetails(){
        System.out.println("The Room Number         : " + this.roomNum);
        System.out.println("The Room Type           : " + this.roomType);
        System.out.println("The CheckIn Time        : " + this.checkIn);
        System.out.println("The CheckOut Time       : " + this.checkOut);
        System.out.println("The Room Cost           : " + this.roomRate);

    }
}
