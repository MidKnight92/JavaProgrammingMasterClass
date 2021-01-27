package com.viveros.steph.arrlistchallenge;

public class Contacts {
    private String contactName;
    private String phoneNumber;

    public Contacts(String contactName){
        this(contactName, null);
    }

    public Contacts(String contactName, String phoneNumber){
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public static Contacts createContact(String contactName, String phoneNumber){
        return new Contacts(contactName, phoneNumber);
    }
}
