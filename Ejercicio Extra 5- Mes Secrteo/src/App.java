/*Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado! */

import java.util.Scanner;

public class App {

    private static Scanner sn = new Scanner(System.in);

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Se declara variable array con los 12 meses del año
        String[] meses = new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto",
                "septiembre", "octubre", "noviembre", "diciembre" };
        // Se declara variable mes secreto y una variable auxiliar con la posicion del
        // array
        int aux = 5;
        String mesSecreto = meses[aux];
        // Se crea un bucle que se ejecuta mientras que lo que introduzca el usuario sea
        // distinto al String contenido en la variable
        System.out.println("Introduzca el nombre del mes en minúsculas:");
        while (!sn.nextLine().equalsIgnoreCase(mesSecreto)) {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
        }
        System.out.println("Ha acertado!");

    }
}
