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


    @RequestMapping(value="api/search/{0}", method = RequestMethod.GET)
    public List<Guest> searchGuests(@PathVariable String searchTerm) {
        return this.guestRepository.search(searchTerm);
    }

    // you can add information to start with constructor
    @RequestMapping(value="change", method = RequestMethod.POST)
    public void rememberGuest(@RequestBody Guest guestToRemember){
        guestRepository.rememberGuest(guestToRemember);
    }


    @RequestMapping("/api/guest")
    public List<Guest> removeGuest() {
        GuestRegister removeGuest = new GuestRegister();
        removeGuest.removeGuest("Sasha");
        return removeGuest.getGuestList();
    }

    @RequestMapping(value = "api/guest/delete", method = RequestMethod.DELETE)
    public void deleteGuest()
    {
        guestRepository.deleteGuest();
    }

    @RequestMapping(value = "api/guest/change", method = RequestMethod.POST)
    public void changeGuest(@RequestBody String firstName, String lastName, String address, String postalCode, String town, String country, String telephoneNumber, String emailAddress){
        guestRepository.changeGuest(firstName, lastName, address, postalCode, town, country, telephoneNumber, emailAddress);
    }



}
