package Entidad;

public class Puntos {
    // Atributos
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    // Constuctores
    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Puntos() {
    }
    // Getters y Setters

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    // To String
    @Override
    public String toString() {
        return "Puntos [x1=" + x1 + ", x2=" + x2 + ", y1=" + y1 + ", y2=" + y2 + "]";
    }

    // método calcular y devolver la distancia que existe entre los dos puntos que
    // existen en la clase Puntos
    public double calcularDistancia() {
        return Math.sqrt(((this.x2 - this.x1) * (this.x2 - this.x1)) + ((this.y2 - this.y1) * (this.y2 - this.y1)));
    }
}