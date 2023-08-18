package ru.netology.methods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.channels.Channel;

public class RadioTest {
    @Test
    public void shouldTestSetChannel() {
        Radio chan = new Radio();
        chan.setChannel(5);
        int expected = 5;
        int actual = chan.getChannel();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTestSetChannelUnderZero() {
        Radio chan = new Radio();
        chan.setChannel(-1);
        int expected = 0;
        int actual = chan.getChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChannelZero() {
        Radio chan = new Radio();
        chan.setChannel(0);
        int expected = 0;
        int actual = chan.getChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChannelOne() {
        Radio chan = new Radio();
        chan.setChannel(1);
        int expected = 1;
        int actual = chan.getChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChannelNine() {
        Radio chan = new Radio();
        chan.setChannel(9);
        int expected = 9;
        int actual = chan.getChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChannelEight() {
        Radio chan = new Radio();
        chan.setChannel(8);
        int expected = 8;
        int actual = chan.getChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChannelAboveNine() {
        Radio chan = new Radio();
        chan.setChannel(10);
        int expected = 9;
        int actual = chan.getChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestNextChannel() {
        Radio chan = new Radio();
        chan.setChannel(8);
        chan.nextChannel();
        int expected = 9;
        int actual = chan.getChannel();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testNextChannelIfItsNine() {
        Radio chan = new Radio();
        chan.setChannel(9);
        chan.nextChannel();
        int expected = 0;
        int actual = chan.getChannel();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testNextChanIfItsZero() {
        Radio chan = new Radio();
        chan.setChannel(0);
        chan.nextChannel();
        int expected = 1;
        int actual = chan.getChannel();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testPrevChannel() {
        Radio chan = new Radio();
        chan.setChannel(9);
        chan.prevChannel();
        int expected = 8;
        int actual = chan.getChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevChannelIfItsZero() {
        Radio chan = new Radio();
        chan.setChannel(0);
        chan.prevChannel();
        int expected = 9;
        int actual = chan.getChannel();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testPrevChannelIfItsOne() {
        Radio chan = new Radio();
        chan.setChannel(1);
        chan.prevChannel();
        int expected = 0;
        int actual = chan.getChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSetVolumeUnderZero() {
        Radio vol = new Radio();
        vol.setVolume(-1);
        int expected = 0;
        int actual = vol.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSetVolumeAboveHundred() {
        Radio vol = new Radio();
        vol.setVolume(101);
        int expected = 100;
        int actual = vol.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSetVolumeAsOne() {
        Radio vol = new Radio();
        vol.setVolume(1);
        int expected = 1;
        int actual = vol.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestVolumeUp() {
        Radio vol = new Radio();
        vol.setVolume(50);
        vol.volumeUp();
        int expected = 51;
        int actual = vol.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTestVolumeUpAboveHundred() {
        Radio vol = new Radio();
        vol.setVolume(100);
        vol.volumeUp();
        int expected = 100;
        int actual = vol.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestVolumeUpIfItsZero() {
        Radio vol = new Radio();
        vol.setVolume(0);
        vol.volumeUp();
        int expected = 1;
        int actual = vol.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestVolumeUpIfItsNinetyNine() {
        Radio vol = new Radio();
        vol.setVolume(99);
        vol.volumeUp();
        int expected = 100;
        int actual = vol.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestVolumeDown() {
        Radio vol = new Radio();
        vol.setVolume(100);
        vol.volumeDown();
        int expected = 99;
        int actual = vol.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestVolumeDownUnderZero() {
        Radio vol = new Radio();
        vol.setVolume(0);
        vol.volumeDown();
        int expected = 0;
        int actual = vol.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestVolumeDownIfItsOne() {
        Radio vol = new Radio();
        vol.setVolume(1);
        vol.volumeDown();
        int expected = 0;
        int actual = vol.getVolume();
        Assertions.assertEquals(expected, actual);
    }

}

