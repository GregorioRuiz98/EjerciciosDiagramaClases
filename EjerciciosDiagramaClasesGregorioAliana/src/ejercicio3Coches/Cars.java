package ejercicio3Coches;

public class Cars {
    // Atributos privados
    private int ruedas;
    private int puertas;
    private String motor;
    private int asientos;

    // Constructor
    public Cars(int ruedas, int puertas, String motor, int asientos) {
        this.ruedas = ruedas;
        this.puertas = puertas;
        this.motor = motor;
        this.asientos = asientos;
    }

    // Métodos getter y setter
    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    // Métodos de la clase Cars
    public void arrancarMotor() {
        System.out.println("El motor está arrancando.");
    }

    public void apagarMotor() {
        System.out.println("El motor está apagado.");
    }

    public void encenderRadio() {
        System.out.println("La radio está encendida.");
    }

    public void encenderAireAcondicionado() {
        System.out.println("El aire acondicionado está encendido.");
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Cars{" +
                "ruedas=" + ruedas +
                ", puertas=" + puertas +
                ", motor='" + motor + '\'' +
                ", asientos=" + asientos +
                '}';
    }
}
