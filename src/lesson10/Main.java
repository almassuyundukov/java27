package lesson10;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        figuras[0] = new Circle(12);
        figuras[1] = new Eclipse(2,4);
        figuras[2] = new Kvadrat(34);
        figuras[3] = new Pryamougolnik(10,15);
        figuras[4] = new Triangle(5,6,8);

        // быстрый проход по массиву for each
        for(Figura f: figuras){
            System.out.println("----------");
            System.out.println(f);
            System.out.println(f.perimetr()); // проявление полиморфизма
        }
    }
}
