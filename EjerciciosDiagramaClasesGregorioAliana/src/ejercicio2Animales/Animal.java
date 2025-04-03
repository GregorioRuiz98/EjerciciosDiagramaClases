package ejercicio2Animales;

public class Animal {
    // Atributos protegidos
    protected String alimentacion;
    protected String reproduccion;

    // Constructor
    public Animal(String alimentacion, String reproduccion) {
        this.alimentacion = alimentacion;
        this.reproduccion = reproduccion;
    }

    // Métodos getter y setter
    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }

    // Método de la clase Animal
    public void respirar() {
        System.out.println("El animal está respirando.");
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Animal{" +
                "alimentacion='" + alimentacion + '\'' +
                ", reproduccion='" + reproduccion + '\'' +
                '}';
    }
}