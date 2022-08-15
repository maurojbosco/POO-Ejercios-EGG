package Servicio;

import Entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    private Scanner sn = new Scanner(System.in);

    /*
     * Método que le pide la palabra al usuario y cantidad de jugadas máxima
     * Después ingresa la palabra en el vector, letra por letra, quedando cada letra
     * de la palabra en un índice del vector. Y también, establece cantidad de
     * palabras encontradas en 0.
     */
    public Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra a adivinar:");
        String palabra = sn.next();
        char[] palabraABuscar = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            palabraABuscar[i] = palabra.charAt(i);
        }
        System.out.println("Ingrese la cantidad de jugadas máxima:");
        return new Ahorcado(palabraABuscar, 0, sn.nextInt());
    }
}
