import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioFrequency() {
        Radio radio = new Radio();
        radio.setCurrentRadioFrequency(5);

        int expected = 5;
        int actual = radio.getCurrentRadioFrequency();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioFrequencyOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioFrequency(12);

        int expected = 0;
        int actual = radio.getCurrentRadioFrequency();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioFrequencyBeforeLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioFrequency(-3);

        int expected = 0;
        int actual = radio.getCurrentRadioFrequency();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioFrequencyInsideLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioFrequency(7);

        radio.nextRadioFrequency();

        int expected = 8;
        int actual = radio.getCurrentRadioFrequency();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioFrequencyAfterLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioFrequency(9);

        radio.nextRadioFrequency();

        int expected = 0;
        int actual = radio.getCurrentRadioFrequency();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseRadioFrequencyInsideLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioFrequency(5);

        radio.prevRadioFrequency();

        int expected = 4;
        int actual = radio.getCurrentRadioFrequency();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseRadioFrequencyBeforeLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioFrequency(0);

        radio.prevRadioFrequency();

        int expected = 9;
        int actual = radio.getCurrentRadioFrequency();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioVolumeInsideLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(50);

        radio.increaseRadioVolume();

        int expected = 51;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioVolumeAfterLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(100);

        radio.increaseRadioVolume();

        int expected = 100;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseRadioVolumeInsideLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(60);

        radio.decreaseRadioVolume();

        int expected = 59;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseRadioVolumeBeforeLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(0);

        radio.decreaseRadioVolume();

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }
}
