package ru.netology.methods;

public class Radio {
    private int channel;
    private int volume;
    private int maxChannel;

    public Radio() {
        this.maxChannel = 9;
    }

    public Radio(int channelsCount) {
        this.maxChannel = channelsCount - 1;
    }

    public void nextChannel() {
        channel++;
        if (channel > maxChannel) {
            channel -= (maxChannel + 1);
        }

    }

    public void prevChannel() {
        channel--;
        if (channel < 0) {
            channel += (maxChannel + 1);
        }
    }

    public void setChannel(int userChannel) {
        if (userChannel > maxChannel) {
            userChannel = maxChannel;
        }
        if (userChannel < 0) {
            userChannel = 0;
        }
        channel = userChannel;
    }

    public void volumeDown() {
        volume--;
        if (volume < 0) {
            volume = 0;
        }
    }

    public void volumeUp() {
        volume++;
        if (volume > 100) {
            volume = 100;
        }

    }

    public void setVolume(int newVolume) {
        volume = newVolume;
        if (volume < 0) {
            volume = 0;
        }
        if (volume > 100) {
            volume = 100;
        }
    }

    public int getVolume() {
        return volume;
    }

    public int getChannel() {
        return channel;
    }
}
