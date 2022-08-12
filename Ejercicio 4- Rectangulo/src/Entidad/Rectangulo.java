package Entidad;

public class Rectangulo {
    // Atributos
    private int base;
    private int altura;

    // Constructores
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {

    }

    // Getters y Setters
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    // método para calcular la superficie del rectángulo
    public int calcularSuperficie() {
        int superficie = this.base * this.altura;
        return superficie;
    }

    // método para calcular el perímetro del rectángulo
    public int calcularPerimetro() {
        int perimetro = (this.base + this.altura) * (this.base + this.altura);
        return perimetro;
    }

    // método que dibuja el rectángulo mediante asteriscos usando la base y la
    // altura
    public void dibujarRectangulo() {
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

}
