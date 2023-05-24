import com.sun.org.apache.xml.internal.security.utils.HelperNodeList;

public class Main {

    public static void main(String[] args) {
       int lenght = 15;
       int width = 10;
       if (lenght == width) {
           System.out.println("Прямоугольник квадратный");
       } else {
           System.out.println("Прямоугольник не квадратный");
       }
       // Задание 1






       int cost = 6500;
       int discount = 0;

       if (cost > 5000) {
           discount = cost / 10;

       }
       int cost1 = cost - discount;
        System.out.println("Стоимость покупки " + cost1);

        // Задание 2



        int grade = 75;

        if (grade < 25) {
            System.out.println("Оценка: F");
        } else if (grade >= 25 && grade < 45) {
            System.out.println("Оценка: E");
        } else if (grade >= 45 && grade < 50) {
            System.out.println("Оценка: D");
        } else if (grade >= 50 && grade < 60) {
            System.out.println("Оценка: C");
        } else if (grade >= 60 && grade < 80) {
            System.out.println("Оценка: B");
        } else {
            System.out.println("Оценка: A");
        }

        // задание 3



        int number = 12345;
        String reverse = "";

        while (number > 0) {
            int d = number % 10;
            reverse += d;
            number /= 10;
        }

        System.out.println(reverse);

        // Задание 4








        int number1 = 3;
        boolean a = true;

        if (number1 <= 1) {
            a = false;
        } else {
            for (int i = 2; i < number1; i++) {
                if (number1 % i == 0) {
                    a = false;
                }
            }
        }

        if (a) {
            System.out.println(number1 + " является простым числом");
        } else {
            System.out.println(number1 + " не является простым числом");
        }
        // Задание 5
























    }
}