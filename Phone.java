package basics;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Phone {
    private static Map<String, String> phoneBook = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("Телефонная книга");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Просмотреть все контакты");
            System.out.println("3. Обновить контакт");
            System.out.println("4. Поиск контактов по имени");
            System.out.println("5. Выйти");
            System.out.print("Выберите пункт меню: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    viewAllContacts();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    searchContacts();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Выключение");
                    break;
                default:
                    System.out.println("Неверный набор. Попробуйте снова.");
            }

            System.out.println();
        }
    }

    private static void addContact() {
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите телефонный номер: ");
        String phoneNumber = scanner.nextLine();
        phoneBook.put(name, phoneNumber);
        System.out.println("Контакт добавлен.");
    }

    private static void viewAllContacts() {
        if (phoneBook.isEmpty()) {
            System.out.println("Телефонная книга пуста.");
        } else {
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                System.out.println("Имя: " + entry.getKey() + ", Телефон: " + entry.getValue());
            }
        }
    }

    private static void updateContact() {
        System.out.print("Введите имя контакта для обновления: ");
        String name = scanner.nextLine();
        if (phoneBook.containsKey(name)) {
            System.out.print("Введите новый телефонный номер: ");
            String newPhoneNumber = scanner.nextLine();
            phoneBook.put(name, newPhoneNumber);
            System.out.println("Контакт обновлен.");
        } else {
            System.out.println("Контакт не найден.");
        }
    }

    private static void searchContacts() {
        System.out.print("Введите имя для поиска: ");
        String name = scanner.nextLine();
        boolean found = false;

        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getKey().toLowerCase().contains(name.toLowerCase())) {
                System.out.println("Имя: " + entry.getKey() + ", Телефон: " + entry.getValue());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Контакт не найден.");
        }
    }
}
