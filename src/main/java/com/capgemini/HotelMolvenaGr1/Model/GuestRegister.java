package com.capgemini.HotelMolvenaGr1.Model;

import java.util.ArrayList;

public class GuestRegister {
        ArrayList<Guest> guestList = new ArrayList<Guest>();

        public void addGuest(String firstName, String lastName, String address, String postalCode, String town,
                             String country, String telephoneNumber, String emailAddress){
            guestList.add(new Guest(firstName, lastName,
                    address, postalCode, town, country, telephoneNumber, emailAddress));
        }

        public ArrayList<Guest> getGuestList() {
            return guestList;
        }

        public void setGuestList(ArrayList<Guest> guestList) {
            this.guestList = guestList;
        }
    }


