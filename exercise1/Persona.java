package Labo2.exercise1;

public class Persona {
    private String name;
    private String Lastname;
    private int age;
    private double high;

    public void saltar() {
        System.out.println("La persona " + this.name + " " + this.Lastname + " esta saltando. ");
    }

    public void corriendo() {
        System.out
                .println("La persona " + this.name + " " + this.Lastname + " esta corriendo a su edad de " + this.age);
    }

    public void dormir() {
        System.out.println("La persona " + this.name + " " + this.Lastname + " se fue a dormir. ");
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    // constructor
    public Persona() {
    }

}
