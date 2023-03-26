public class Radio {
    private int currentRadioFrequency;
    private int currentRadioVolume;

    public int getCurrentRadioFrequency() {
        return currentRadioFrequency;
    }

    public void setCurrentRadioFrequency(int newCurrentRadioFrequency) {
        if (newCurrentRadioFrequency < 0) {
            return;
        }
        if (newCurrentRadioFrequency > 9) {
            return;
        }
        currentRadioFrequency = newCurrentRadioFrequency;
    }

    public void nextRadioFrequency() {
        if (currentRadioFrequency < 9) {
            currentRadioFrequency++;
        } else {
            currentRadioFrequency = 0;
        }
    }

    public void prevRadioFrequency() {
        if (currentRadioFrequency > 0) {
            currentRadioFrequency--;
        } else {
            currentRadioFrequency = 9;
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
