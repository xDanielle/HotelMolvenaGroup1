package com.capgemini.HotelMolvenaGr1.Model;

import com.capgemini.HotelMolvenaGr1.ERoomType;

import java.util.ArrayList;
import java.util.Date;

public class Room {

    // Variabelen
    private ERoomType roomType;

    private Date dateAvailable;

    private int roomID;

    private int roomSize;

    private double defaultPrice;

    private int numberOfBeds;

    // List of rooms

    ArrayList<Room> roomList = new ArrayList<>();

    // Constructor

    public Room(ERoomType roomType, Date dateAvailable, int roomID, double defaultPrice) {
        this.roomType = roomType;
        this.dateAvailable = dateAvailable;
        this.roomID = roomID;
        this.defaultPrice = defaultPrice;
    }

    // Methodess
    public void alterRoom(){

    }

    public void addRoom(Room room){
        // adds a room to the list of all rooms.
        roomList.add(room);
    }

    public double calculateEventPrice() {
        double eventPrice = defaultPrice * 2;
        System.out.println("The new price of the room is: " + eventPrice + " euro.");
        return eventPrice;
    }

}
