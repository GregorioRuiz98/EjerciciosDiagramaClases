package ejercicioBiblioteca;

public class Libro {
    // Atributos protegidos
    protected String titulo;
    protected int aniopublicacion;
    protected String editorial;

    // Constructor
    public Libro(String titulo, int aniopublicacion, String editorial) {
        this.titulo = titulo;
        this.aniopublicacion = aniopublicacion;
        this.editorial = editorial;
    }

    // Método para obtener el autor (dummy implementation)
    public String getAutor() {
        return "Autor desconocido";
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", aniopublicacion=" + aniopublicacion +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}
