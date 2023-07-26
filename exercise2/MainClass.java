package Labo2.exercise2;

public class MainClass {

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();

        // Definiendo 'x' y 'y'
        // x = base
        // y = altura

        rectangulo.setX(10);
        rectangulo.setY(5);

        System.out.println("Base -> " + rectangulo.getX());
        System.out.println("Altura -> " + rectangulo.getY());

        rectangulo.area();
        rectangulo.perimetro();

    }

}
