public class Radio {
    private int currentRadioFrequency;
    private int currentRadioVolume;
    private int maxStationFrequency = 9;
    private int minStationFrequency = 0;

    public Radio() {
    }

    public Radio(int stationsCount) {
        maxStationFrequency = stationsCount - 1;
    }

    public int getCurrentRadioFrequency() {
        return currentRadioFrequency;
    }

    public void setCurrentRadioFrequency(int newCurrentRadioFrequency) {
        if (newCurrentRadioFrequency < minStationFrequency) {
            return;
        }
        if (newCurrentRadioFrequency > maxStationFrequency) {
            return;
        }
        currentRadioFrequency = newCurrentRadioFrequency;
    }

    public void nextRadioFrequency() {
        if (currentRadioFrequency < maxStationFrequency) {
            currentRadioFrequency++;
        } else {
            currentRadioFrequency = minStationFrequency;
        }
    }

    public void prevRadioFrequency() {
        if (currentRadioFrequency > minStationFrequency) {
            currentRadioFrequency--;
        } else {
            currentRadioFrequency = maxStationFrequency;
        }
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }

    public void setCurrentRadioVolume(int newCurrentRadioVolume) {
        currentRadioVolume = newCurrentRadioVolume;
    }

    public void increaseRadioVolume() {
        if (currentRadioVolume < 100) {
            currentRadioVolume++;
        } else {
            currentRadioVolume = 100;
        }
    }

    public void decreaseRadioVolume() {
        if (currentRadioVolume > 0) {
            currentRadioVolume--;
        } else {
            currentRadioVolume = 0;
        }
    }
}
