package Entidad;

import java.util.Scanner;

public class Cuenta {
    private Scanner leer = new Scanner(System.in);
    // Atributos
    public int numeroCuenta;
    public long DNI;
    public double saldoActual;

    // Constructores
    public Cuenta(int numeroCuenta, long DNI, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public Cuenta() {

    }

    // Getters y Setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long dNI) {
        DNI = dNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    // método que recibe una cantidad de dinero a ingresar y se la suma al saldo
    // actual.
    public void ingresar(double ingreso) {
        this.saldoActual += ingreso;
    }

    // Método que recibe una cantidad de dinero a
    // retirar y se la
    // resta al saldo actual. Si la cuenta no tiene la cantidad de dinero a
    // retirar, se pone el
    // saldo actual en 0.
    public void retirar(double retiro) {
        if (this.saldoActual <= retiro) {
            this.saldoActual = 0;
        } else {
            this.saldoActual -= retiro;
        }

    }

    /*
     * Método que le permite sacar solo un 20% de su saldo y valida que el
     * usuario no saque más del 20%.
     */
    public void extraccionRapida() {
        System.out.println("Ingrese la cantidad de dinero a retirar");
        double retiro = leer.nextDouble();
        if (retiro * 0.2 > this.saldoActual) {
            System.out.println("No puede retirar mas del 20% de su saldo");

        } else {
            this.saldoActual -= retiro;
        }
    }

    // Método que permite consultar el saldo disponible en la cuenta
    public void consultarSaldo() {
        System.out.println("El saldo actual es de " + this.saldoActual);
    }

    // Método que muestra todos los datos de la cuenta.
    public void consultarDatos() {
        System.out.println("El numero de la cuenta es " + this.numeroCuenta +
                ", el número de DNI del titular de la cuenta es " + this.DNI + " ,el saldo actual es "
                + this.saldoActual);
    }
}
