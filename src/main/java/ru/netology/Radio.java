package ru.netology;

public class Radio {
    private int currentChannel;
    private int currentVolume;
    private int minChannel = 0;
    private int maxChannel = 10;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public int getCurrentChannel() {

        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            return;
        }
        if (currentChannel < minChannel) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public void setCurrentChannelUp() {
        if (currentChannel == maxChannel) {
            this.currentChannel = minChannel;
        } else {
            this.currentChannel++;
        }
    }

    public void setCurrentChannelDown() {
        if (currentChannel == minChannel) {
            this.currentChannel = maxChannel;
        } else {
            this.currentChannel--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentVolumeUp() {
        if (currentVolume == maxVolume)
            return;
        this.currentVolume++;
    }

    public void setCurrentVolumeDown() {
        if (currentVolume == minVolume)
            return;
        this.currentVolume--;
    }
}
