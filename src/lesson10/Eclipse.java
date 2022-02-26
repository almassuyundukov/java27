package lesson10;

import java.util.Objects;

public class Eclipse extends  Circle implements Figura{
    private double radius2;

    public Eclipse() {
    }

    public Eclipse(double radius, double radius2) {
        super(radius);
        this.radius2 = radius2;
    }

    public double getRadius2() {
        return radius2;
    }

    public void setRadius2(double radius2) {
        this.radius2 = radius2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Eclipse eclipse = (Eclipse) o;

        return Double.compare(eclipse.radius2, radius2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius2);
    }

    @Override
    public String toString() {
        return "Овал" +
                "радиус 1 = " + getRadius() +
                ", радиус 2 = " + getRadius2();
    }

    @Override
    public double perimetr() {
        return 2 * Math.PI *
                Math.sqrt(((getRadius() * getRadius()) * (getRadius2() * getRadius2()))/2);
    }

    @Override
    public double ploshad() {
        return Math.PI * getRadius() * getRadius2();
    }
}
