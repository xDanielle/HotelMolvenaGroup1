package com.capgemini.HotelMolvenaGr1.Model;
import com.capgemini.HotelMolvenaGr1.ERoomType;
import java.util.Date;

public class Room {

    // Variabelen
    private ERoomType roomType;

//    private Date dateAvailable;

    private boolean isAvailable;

    private int roomID;

//    private int roomSize;

    private double defaultPrice;

//    private int numberOfBeds;

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

//    public int getRoomSize() {
//        return roomSize;
//    }
//
//    public void setRoomSize(int roomSize) {
//        this.roomSize = roomSize;
//    }

    public double getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(double defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

//    public int getNumberOfBeds() {
//        return numberOfBeds;
//    }
//
//    public void setNumberOfBeds(int numberOfBeds) {
//        this.numberOfBeds = numberOfBeds;
//    }

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