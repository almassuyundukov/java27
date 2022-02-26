package lesson9.DZ9;

public class Main {
    public static void main(String[] args) {
        Rectangle priamoug = new Rectangle(5,3);
        System.out.println(priamoug.calculateArea());
        Square square = new Square(3);
        System.out.println(square.calculatePerimeter());
        Triangle triangle = new Triangle(3,4,2);
        Triangle triangle1 = new Triangle(3,5);
        System.out.println(triangle.calculateArea());
        System.out.println(triangle1.calculateArea());
    }
}
