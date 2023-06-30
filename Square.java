package basics;
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону квадарата а: ");
        double a = scanner.nextDouble();

        double area = a * a;
        double perimeter = 4 * a;
        double diagonal = Math.sqrt(2) * a;

        System.out.println("Площадь квадрата: " + area);
        System.out.println("Периметр квадрата: " + perimeter);
        System.out.println("Длина диагонали квадрата: " + diagonal);
    }
}
