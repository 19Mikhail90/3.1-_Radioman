package ru.netotlogy;

public class Radio {
    private int numberStation = 0;
    private int minNumberStation = 0;
    private int maxNumberStation = 9;
    private int currentVolume = 0;
    private int minCurrentVolume = 0;
    private int maxCurrentVolume = 10;


    public void setNumberStation(int newNumberStation) { // тут задаем значение станции
        if (newNumberStation < minNumberStation) {
            return;
        }
        if (newNumberStation > maxNumberStation) {
            numberStation = maxNumberStation;
        } else {
            numberStation = newNumberStation;
        }
    }

    public int getNumberStation() { // тут отдаём значение станции
        return numberStation;
    }

    public void setСurrentVolume(int newСurrentVolume) { // тут задаем значение станции
        if (newСurrentVolume < minCurrentVolume) {
            return;
        }
        if (newСurrentVolume > maxCurrentVolume) {
            currentVolume = maxCurrentVolume;
        } else {
            currentVolume = newСurrentVolume;
        }

    }

    public int getСurrentVolume() { // тут отдаём значение станции
        return currentVolume;
    }

    public void changeNumberStation() { // метод для ручного выставления станции
        return; // по условию возможен ввод числе от 0 до 9 - условия раннего выхода не нужны.
    }

    public void increaseNumberStation() { // тут переключаем на след станцию
        if (numberStation <= maxNumberStation) {
            numberStation = numberStation + 1;
        }
        if (numberStation == maxNumberStation) {
            return;
        }
        if (numberStation > maxNumberStation) {
            numberStation = minNumberStation;
        }
    }


    public void decreaseNumberStation() { // тут переключаем на предыдущую станцию
        if (numberStation > minNumberStation) {
            numberStation = numberStation - 1;
        }
        if (numberStation == minNumberStation) {
            numberStation = maxNumberStation;
        }
    }

    public void increaseCurrentVolume() { // тут увеличиваем громкость
        if (currentVolume < maxCurrentVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == maxCurrentVolume) {
            currentVolume = maxCurrentVolume;
        }
    }


    public void decreaseCurrentVolume() { // тут уменьшаем громкость
        if (currentVolume > minCurrentVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == minCurrentVolume) {
            currentVolume = minCurrentVolume;
        }
    }

}
