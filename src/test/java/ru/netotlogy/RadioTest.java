package ru.netotlogy;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test // тест на выбор станции
    public void shouldSetNumberStation(){
        Radio radio = new Radio(5);
        assertEquals(5, radio.getNumberStation());
    }
    @Test // тест на выбор станции по умолчанию. Решил его сделать так как не понятно какая станция будет без выбора определенной, например при включении устройства.
    public void shouldSetDefaultNumberStation(){
        Radio radio = new Radio();
        assertEquals(0, radio.getNumberStation());
    }

    @Test
    // тест на Сеттер для номера станции №1
    public void shouldSetterNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(4);
        int expected = 4;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test // тест на Сеттер для номера станции №2
    public void shouldSetSmallerNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(-1);
        int expected = 0;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test // тест на Сеттер для уровня громкости №3
    public void shouldSetGreaterNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(10);
        int expected = 9;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test // тест на Сеттер для уровня громкости №1
    public void shouldSetCurrentVolume() {
        Radio rad = new Radio();
        rad.setСurrentVolume(5);
        int expected = 5;
        int actual = rad.getСurrentVolume();
        assertEquals(expected, actual);
    }

    @Test // уменьшение громкости меньше минимальной
    public void shouldSetSmallerCurrentVolume() {
        Radio rad = new Radio();
        rad.setСurrentVolume(-1);
        int expected = 0;
        int actual = rad.getСurrentVolume();
        assertEquals(expected, actual);
    }

    @Test // увеличение громкости больше максимальной
    public void shouldSetGreaterCurrentVolume() {
        Radio rad = new Radio();
        rad.setСurrentVolume(101);
        int expected = 100;
        int actual = rad.getСurrentVolume();
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
    public void shouldIncreasePenultimateNumberStation() { // тут тестируем предпоследний номер станции
        Radio rad = new Radio();
        rad.setNumberStation(8);
        rad.increaseNumberStation();
        int expected = 9;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxNumberStation() { // тут тестируем последний номер станции
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
    public void shouldDecreasePenultimateNumberStation() { // тут тестируем второй номер станции
        Radio rad = new Radio();
        rad.setNumberStation(1);
        rad.decreaseNumberStation();
        int expected = 0;
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
    public void shouldIncreasePenultimateCurrentVolume() { // тут тестируем предпоследнее переключение громкости
        Radio rad = new Radio();
        rad.setСurrentVolume(99);
        rad.increaseCurrentVolume();
        int expected = 100;
        int actual = rad.getСurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxCurrentVolume() {
        Radio rad = new Radio();
        rad.setСurrentVolume(100);
        rad.increaseCurrentVolume();
        int expected = 100;
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
    public void shouldDecreasePenultimateCurrentVolume() { //тут уменьшаем со второго значения
        Radio rad = new Radio();
        rad.setСurrentVolume(1);
        rad.decreaseCurrentVolume();
        int expected = 0;
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
}
