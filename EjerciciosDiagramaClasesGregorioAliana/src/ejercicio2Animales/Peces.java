package ejercicio2Animales;

public class Peces extends Animal {
    // Constructor
    public Peces() {
        super("Omnívora", "Ovipara");
    }

    // Método específico de la clase Peces
    public void nadar() {
        System.out.println("El pez está nadando.");
    }
}