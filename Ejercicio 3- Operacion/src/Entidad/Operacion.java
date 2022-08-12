package Entidad;

import java.util.Scanner;

public class Operacion {
    // Atributos
    private int numero1;
    private int numero2;

    // Metodo Constructor con parametros
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Metodo constructor sin parametros
    public Operacion() {
        // Getters y Setters
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    // Método que le pide al usuario los dos números y los guarda en los atributos
    // del objeto.
    public Operacion crearOperacion() {
        System.out.println("Ingrese el valor del numero 1");
        Scanner sn = new Scanner(System.in);
        int num1 = sn.nextInt();
        System.out.println("Ingrese el valor del numero 2");
        int num2 = sn.nextInt();
        sn.close();
        Operacion oper = new Operacion(num1, num2);
        return oper;
    }

    // Método que calcula la suma de los números y devuelve el resultado al main.
    public int sumar() {
        int resultado = this.numero1 + this.numero2;
        return resultado;
    }

    // Método que calcula la resta de los números y devuelve el resultado al main
    public int restar() {
        int resultado = this.numero1 + this.numero2;
        return resultado;
    }

    /*
     * Método que valida que no se haga una multiplicación por cero, si
     * fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario
     * el error. Si
     * no, se hace la multiplicación y se devuelve el resultado al main
     */
    public int multiplicar() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("error no se puede multiplicar en este metodo por 0");
            return 0;
        } else {
            int resultado = this.numero1 * this.numero2;
            return resultado;
        }
    }

    /*
     * Método que valida que no se haga una división por cero, si
     * fuera a pasar una división por cero, el método devuelve 0 y se le informa al
     * usuario el
     * error. Si no, se hace la división y se devuelve el resultado al main.
     */
    public int dividir() {
        if (this.numero2 == 0) {
            System.out.println("error no se puede dividir por 0");
            return 0;
        } else {
            int resultado = this.numero1 / this.numero2;
            return resultado;
        }

    }
}
