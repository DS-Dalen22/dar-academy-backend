public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double returnArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 9);
        Rectangle rectangle2 = new Rectangle(10, 14);

        double area1 = rectangle1.returnArea();
        double area2 = rectangle2.returnArea();

        System.out.println("Площадь прямоугольника 1: " + area1);
        System.out.println("Площадь прямоугольника 2: " + area2);
    }
}
