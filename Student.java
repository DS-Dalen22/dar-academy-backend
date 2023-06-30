package basics;

public class Student {

    private String name;
    private int id;
    private int year;

    public  Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.year = 2023;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public void increase() {
        year++;
    }

}
