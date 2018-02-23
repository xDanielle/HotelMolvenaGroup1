package com.capgemini.HotelMolvenaGr1;

import com.capgemini.HotelMolvenaGr1.model.Room;

import java.util.ArrayList;

public class RoomRegister {

    private Room room;

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

    public void addRoom(ERoomType roomType, boolean isAvailable, int roomID, double defaultPrice) {
        roomList.add(new Room(roomType, isAvailable, roomID, defaultPrice));
    }

    public Room alterRoom(int roomID, ERoomType roomType) {
        if (room.getRoomID() == roomID) {
            this.room.setRoomType(roomType);
        }
        return room;
    }

}
