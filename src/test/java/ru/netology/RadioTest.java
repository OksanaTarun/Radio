package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void setCurrentChannelUp() {
        radio.setCurrentChannel(8);
        radio.setCurrentChannelUp();
        int expected = 9;
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    public void setCurrentChannelDown() {
        radio.setCurrentChannel(7);
        radio.setCurrentChannelDown();
        int expected = 6;
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    public void setCurrentChannel() {
        radio.setCurrentChannel(9);
        int expected = 9;
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    public void setMaxCurrentChannelUp() {
        radio.setCurrentChannel(9);
        int currentChannel = radio.nextMaxChannelUp();
        radio.setCurrentChannel(currentChannel);
        int expected = 0;
        assertEquals(expected, radio.nextMaxChannelUp());
    }

    @Test
    public void setMinCurrentChannelDown() {
        radio.setCurrentChannel(0);
        int currentChannel = radio.prevMinChannel();
        radio.setCurrentChannel(currentChannel);
        int expected = 9;
        assertEquals(expected, radio.prevMinChannel());
    }

    @Test
    public void setCurrentVolume() {
        radio.setCurrentVolume(7);
        int expected = 7;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeUp() {
        radio.setCurrentVolume(9);
        radio.setCurrentVolumeUp();
        int expected = 10;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeDown() {
        radio.setCurrentVolume(9);
        radio.setCurrentVolumeDown();
        int expected = 8;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setMaxCurrentVolumeUp() {
        radio.setCurrentVolume(10);
        radio.setCurrentVolumeUp();
        int expected = 10;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setMinCurrentVolumeDown() {
        radio.setCurrentVolume(0);
        radio.setCurrentVolumeDown();
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentChannelOverLimit() {
        radio.setCurrentChannel(10);
        int expected = 0;
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    public void setCurrentChannelUnderLimit() {
        radio.setCurrentChannel(-1);
        int expected = 0;
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    public void setCurrentVolumeOverLimit() {
        radio.setCurrentVolume(11);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeUnderLimit() {
        radio.setCurrentVolume(-1);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setNextMaxChannelUp() {
        radio.setCurrentChannel(9);
        radio.setCurrentChannelUp();
        int expected = 0;
        assertEquals(expected, radio.nextMaxChannelUp());
    }

    @Test
    public void setPrevChanneldown() {
        radio.setCurrentChannel(0);
        radio.setCurrentChannelDown();
        int expected = 0;
        assertEquals(expected, radio.nextMaxChannelUp());
    }
}