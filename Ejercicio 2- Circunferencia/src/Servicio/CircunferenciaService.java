package Servicio;

import java.util.Scanner;

import Entidad.Circunferencia;

public class CircunferenciaService {
    private Scanner sn = new Scanner(System.in);

    // Método que pide el radio y lo guarda en el atributo del objeto
    public Circunferencia crearCircunferencia() {
        System.out.println("Ingrese el radio de la circunferencia en cm");
        double ratio = sn.nextDouble();
        return new Circunferencia(ratio);
    }
}
