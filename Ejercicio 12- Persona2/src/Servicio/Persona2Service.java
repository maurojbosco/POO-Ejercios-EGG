package Servicio;

import Entidad.Persona2;

import java.util.Date;
import java.util.Scanner;

public class Persona2Service {
    private Scanner sn = new Scanner(System.in);

    // Método que rellena los atributos del objeto mediante un Scanner
    public Persona2 crearPersona() {
        System.out.println("Ingrese el nombre de la persona");
        String nombre = sn.next();
        System.out.println("Ingrese el día de nacimiento en números");
        int dia = sn.nextInt();
        System.out.println("Ingrese el mes de nacimiento en números");
        int mes = sn.nextInt();
        System.out.println("Ingrese el año de nacimiento en números");
        int anio = sn.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        return new Persona2(nombre, fecha);
    }
}
