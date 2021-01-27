package com.viveros.steph.interfaces;

public interface ITelephone {
    public void powerOn();
    public void dial(int phonenumber);
    public void answer();
    public boolean callPhone(int phonenumber);
    public boolean isRinging();
}
