package Entidad;

public class Matematica {
    // Atributos
    private double real1;
    private double real2;

    // Constructores
    public Matematica() {
        // Getters y Setters
    }

    public Matematica(double real1, double real2) {
        this.real1 = real1;
        this.real2 = real2;
    }

    public double getReal1() {
        return real1;
    }

    public void setReal1(double real1) {
        this.real1 = real1;
    }

    public double getReal2() {
        return real2;
    }

    public void setReal2(double real2) {
        this.real2 = real2;
    }

    // to string
    @Override
    public String toString() {
        return "Matematica [real1=" + real1 + ", real2=" + real2 + "]";
    }

    // Método que dice cuál de los dos atributos tiene el mayor valor
    public void devolverMayor() {
        if (this.real1 > this.real2) {
            System.out.println("El primer número es mayor que el segundo");
        } else if (this.real2 > real1) {
            System.out.println("El segundo número es mayor que el primero");
        } else {
            System.out.println("Los números son iguales");
        }
    }

    // Método que calcula la potencia del mayor valor de la
    // clase elevado al menor número, previamente redondeados
    public void calcularPotencia() {
        long redond1 = Math.round(this.real1);
        long redond2 = Math.round(this.real2);
        if (redond1 > redond2) {
            System.out.println(Math.pow(redond1, redond2));
        } else if (redond1 < redond2) {
            System.out.println(Math.pow(redond2, redond1));
        } else {
            System.out.println("Los números son iguales");
        }
    }

    // Método que calcula la raíz cuadrada del menor de los dos
    // valores pero antes obtiene el valor absoluto del
    // número
    public void calcularRaiz() {
        double abs = 0;
        double menor = 0;
        if (this.real1 > this.real2) {
            menor = this.real2;

        } else if (this.real1 < this.real2) {
            menor = this.real1;
        } else {
            System.out.println("Los números son iguales");
        }
        abs = Math.abs(menor);
        System.out.println(Math.sqrt(abs));
    }

}
