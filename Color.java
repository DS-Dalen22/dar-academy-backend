package basics;

public class Color {
    public enum Colors {
        RED, GREEN, YELLOW

    }
    public static void main(String[] args) {
        for (Colors color : Colors.values()) {
            System.out.println(color);
        }
    }
}
