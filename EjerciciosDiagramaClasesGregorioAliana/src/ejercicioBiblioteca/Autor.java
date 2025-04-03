package ejercicioBiblioteca;

public class Autor {
    // Atributos privados
    private String nombre;
    private int edad;
    private String paisnacimiento;

    // Constructor
    public Autor(String nombre, int edad, String paisnacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.paisnacimiento = paisnacimiento;
    }

    // Método para escribir un libro (dummy implementation)
    public void escribirLibro() {
        System.out.println(nombre + " está escribiendo un libro.");
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", paisnacimiento='" + paisnacimiento + '\'' +
                '}';
    }
}
