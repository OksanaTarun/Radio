package ru.netology;

import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    int maxChannel = 10;
    Radio radio = new Radio(10);

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
    public void setCurrentVolume() {
        radio.setCurrentVolume(7);
        int expected = 7;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeUp() {
        radio.setCurrentVolume(16);
        radio.setCurrentVolumeUp();
        int expected = 17;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeDown() {
        radio.setCurrentVolume(50);
        radio.setCurrentVolumeDown();
        int expected = 49;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setMaxCurrentVolumeUp() {
        radio.setCurrentVolume(100);
        radio.setCurrentVolumeUp();
        int expected = 100;
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
        radio.setCurrentChannel(maxChannel + 1);
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
        radio.setCurrentVolume(111);
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
        radio.setCurrentChannel(maxChannel);
        radio.setCurrentChannelUp();
        int expected = 0;
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    public void setPrevChannelDown() {
        radio.setCurrentChannel(0);
        radio.setCurrentChannelDown();
        int expected = maxChannel;
        assertEquals(expected, radio.getCurrentChannel());
    }

}