package LabProgra_S3;

public class Estacion {
    // Atributos
    private String nombre;
    private int CoordenadaX;
    private int CoordenadaY;

    // Constructor
    public Estacion(String nombre, int coordenadaX, int coordenadaY) {
        this.nombre = nombre;
        this.CoordenadaX = coordenadaX;
        this.CoordenadaY = coordenadaY;
    }

    public String getEstacion() {
        return nombre;
    }

    public String toString() {
        return "Estación:" + "\nnombre=" + nombre + ", CoordenadaX=" + CoordenadaX + ", CoordenadaY=" + CoordenadaY + '}';
    }
}
