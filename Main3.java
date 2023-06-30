package basics;

public class Main3 {

    public static void main(String[] args) {
        Student student = new Student("Dalen", 015);
        System.out.println("Имя Студента: " + student.getName());
        System.out.println("ID студента: " + student.getId());
        System.out.println("Год обучения студента: " + student.getYear());

        student.increase();
        System.out.println("Следующий год обучения: " + student.getYear());





    }

}

