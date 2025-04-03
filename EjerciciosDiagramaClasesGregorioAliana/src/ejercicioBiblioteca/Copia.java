package ejercicioBiblioteca;

public class Copia extends Libro {
    // Atributo privado
    private String estadoPrestamo;

    // Constructor
    public Copia(String titulo, int aniopublicacion, String editorial, String estadoPrestamo) {
        super(titulo, aniopublicacion, editorial);
        this.estadoPrestamo = estadoPrestamo;
    }

    // Método para prestar la copia
    public void prestar() {
        System.out.println("La copia del libro " + titulo + " ha sido prestada.");
        estadoPrestamo = "Prestado";
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Copia{" +
                "titulo='" + titulo + '\'' +
                ", aniopublicacion=" + aniopublicacion +
                ", editorial='" + editorial + '\'' +
                ", estadoPrestamo='" + estadoPrestamo + '\'' +
                '}';
    }
}
