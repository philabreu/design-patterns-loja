package adapter;

import org.example.bridge.AdvancedRemote;
import org.example.bridge.BasicRemote;
import org.example.bridge.Radio;
import org.example.bridge.TV;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BridgeTest {

    private AdvancedRemote advancedRemote;

    private Radio radio;

    private TV tv;

    private BasicRemote radioControl;

    private BasicRemote tvControl;

    @BeforeEach
    public void init() {
        radio = new Radio();
        tv = new TV();
        advancedRemote = new AdvancedRemote(radio);
        radioControl = new BasicRemote(radio);
        tvControl = new BasicRemote(tv);
    }

    @Test
    public void shouldMuteRadio() {
        advancedRemote.mute();

        assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldPowerOnRadio() {
        radioControl.power();

        assertTrue(radio.isEnabled());
    }

    @Test
    public void shouldVolumeDown(){
        radio.setVolume(20);
        radioControl.volumeDown();

        assertEquals(10, radio.getVolume());
    }

    @Test
    public void shouldVolumeUp(){
        radio.setVolume(5);
        radioControl.volumeUp();

        assertEquals(15, radio.getVolume());
    }

    @Test
    public void shouldChannelDown(){
        tv.setChannel(7);
        tvControl.channelDown();

        assertEquals(6, tv.getChannel());
    }

    @Test
    public void shouldChannelUp(){
        tv.setChannel(11);
        tvControl.channelUp();

        assertEquals(12, tv.getChannel());
    }
}
