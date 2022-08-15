package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

public class PuntosService {

    private Scanner sn = new Scanner(System.in);

    // método que le pide al usuario los dos números y los ingresa en los atributos
    // del objeto
    public Puntos crearPuntos() {
        System.out.println("Ingrese el valor del punto x1");
        double x1 = sn.nextDouble();
        System.out.println("Ingrese el valor del punto y1");
        double y1 = sn.nextDouble();
        System.out.println("Ingrese el valor del punto x2");
        double x2 = sn.nextDouble();
        System.out.println("Ingrese el valor del punto y2");
        double y2 = sn.nextDouble();
        return new Puntos(x1, y1, x2, y2);
    }
}
