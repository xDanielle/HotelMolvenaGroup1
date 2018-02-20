package com.capgemini.HotelMolvenaGr1;

import com.capgemini.HotelMolvenaGr1.Model.Room;

import java.util.ArrayList;
import java.util.Date;

public class RoomRegister {
    // List of rooms

    ArrayList<Room> roomList = new ArrayList<>();

    // Getters setters

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }

    // Methodes

    public void addRoom(ERoomType roomType, boolean isAvailable, int roomID, double defaultPrice){
        roomList.add(new Room(roomType, isAvailable, roomID, defaultPrice));
    }
}
