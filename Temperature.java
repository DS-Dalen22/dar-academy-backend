package basics;

public class Temperature {

    private double value;
    private char scale;

    public Temperature() {
        value = 0.0;
        scale = 'C';
    }

    public Temperature(double value) {
        this.value = value;
        scale = 'C';
    }

    public Temperature(char scale) {
        value = 0.0;
        this.scale = scale;
    }

    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public double getCelsius() {
        if (scale == 'C') {
            return value;
        } else {
            return (5.0 / 9.0) * (value - 32);
        }
    }

    public double getFahrenheit() {
        if (scale == 'F') {
            return value;
        } else {
            return (9.0 / 5.0) * value + 32;
        }
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setTemperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public char getScale() {
        return scale;
    }
}
