package com.capgemini.HotelMolvenaGr1.controller;

import com.capgemini.HotelMolvenaGr1.model.Guest;
import com.capgemini.HotelMolvenaGr1.repository.GuestRegister;
import com.capgemini.HotelMolvenaGr1.repository.GuestRepository;
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


    @RequestMapping("/api/guest")
    public List<Guest> removeGuest() {
        GuestRegister removeGuest = new GuestRegister();
        removeGuest.removeGuest("Sasha");
        return removeGuest.getGuestList();
    }
}
