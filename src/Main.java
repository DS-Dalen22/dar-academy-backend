import com.sun.org.apache.xml.internal.security.utils.HelperNodeList;

public class Main {

    public static double calculateAverage(int a, int b, int c) {
        double average = (a + b + c) / 3.0;
        return average;
    }

    public static int findMinimum(int a, int b, int c) {
        int minimum = a;


        if (b < minimum) {
            minimum = b;
        }
        if (c < minimum) {
            minimum = c;
        }

        return minimum;


    }

    public static int countWords(String str) {
        int count = 0;
        boolean isWord = false;


        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                if (!isWord) {
                    count++;
                    isWord = true;
                }
            } else {
                isWord = false;
            }
        }

        return count;

    }


    public static int count1(int number) {
        int count = 0;

        while (number > 0) {
            int digit = number % 10;

            if (digit == 2) {
                count++;
            }

            number /= 10;
        }

        return count;
    }

    public static int calculate(int number) {
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }


    public static void main(String[] args) {
        int firstNumber = 25;
        int secondNumber = 45;
        int thirdNumber = 65;

        double averageValue = calculateAverage(firstNumber, secondNumber, thirdNumber);

        System.out.println("Среднее значение: " + averageValue);


        int firstNumber1 = 25;
        int secondNumber1 = 37;
        int thirdNumber1 = 29;

        int minimumValue = findMinimum(firstNumber1, secondNumber1, thirdNumber1);

        System.out.println("Наименьшее значение: " + minimumValue);


        String input = "Java is good to learn Object Oriented programming.";
        int wordCount = countWords(input);

        System.out.println("Количество слов в строке: " + wordCount);

        int number = 1254212;
        int digitCount = count1(number);

        System.out.println("Количество цифр: " + digitCount);


        int number1 = 252;
        int sum = calculate(number);

        System.out.println("Сумма цифр числа " + number1 + " = " + sum);

    }
}
























    }
}
