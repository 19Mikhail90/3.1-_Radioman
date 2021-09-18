package ru.netotlogy;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {


    @Test // тест на Сеттер №1
    public void shouldSetNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(4);
        int expected = 4;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }
    @Test // тест на Сеттер №2
    public void shouldSetSmallerNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(-1);
        int expected = 0;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }
    @Test // тест на Сеттер №3
    public void shouldSetGreaterNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(10);
        int expected = 0;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

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
    public void shouldIncreaseMaxNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(9);
        rad.increaseNumberStation();
        int expected = 0;
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
    public void shouldDecreaseMinNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(0);
        rad.decreaseNumberStation();
        int expected = 9;
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

    public void shouldIncreaseMaxCurrentVolume() {
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
        rad.setСurrentVolume(4);
        rad.decreaseCurrentVolume();
        int expected = 3;
        int actual = rad.getСurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseMinCurrentVolume() {
        Radio rad = new Radio();
        rad.setСurrentVolume(0);
        rad.decreaseCurrentVolume();
        int expected = 0;
        int actual = rad.getСurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseMaxCurrentVolume() {
        Radio rad = new Radio();
        rad.setСurrentVolume(10);
        rad.increaseCurrentVolume();
        int expected = 10;
        int actual = rad.getСurrentVolume();
        assertEquals(expected, actual);
    }


}
