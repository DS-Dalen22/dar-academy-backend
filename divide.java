package basics;

public class divide {
    public static void main(String[] args) {

        int x = 10;
        int y = 0;

        try {
            double result = divide(x, y);
            System.out.println("Результат деления " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления на ноль: " + e.getMessage());
        }
    }
    public static double divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return (double) x / y;
    }
}
