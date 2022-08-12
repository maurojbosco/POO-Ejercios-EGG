package Entidad;

public class Circunferencia {
    // Atributos
    private double ratio;

    // Constructores
    public Circunferencia(double ratio) {
        this.ratio = ratio;
    }

    // Getters y Setters
    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    // Método para calcular el área de la circunferencia
    public double area() {
        double area = Math.PI * (this.ratio * this.ratio);
        return area;
    }

    // Método para calcular el perímetro
    public double perimetro() {
        double perimetro = 2 * Math.PI * this.ratio;
        return perimetro;
    }

}
