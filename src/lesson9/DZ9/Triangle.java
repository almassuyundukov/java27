package lesson9.DZ9;

public class Triangle {
    private double storonaA;
    private double storonaB;
    private double storonaC;
    private double heightBasedOnC;

    public Triangle() {
    }

    public Triangle(double storonaA, double storonaB, double storonaC) {
        this.storonaA = storonaA;
        this.storonaB = storonaB;
        this.storonaC = storonaC;
    }

    public Triangle(double storonaC, double heightBasedOnC) {
        this.storonaC = storonaC;
        this.heightBasedOnC = heightBasedOnC;
    }

    public double getStoronaA() {
        return storonaA;
    }

    public void setStoronaA(double storonaA) {
        this.storonaA = storonaA;
    }

    public double getStoronaB() {
        return storonaB;
    }

    public void setStoronaB(double storonaB) {
        this.storonaB = storonaB;
    }

    public double getStoronaC() {
        return storonaC;
    }

    public void setStoronaC(double storonaC) {
        this.storonaC = storonaC;
    }

    public double getHeightBasedOnC() {
        return heightBasedOnC;
    }

    public void setHeightBasedOnC(double heightBasedOnC) {
        this.heightBasedOnC = heightBasedOnC;
    }

    public double calculateArea(){
        if(this.heightBasedOnC == 0){
            double poluperimetr = (this.storonaA + this.storonaB + this.storonaC) / 2;
            return Math.sqrt(poluperimetr * (poluperimetr - this.storonaA) *
                    (poluperimetr - this.storonaB) * (poluperimetr - this.storonaC));
        } else return (this.storonaC * this.heightBasedOnC) / 2;
    }

    public double calculatePerimeter(){
        return this.storonaA + this.storonaB + this.storonaC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.storonaA, storonaA) != 0) return false;
        if (Double.compare(triangle.storonaB, storonaB) != 0) return false;
        return Double.compare(triangle.storonaC, storonaC) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(storonaA);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(storonaB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(storonaC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        if(this.heightBasedOnC == 0) {
            return "Треугольник со сторонами " +
                    "А=" + storonaA +
                    ", B=" + storonaB +
                    ", C=" + storonaC;
        } else
            return "Треугольник с основанием " +
                    "C=" + storonaC +
                    "и высотой h=" + heightBasedOnC;
    }
}
