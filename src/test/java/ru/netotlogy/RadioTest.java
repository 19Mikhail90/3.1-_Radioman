package ru.netotlogy;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test

    public void shouldChangeNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(5);
        rad.changeNumberStation();
        int expected = 5;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(5);
        rad.increaseNumberStation();
        int expected = 6;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldNotIncreaseNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(9);
        rad.increaseNumberStation();
        int expected = 9;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(5);
        rad.decreaseNumberStation();
        int expected = 4;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(0);
        rad.decreaseNumberStation();
        int expected = 0;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(9);
        rad.setMaxNumberStation();
        int expected = 0;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetMaxNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(3);
        rad.setMaxNumberStation();
        int expected = 3;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(0);
        rad.setMinNumberStation();
        int expected = 9;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetMinNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(4);
        rad.setMinNumberStation();
        int expected = 4;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreaseCurrentVolume() {
        Radio rad = new Radio();
        rad.setСurrentVolume(7);
        rad.increaseCurrentVolume();
        int expected = 8;
        int actual = rad.getСurrentVolume();
        assertEquals(expected, actual);
    }

    @Test

    public void shouldNotIncreaseCurrentVolume() {
        Radio rad = new Radio();
        rad.setСurrentVolume(10);
        rad.increaseCurrentVolume();
        int expected = 10;
        int actual = rad.getСurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio rad = new Radio();
        rad.setСurrentVolume(1);
        rad.decreaseCurrentVolume();
        int expected = 0;
        int actual = rad.getСurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseCurrentVolume() {
        Radio rad = new Radio();
        rad.setСurrentVolume(0);
        rad.decreaseCurrentVolume();
        int expected = 0;
        int actual = rad.getСurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxCurrentVolume() {
        Radio rad = new Radio();
        rad.setСurrentVolume(10);
        rad.setMaxCurrentValume();
        int expected = 10;
        int actual = rad.getСurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNotMaxCurrentVolume() {
        Radio rad = new Radio();
        rad.setСurrentVolume(7);
        rad.setMaxCurrentValume();
        int expected = 7;
        int actual = rad.getСurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinCurrentVolume() {
        Radio rad = new Radio();
        rad.setСurrentVolume(0);
        rad.setMinCurrentValume();
        int expected = 0;
        int actual = rad.getСurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNotMinCurrentVolume() {
        Radio rad = new Radio();
        rad.setСurrentVolume(5);
        rad.setMinCurrentValume();
        int expected = 5;
        int actual = rad.getСurrentVolume();
        assertEquals(expected, actual);
    }
}
