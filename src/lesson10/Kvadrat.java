package lesson10;

import java.util.Objects;

public class Kvadrat implements Figura{
    private Pryamougolnik pryamougolnik = new Pryamougolnik();

    public Kvadrat() {
    }

    public Kvadrat(int a) {
        pryamougolnik.setA(a);
        pryamougolnik.setB(a);
    }

    public int getA() {
        return pryamougolnik.getA();
    }

    public void setA(int a) {
        pryamougolnik.setA(a);
        pryamougolnik.setB(a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kvadrat kvadrat = (Kvadrat) o;

        return pryamougolnik != null ? pryamougolnik.equals(kvadrat.pryamougolnik) : kvadrat.pryamougolnik == null;
    }

    @Override
    public int hashCode() {
        return pryamougolnik != null ? pryamougolnik.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Квадрат : { сторона = " + getA() + '}';
    }

    @Override
    public double perimetr() {
        return 4 * getA();
    }

    @Override
    public double ploshad() {
        return getA() * getA();
    }
}
