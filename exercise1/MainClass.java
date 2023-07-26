package Labo2.exercise1;

public class MainClass {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setAge(20);
        persona.setName("Victor");
        persona.setLastname("Monje");
        persona.setHigh(1.70);


        persona.corriendo();
        persona.saltar();
        persona.dormir();
    }

}
