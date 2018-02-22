package com.capgemini.HotelMolvenaGr1.Controller;
import com.capgemini.HotelMolvenaGr1.ERoomType;
import com.capgemini.HotelMolvenaGr1.Model.Guest.Guest;
import com.capgemini.HotelMolvenaGr1.Model.Room;
import com.capgemini.HotelMolvenaGr1.RoomRepository;
import org.springframework.web.bind.annotation.*;

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
//
//    @RequestMapping("/api/guest")
//    public List<Guest> getGuests(){
//        GuestRegister newGuest = new GuestRegister();
//        newGuest.addGuest("Sasha", "Vollebregt", "Sportlaan 116", "1072GG",
//                "London", "Netheraldo", "0640718383", "volle@gmail.com");
//        newGuest.addGuest("Frank", "Vollebregt", "Sportlaan 116", "1072GG",
//                "Paris", "Netheraldo", "8282282883", "volle@gmail.com");
//        return newGuest.getGuestList();
//    }

    private RoomRepository roomRepository;

    @RequestMapping(value = "api/rooms/get", method = RequestMethod.GET)
    public Iterable<Room> index(){
        return roomRepository.getRooms();
    }

    @RequestMapping(value = "api/rooms/save", method = RequestMethod.POST)
    public void save(@RequestBody Room roomToSave){
        roomRepository.save(roomToSave);
    }

    // public void checkIn();

    // public void checkOut();

    // public void pay();

}
