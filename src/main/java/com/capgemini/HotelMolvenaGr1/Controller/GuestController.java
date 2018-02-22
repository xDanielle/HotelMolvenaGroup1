package com.capgemini.HotelMolvenaGr1.Controller;


import com.capgemini.HotelMolvenaGr1.Model.Guest.Guest;
import com.capgemini.HotelMolvenaGr1.Repository.GuestRegister;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class GuestController {
    @RequestMapping("/api/found")
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
