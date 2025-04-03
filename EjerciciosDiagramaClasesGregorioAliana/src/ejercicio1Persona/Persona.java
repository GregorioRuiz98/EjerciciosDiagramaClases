package ejercicio1Persona;

public class Persona {
    // Atributos protegidos
    protected String nombre;
    protected int edad;
    protected String dni;
    protected float altura;

    // Constructor
    public Persona(String nombre, int edad, String dni, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // Métodos de la clase Persona
    public void cagar() {
        System.out.println(nombre + " está haciendo caca.");
    }

    public void miccionar() {
        System.out.println(nombre + " está miccionando.");
    }

    public void romperCorazones() {
        System.out.println(nombre + " está rompiendo corazones.");
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", altura=" + altura +
                '}';
    }
}