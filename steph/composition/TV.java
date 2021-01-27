package com.viveros.steph.composition;

public class TV {
    private String name;
    private boolean isOn;
    private int channel;

    public TV(String name, boolean isOn, int channel) {
        this.name = name;
        this.isOn = isOn;
        this.channel = channel;
    }

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getChannel() {
        return channel;
    }
}
