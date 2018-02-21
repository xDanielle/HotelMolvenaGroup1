package com.capgemini.HotelMolvenaGr1.Model.Guest;

import java.util.ArrayList;

public class Guest {
    // start data of the guests
    private String firstName;
    private String lastName;
    private String address;
    private String postalCode;
    private String town;
    private String country;
    private String telephoneNumber;
    private String emailAddress;


    public Guest(String firstName, String lastName, String address, String postalCode, String town,
                 String country, String telephoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.postalCode = postalCode;
        this.town = town;
        this.country = country;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
    }

    public void greetGuest(){
        System.out.println("Welcome " + this.firstName + " " + this.lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
