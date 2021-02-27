package ru.netology;

public class Radio {
    private int currentChannel;
    private int currentVolume;
    private int minChannel = 0;
    private int maxChannel = 9;
    private int minVolume = 0;
    private int maxVolume = 10;

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public void setCurrentChannelUp() {
        if (currentChannel == maxChannel) {
            this.currentChannel = minChannel;
        }
        this.currentChannel++;
    }

    public void setCurrentChannelDown() {
        if (currentChannel == minChannel) {
            this.currentChannel = maxChannel;
        }
        this.currentChannel--;
    }

    public int nextMaxChannelUp(){
        if(currentChannel == maxChannel);
        {
            maxChannel++;
        }
        return minChannel;
    }

    public int prevMinChannel(){
        if(currentChannel == minChannel);
        {
            minChannel--;
        }
        return maxChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
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

