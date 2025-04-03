package ejercicioBiblioteca;

public class Usuario {
    // Atributos privados
    private String nombre;
    private int id;
    private String dni;
    private boolean puedePrestar;

    // Constructor
    public Usuario(String nombre, int id, String dni, boolean puedePrestar) {
        this.nombre = nombre;
        this.id = id;
        this.dni = dni;
        this.puedePrestar = puedePrestar;
    }

    // Método para reservar una copia (dummy implementation)
    public void reservaCopia() {
        System.out.println(nombre + " ha reservado una copia.");
    }

    // Método para devolver una copia (dummy implementation)
    public void devuelveCopia() {
        System.out.println(nombre + " ha devuelto una copia.");
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", dni='" + dni + '\'' +
                ", puedePrestar=" + puedePrestar +
                '}';
    }
}
