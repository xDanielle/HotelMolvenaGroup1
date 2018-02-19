package com.capgemini.HotelMolvenaGr1.Model;

public class Guest {

        private String firstName;

        private String lastName;

        private int passportNumber;

        private int phoneNumber;

        private String emailAddress;

        private boolean isCheckedIn;

        public Guest (String firstName, String lastName, int passportNumber, int phoneNumber, String emailAddress){
            this.firstName = firstName;
            this.lastName = lastName;
            this.passportNumber = passportNumber;
            this.phoneNumber = phoneNumber;
            this.emailAddress = emailAddress;
        }

        public void greetGuest() {
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

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public boolean isCheckedIn() {
        return isCheckedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        isCheckedIn = checkedIn;
    }
}
