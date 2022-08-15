package Entidad;

public class Raices {
    // Atributos
    private int a;
    private int b;
    private int c;

    // Constructores
    public Raices() {
    }

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getters y Setters
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    // To String
    @Override
    public String toString() {
        return "Raices [a=" + a + ", b=" + b + ", c=" + c + "]";
    }

    // Método que devuelve el valor del discriminante
    public double getDiscriminante() {
        return (this.b * this.b) - 4 * this.a * this.c;
    }

    // Método que devuelve un booleano indicando si tiene dos soluciones
    public boolean tieneRaices() {
        Raices raices = new Raices(this.a, this.b, this.c);
        return raices.getDiscriminante() > 0;
    }

    // Método que devuelve un booleano indicando si tiene una única solución
    public boolean tieneRaiz() {
        Raices raices = new Raices(this.a, this.b, this.c);
        return raices.getDiscriminante() == 0;
    }

    // Método que llama a tieneRaíces() y si devolvió true, imprime las
    // 2 posibles soluciones.
    public void obtenerRaices() {
        Raices raices = new Raices(this.a, this.b, this.c);
        if (raices.tieneRaices()) {
            System.out
                    .println("raíz 1: " + (-this.b + Math.sqrt((this.b * this.b) - 4 * this.a * this.c)) / 2 * this.a);
            System.out
                    .println("raíz 2: " + (-this.b - Math.sqrt((this.b * this.b) - 4 * this.a * this.c)) / 2 * this.a);
        }
    }

    // Método que llama a tieneRaiz() y si devolvió true imprime una única raíz.
    public void obtenerRaiz() {
        Raices raices = new Raices(this.a, this.b, this.c);
        if (raices.tieneRaiz()) {
            System.out
                    .println("raíz : " + (-this.b + Math.sqrt((this.b * this.b) - 4 * this.a * this.c)) / 2 * this.a);
        }
    }

    // Método que llama a tieneRaices() y a tieneRaíz(), y muestra por pantalla las
    // posibles soluciones que tiene nuestra ecuación con los métodos
    // obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en
    // caso de no existir solución muestra un mensaje.
    public void calcular() {
        Raices raices = new Raices(this.a, this.b, this.c);
        if (!raices.tieneRaices() && !raices.tieneRaiz()) {
            System.out.println("La ecuación cuadrática no tiene raices reales");
        }
        raices.obtenerRaices();
        raices.obtenerRaiz();
    }
}
