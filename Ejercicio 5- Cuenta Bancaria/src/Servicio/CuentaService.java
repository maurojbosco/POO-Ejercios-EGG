package Servicio;

import java.util.Scanner;

import Entidad.Cuenta;

public class CuentaService {
    private  Scanner sn = new Scanner(System.in);
    //Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public Cuenta crearCuenta(){
        System.out.println("Ingrese un número de cuenta");
        int numeroCuenta = sn.nextInt();
        System.out.println("Ingrese su DNI");
        long DNI = sn.nextLong();
        System.out.println("Ingrese el Saldo de la cuenta");
        int saldoActual = sn.nextInt();
        return new Cuenta(numeroCuenta, DNI, saldoActual);
    }
}
