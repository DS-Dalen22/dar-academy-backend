package basics;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Lesson11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите вещественное число: ");
            double number = scanner.nextDouble();

            if (number < 0) {
                throw new IllegalArgumentException("Число должно быть неотрицательным.");
            }

            double sRoot = Math.sqrt(number);
            System.out.println("Квадратный корень числа: " + sRoot);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Процесс завершен");
            scanner.close();
        }
    }
}
