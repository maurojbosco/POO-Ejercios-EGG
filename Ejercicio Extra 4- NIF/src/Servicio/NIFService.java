package Servicio;

import java.util.Scanner;
import Entidad.NIF;

public class NIFService {

    private Scanner sn = new Scanner(System.in);


    // Método que le pide al usuario el DNI por pantalla y con ese DNI calcula la
    // letraque le corresponderá
    public NIF crearNif() {
        System.out.println("Ingrese el número de DNI");
        long DNI = sn.nextLong();
        return new NIF(DNI, calcularLetra(DNI));
    }

    /*
     * método auxiliar que calcula la letra, toma el resto de
     * dividir el número de DNI por 23 (un número entre 0 y
     * 22).Busca en un vectot de caracteres la posición que
     * corresponda al resto de la
     * división para obtener la letra correspondiente
     */
    private static char calcularLetra(long DNI) {
        char[] letras = new char[] { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
                'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
        int r = (int) DNI % 23;
        if (r >= 0 && r <= 22) {
            return letras[r];
        } else {
            return ' ';
        }

    }

}
