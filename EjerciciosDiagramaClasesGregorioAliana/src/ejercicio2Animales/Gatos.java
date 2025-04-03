package ejercicio2Animales;

public class Gatos extends Animal {
    // Constructor
    public Gatos() {
        super("Carnívora", "Vivípara");
    }

    // Método específico de la clase Gatos
    public void maullar() {
        System.out.println("El gato está maullando.");
    }
}