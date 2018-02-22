package com.capgemini.HotelMolvenaGr1.Model.Guest;

import com.capgemini.HotelMolvenaGr1.Model.Guest.Guest;

import java.util.ArrayList;

public class GuestRegister {
    ArrayList<Guest> guestList = new ArrayList<Guest>();


    public boolean searchGuest(String firstName) {
            for(Guest list : guestList){
                if(list.equals(firstName)){
                    return true;
                }
            }
            return false;
    }

    public void removeGuest(String firstName) {
        for(Guest list : guestList){
            if(list.equals(firstName)){
                guestList.remove(firstName);
            }
        }
    }

        public ArrayList<Guest> getGuestList () {
            return guestList;
        }

        public void setGuestList (ArrayList < Guest > guestList) {
            this.guestList = guestList;
        }

}


