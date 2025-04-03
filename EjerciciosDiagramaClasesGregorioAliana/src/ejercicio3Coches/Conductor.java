package ejercicio3Coches;

public class Conductor {
    // Atributos privados
    private String nombre;
    private int edad;
    private float altura;

    // Constructor
    public Conductor(String nombre, int edad, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // Métodos de la clase Conductor
    public void aparcar() {
        System.out.println(nombre + " está aparcando.");
    }

    public void conducir() {
        System.out.println(nombre + " está conduciendo.");
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Conductor{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                '}';
    }
}
