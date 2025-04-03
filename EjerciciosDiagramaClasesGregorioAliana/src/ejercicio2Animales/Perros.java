package ejercicio2Animales;

public class Perros extends Animal {
    // Constructor
    public Perros() {
        super("Carnívora", "Vivípara");
    }

    // Método específico de la clase Perros
    public void ladrar() {
        System.out.println("El perro está ladrando.");
    }
}