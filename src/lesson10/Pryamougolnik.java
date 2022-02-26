package lesson10;

import java.util.Objects;

public class Pryamougolnik implements Figura{
    private int a;
    private int b;

    public Pryamougolnik() {
    }

    public Pryamougolnik(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pryamougolnik that = (Pryamougolnik) o;
        return a == that.a && b == that.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "Pryamougolnik{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public double perimetr() {
        return 2 * (getA() + getB());
    }

    @Override
    public double ploshad() {
        return getA() * getB();
    }
}
