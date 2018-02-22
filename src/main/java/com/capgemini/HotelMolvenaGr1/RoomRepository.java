package com.capgemini.HotelMolvenaGr1;

import com.capgemini.HotelMolvenaGr1.Model.Room;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class RoomRepository {

    private Room room;

    // List of rooms

    ArrayList<Room> rooms = new ArrayList<>();

    public RoomRepository() {
    this.rooms = new ArrayList<>();

    Room room1 = new Room();
    room1.setRoomType(ERoomType.STANDARD);
    room1.setAvailable(true);
    room1.setRoomID(1);
    room1.setDefaultPrice(89);

    Room room2 = new Room();
    room2.setRoomType(ERoomType.LUXURY);
    room2.setAvailable(true);
    room2.setRoomID(2);
    room2.setDefaultPrice(149);

    this.rooms.add(room1);
    this.rooms.add(room2);

    }

    // Getters setters

    public ArrayList<Room> getRoomList() {
        return rooms;
    }

    public void setRoomList(ArrayList<Room> roomList) {
        this.rooms = roomList;
    }

    // Methodes


    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public Room save(Room room){
        rooms.add(room);
        return room;
    }

    public Room changeRoomType(Room room, ERoomType roomType){
        this.room.setRoomType(roomType);
        return room;
    }

    // alter a roomType
//    public Room alterRoom(int roomID, ERoomType roomType) {
//        if (room.getRoomID() == roomID) {
//            this.room.setRoomType(roomType);
//        }
//        return room;
//    }

}
