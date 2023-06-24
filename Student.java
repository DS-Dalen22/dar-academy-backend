public class Student {
    private String name;
    private String surname;
    private String address;
    private int id;

    public Student(String name, String surname, String address, int id) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.id = id;
    }

    public String toString() {
        return "Name: " + name + "\nSurname: " + surname + "\nAddress: " + address + "\nID: " + id;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Алиса", "Смит", "Коктем-2", 24);
        Student student2 = new Student("Азамат", "Алишерович", "Навои-31", 19);
        Student student3 = new Student("Кристина", "Тяпкина", "Набережная-244", 25);

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }
    }

