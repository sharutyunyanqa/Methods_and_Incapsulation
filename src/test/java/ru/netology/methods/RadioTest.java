package ru.netology.methods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.channels.Channel;

public class RadioTest {
    @Test
    public void shouldTestSetChannel(){
        Radio chan= new Radio();
        chan.setChannel(5);
        int expected=5;
        int actual= chan.getChannel();
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void shouldTestNextChannel(){
        Radio chan= new Radio();
        chan.setChannel(8);
        chan.nextChannel();
        int expected=9;
        int actual = chan.getChannel();
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void testNextChannelIfItsNine(){
        Radio chan= new Radio();
        chan.setChannel(9);
        chan.nextChannel();
        int expected=0;
        int actual= chan.getChannel();
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void testNextChanIfItsZero(){
        Radio chan = new Radio();
        chan.setChannel(0);
        chan.nextChannel();
        int expected=1;
        int actual=chan.getChannel();
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void testPrevChannel(){
        Radio chan= new Radio();
        chan.setChannel(9);
        chan.prevChannel();
        int expected=8;
        int actual= chan.getChannel();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testPrevChannelIfItsZero(){
        Radio chan= new Radio();
        chan.setChannel(0);
        testPrevChannel();
        int expected=9;
        int actual= chan.getChannel();
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void testPrevChannelIfItsOne(){
        Radio chan= new Radio();
        chan.setChannel(1);
        testPrevChannel();
        int expected=0;
        int actual=chan.getChannel();
        Assertions.assertEquals(expected,actual);
    }
    @Test
}

