package Work;
import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите три числа:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        System.out.println("Наибольшее число: " + max);
    }
}
