package com.capgemini.HotelMolvenaGr1.Model;
import com.capgemini.HotelMolvenaGr1.ERoomType;

public class Room {

    // Variabelen
    private ERoomType roomType;
    private boolean isAvailable;
    private int roomID;
    private double defaultPrice;


    // Constructor

    public Room(ERoomType roomType, boolean isAvailable, int roomID, double defaultPrice) {
        this.roomType = roomType;
        this.isAvailable = isAvailable;
        this.roomID = roomID;
        this.defaultPrice = defaultPrice;
    }

    // Getters setters


    public ERoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(ERoomType roomType) {
        this.roomType = roomType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }


    public double getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(double defaultPrice) {
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