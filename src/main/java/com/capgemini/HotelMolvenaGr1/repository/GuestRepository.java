package com.capgemini.HotelMolvenaGr1.repository;

import com.capgemini.HotelMolvenaGr1.model.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestRepository {
    private List<Guest> guestList = new ArrayList<Guest>();

    public GuestRepository(){
        Guest newGuest = new Guest();
        newGuest.setFirstName("Henk");
        newGuest.setLastName("Vol");
        newGuest.setAddress("sp");
        newGuest.setCountry("hol");
        newGuest.setEmailAddress("@");
        newGuest.setPostalCode("22");
        newGuest.setTelephoneNumber("aapp");
        newGuest.setTown("what");
        this.guestList.add(newGuest);

        Guest newGuest2 = new Guest();
        newGuest2.setFirstName("Aap");
        newGuest2.setLastName("Taal");
        newGuest2.setAddress("sp");
        newGuest2.setCountry("hol");
        newGuest2.setEmailAddress("@");
        newGuest2.setPostalCode("22");
        newGuest2.setTelephoneNumber("aapp");
        newGuest2.setTown("what");
        this.guestList.add(newGuest2);
    }

    public List<Guest> getGuestList() {
        return guestList;
    }

    public Guest saveGuestList(Guest guest) {
       guestList.add(guest);
       return guest;
    }

    public List<Guest> search(String searchTerm) {
        String searchTermLower;
        String lastNameLower;
        List<Guest> searchResults = new ArrayList<>();
        searchTermLower = searchTerm.toLowerCase();

        for (Guest guest : guestList) {
            lastNameLower = guest.getLastName().toLowerCase();
            if (lastNameLower.contains(searchTermLower)) {
                searchResults.add(guest);

            }
        }
        return searchResults;
    }
}
