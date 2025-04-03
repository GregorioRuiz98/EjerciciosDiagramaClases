package ejercicioBiblioteca;

import java.util.Date;

public class Prestamo {
    // Atributos privados
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private boolean fueraPlazo;

    // Constructor
    public Prestamo(Date fechaPrestamo, Date fechaDevolucion, boolean fueraPlazo) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.fueraPlazo = fueraPlazo;
    }

    // Método para aplicar una multa (dummy implementation)
    public void multa() {
        if (fueraPlazo) {
            System.out.println("El préstamo está fuera de plazo. Se aplicará una multa.");
        } else {
            System.out.println("El préstamo está en plazo. No se aplicará ninguna multa.");
        }
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Prestamo{" +
                "fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucion=" + fechaDevolucion +
                ", fueraPlazo=" + fueraPlazo +
                '}';
    }
}
