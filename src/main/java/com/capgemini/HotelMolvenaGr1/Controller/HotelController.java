package com.capgemini.HotelMolvenaGr1.Controller;
import com.capgemini.HotelMolvenaGr1.ERoomType;
import com.capgemini.HotelMolvenaGr1.Model.Guest.Guest;
import com.capgemini.HotelMolvenaGr1.Repository.GuestRegister;
import com.capgemini.HotelMolvenaGr1.Model.Room;
import com.capgemini.HotelMolvenaGr1.RoomRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {

    private Guest guest;

    private Room room;

    //private Staff staff;

    //private Booking booking;

    @GetMapping("/voorbeeld")
    public String Voorbeeld() {
        return "<h1> Het voorbeeld werkt ook! <br><br> Verander deze pagina in de HotelController </h1>";
    }

    public void greet(){
        guest.greetGuest();
    }

    @RequestMapping("/api/guest")
    public List<Guest> getGuests(){
        GuestRegister newGuest = new GuestRegister();
        newGuest.addGuest("Sasha", "Vollebregt", "Sportlaan 116", "1072GG",
                "London", "Netheraldo", "0640718383", "volle@gmail.com");
        newGuest.addGuest("Frank", "Vollebregt", "Sportlaan 116", "1072GG",
                "Paris", "Netheraldo", "8282282883", "volle@gmail.com");
        return newGuest.getGuestList();
    }

    @RequestMapping("/api/room")
    public List<Room> getRooms(){
        RoomRepository newRoom = new RoomRepository();
        newRoom.addRoom(ERoomType.STANDARD, true, 1, 89);
        newRoom.addRoom(ERoomType.LUXURY, true, 2, 149);
        newRoom.addRoom(ERoomType.HONEYMOON_SUITE, true, 3, 345);
        return newRoom.getRoomList();
    }

    // public void checkIn();

    // public void checkOut();

    // public void pay();

}
