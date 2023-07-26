package Labo2.exercise2;

public class Rectangulo {

    private double x; // base
    private double y; // altura

    // methods

    public void perimetro() {
        System.out.println(" Perimetro -> " + (2 * (this.x + this.y)));
    }

    public void area() {
        System.out.println("Area -> " + (this.x * this.y));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // constructor
    public Rectangulo() {
    }

}
