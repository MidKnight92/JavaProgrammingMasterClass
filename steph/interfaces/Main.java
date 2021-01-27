package com.viveros.steph.interfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone stephPhone;
        stephPhone = new DeskPhone(312323);
        stephPhone.powerOn();
        stephPhone.callPhone(312323);
        stephPhone.answer();

        stephPhone = new Mobile(2193086);
        stephPhone.powerOn();
        stephPhone.callPhone(2193086);
        stephPhone.answer();
    }
}
