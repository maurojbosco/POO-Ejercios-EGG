package Entidad;

import java.util.Scanner;

public class Ahorcado {
    // Atributos
    private char[] palabraABuscar;
    private int cantLetEncontradas;
    private int jugadasMaximas;
    private Scanner sn = new Scanner(System.in);

    // Constructores
    public Ahorcado() {
    }

    public Ahorcado(char[] palabraABuscar, int cantLetEncontradas, int jugadasMaximas) {
        this.palabraABuscar = palabraABuscar;
        this.cantLetEncontradas = cantLetEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }

    /*
     * Método que le pide la palabra al usuario y cantidad de jugadas máxima
     * Después ingresa la palabra en el vector, letra por letra, quedando cada letra
     * de la palabra en un índice del vector. Y también, establece cantidad de
     * palabras encontradas en 0.
     */
    private void crearJuego() {
        System.out.println("Ingrese la palabra a adivinar:");
        String palabra = sn.nextLine();
        this.palabraABuscar = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            this.palabraABuscar[i] = palabra.charAt(i);
        }
        System.out.println("Ingrese la cantidad de jugadas máxima:");
        this.jugadasMaximas = sn.nextInt();
        this.cantLetEncontradas = 0;
    }

    // Método que muestra la longitud de la palabra que se debe encontrar
    private void longitud() {
        System.out.println("La palabra tiene " + this.palabraABuscar.length + " letras");
    }

    // Método que recibe una letra dada por el usuario y busca si la letra ingresada
    // es parte de la palabra o no.
    private void buscar(char letra) {
        boolean flag = false;
        for (int i = 0; i < this.palabraABuscar.length; i++) {
            if (this.palabraABuscar[i] == letra) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("La letra está en la palabra");
        } else {
            System.out.println("La letra no está en la palabra");
        }
    }

    // Método que recibe una letra ingresada por el usuario y muestra cuantas letras
    // han sido encontradas y cuantas le faltan.
    private boolean encontradas(char letra) {
        boolean flag = false;
        for (int i = 0; i < palabraABuscar.length; i++) {
            if (this.palabraABuscar[i] == letra) {
                this.cantLetEncontradas++;
                flag = true;
            }
        }
        System.out.println("Han sido encontradas " + this.cantLetEncontradas + " letras. Faltan por encontrar "
                + (this.palabraABuscar.length - this.cantLetEncontradas) + " letras");
        return flag;
    }

    // Método para mostrar cuantas oportunidades le queda al jugador.
    private void intentos() {
        System.out.println("Le quedan " + this.jugadasMaximas + " oportunidades");
    }

    /*
     * Método que se encarga de llamar todos los métodos previamente escritos y le
     * resta 1 a jugadasMaximas si la función encontradas devolvió false. Luego
     * informa cuando el usuario descubra toda la palabra o se quede sin intentos.
     */
    public void juego() {
        crearJuego();
        longitud();
        do {
            System.out.println("Ingrese una letra a buscar");
            char letra = sn.next().charAt(0);
            buscar(letra);
            if (!encontradas(letra)) {
                this.jugadasMaximas--;
            }
            intentos();
        } while (this.jugadasMaximas > 0 && this.cantLetEncontradas != this.palabraABuscar.length);
        if (this.jugadasMaximas == 0) {
            System.out.println("Lo siento se acabaron las oportunidades");
        } else {
            System.out.println("Ha ganado!");
        }

    }

}
