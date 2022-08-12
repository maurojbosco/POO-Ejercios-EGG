package Servicio;

import java.util.Scanner;

import Entidad.Operacion;

public class OperacionService {
    private Scanner sn = new Scanner(System.in);

    // Método que le pide al usuario los dos números y los guarda en los atributos
    // del objeto.
    public Operacion crearOperacion() {
        System.out.println("Ingrese el valor del numero 1");
        int num1 = sn.nextInt();
        System.out.println("Ingrese el valor del numero 2");
        int num2 = sn.nextInt();
        return new Operacion(num1, num2);
    }

}