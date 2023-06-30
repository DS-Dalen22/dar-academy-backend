package basics;

public class Main4 {
    public static void main(String[] args) {
        Temperature temperature = new Temperature(25.0, 'C');

        System.out.println("Температура в цельсиях: " + temperature.getCelsius());
        System.out.println("Температура в фаренгейтах: " + temperature.getFahrenheit());
        System.out.println("Шкала: " + temperature.getScale());

    }
}
