package com.capgemini.HotelMolvenaGr1.Controller;
import com.capgemini.HotelMolvenaGr1.Model.Guest;
import com.capgemini.HotelMolvenaGr1.Room;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

    // public void checkIn();

    // public void checkOut();

    // public void pay();

}
