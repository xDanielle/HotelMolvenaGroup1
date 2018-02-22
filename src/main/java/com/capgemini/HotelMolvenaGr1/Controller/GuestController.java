package com.capgemini.HotelMolvenaGr1.Controller;

import com.capgemini.HotelMolvenaGr1.Model.Guest.Guest;
import com.capgemini.HotelMolvenaGr1.Model.Guest.GuestRegister;
import com.capgemini.HotelMolvenaGr1.Repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/guest/")
public class GuestController {
    @Autowired
    private GuestRepository guestRepository;

    @RequestMapping(value="index", method= RequestMethod.GET)
    public List<Guest> index(){
        return guestRepository.getGuestList();
    }

    // you can add information to start with constructor
    @RequestMapping(value="saved", method = RequestMethod.POST)
    public void saveGuestList(@RequestBody Guest guestToSave){
        guestRepository.saveGuestList(guestToSave);
    }



    public String searchGuest(){
        GuestRegister guest = new GuestRegister();
        boolean result = guest.searchGuest("Sasha");
        if(result) {
            return "found";
        }else{
            return "not found";
        }
    }

    @RequestMapping("/api/guest")
    public List<Guest> removeGuest() {
        GuestRegister removeGuest = new GuestRegister();
        removeGuest.removeGuest("Sasha");
        return removeGuest.getGuestList();
    }

}
