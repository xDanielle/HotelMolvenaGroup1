package com.capgemini.HotelMolvenaGr1;

public abstract class Room {

    public Room(){}

    private boolean isOccupied;

    private int roomID;

    private double defaultPrice;

    private int numberOfBeds;

    public abstract void calculateEventPrice();

    public void alterRoom(){

    }

}
