package com.viveros.steph.arrlistchallenge;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MobilePhone {
    
    private ArrayList<Contacts> contacts = new ArrayList<>();
    
    public void printOptions(){
        System.out.print("\nPlease enter one of the following options: " +
                "\n\t 0 - To print choice options." +
                "\n\t 1 - To print the list of contacts." +
                "\n\t 2 - To add a contact to list of contacts" +
                "\n\t 3 - To update a contact in the list of contacts." +
                "\n\t 4 - To remove a contact from the list of contacts." +
                "\n\t 5 - To search a contact in the list of contacts." +
                "\n\t 6 - To quit the application." +
                "\nChoice: ");
    }
    
    public boolean processInput(int choiceNumber, String[] contactInfo){
        switch (choiceNumber){
            case 0:
                printOptions();
                break;
            case 1:
                printContacts();
                break;
            case 2:
                storeContact(contactInfo);
                break;
            case 3:
                modifyContact(contactInfo);
                break;
            case 4:
                removeContact(contactInfo);
                break;
            case 5:
                printContacts(queryContact(contactInfo));
                break;
            case 6:
                System.out.println("Exiting");
                return true;
        }
        return false;
    }
    private void storeContact(String[] contactInfo){
        Contacts existingContact = queryContact(contactInfo);
        if (existingContact == null){
            String name = contactInfo[0] + " " + contactInfo[1];
            String number = contactInfo[2];
            Contacts contact = Contacts.createContact(name, number);
            contacts.add(contact);
            System.out.println("Contact successfully added.");
        } else {
            System.out.println("Contact or phone number has already been added to contact list");
        }
    }

    private void modifyContact(String[] contactInfo){
        String name = contactInfo[3] + " " + contactInfo[4];
        Contacts contact = queryContact(contactInfo);
        assert contact != null;
        contact.setContactName(name);
        contact.setPhoneNumber(contactInfo[5]);
        System.out.println("Contact updated");
    }
    private void removeContact(String[] contactInfo){
        Contacts contact = queryContact(contactInfo);
        ArrayList<Contacts>  contacts = getContacts();
        if (contacts.contains(contact)){
            System.out.println("Contact removed.");
            contacts.remove(contact);
        } else {
            System.out.println("Contact does not exist in your contact list.");
        }
    }
    private Contacts queryContact(String[] contactInfo){
        String name = contactInfo[0] + " " + contactInfo[1];
        String number = contactInfo[2];
        for (Contacts contact:contacts) {
            if (contact.getContactName().equals(name) || contact.getPhoneNumber().equals(number)){
                return contact;
            }
        }
        return null;
    }
    private ArrayList<Contacts> getContacts(){
        return contacts;
    }
    private void printContacts(){
        ArrayList<Contacts> contacts = getContacts();
        System.out.println("Contact List:");
        if (contacts.size() > 0){
            for (Contacts contact: contacts){
                System.out.println("\t" + contact.getContactName() + ": " + contact.getPhoneNumber());
            }
        } else {
            System.out.println("0 contacts");
        }

    }

    private void printContacts(Contacts contact){
        if (contact != null){
            System.out.println("Contact Found:\n" + contact.getContactName() + " " + contact.getPhoneNumber());
        } else {
            System.out.println("Contact does not exist.");
        }
    }
}
