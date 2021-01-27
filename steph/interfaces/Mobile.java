package com.viveros.steph.interfaces;

public class Mobile implements ITelephone {
    private  int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public Mobile(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Mobile Phone is on.");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now dialing " + phoneNumber + "ring ring ring");
        } else {
            System.out.println("Mobile phone is off");
        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Ring ring ");
        } else {
            isRinging = false;
            System.out.println("Mobile is off or different number");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
