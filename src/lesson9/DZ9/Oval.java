package lesson9.DZ9;

public class Oval {
    private double semiMajorAxis;
    private double semiMinorAxis;

    public Oval() {
    }

    public Oval(double semiMajorAxis, double semiMinorAxis) {
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public double getSemiMinorAxis() {
        return semiMinorAxis;
    }

    public void setSemiMinorAxis(double semiMinorAxis) {
        this.semiMinorAxis = semiMinorAxis;
    }

    public double calculateArea() {
        return Math.PI * this.semiMajorAxis * this.semiMinorAxis;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * Math.sqrt((Math.pow(this.semiMajorAxis, 2) + Math.pow(this.semiMinorAxis, 2)) / 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Oval oval = (Oval) o;

        if (Double.compare(oval.semiMajorAxis, semiMajorAxis) != 0) return false;
        return Double.compare(oval.semiMinorAxis, semiMinorAxis) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(semiMajorAxis);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(semiMinorAxis);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Овал: " +
                "Большая полуось=" + semiMajorAxis +
                ", Малая полуось=" + semiMinorAxis;
    }
}
