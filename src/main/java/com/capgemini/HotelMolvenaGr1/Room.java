package com.capgemini.HotelMolvenaGr1;

import com.capgemini.HotelMolvenaGr1.Model.ERoomType;
import java.util.Date;

public class Room {

    // Variabelen
    private ERoomType roomType;

    private Date dateAvailable;

    private int roomID;

    private int roomSize;

    private double defaultPrice;

    private int numberOfBeds;

    // Constructor
    public Room(){}

    public Room(ERoomType roomType, Date dateAvailable, int roomID, double defaultPrice) {
        this.roomType = roomType;
        this.dateAvailable = dateAvailable;
        this.roomID = roomID;
        this.defaultPrice = defaultPrice;
    }

    // Methodess
    public void alterRoom(){

    }

    public void addRoom(){
        
    }

    public double calculateEventPrice() {
        double eventPrice = defaultPrice * 2;
        System.out.println("The new price of the room is: " + eventPrice + " euro.");
        return eventPrice;
    }

}
