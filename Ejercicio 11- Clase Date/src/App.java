import java.util.Date;

/*Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la 
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase 
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date, 
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se 
puede conseguir instanciando un objeto Date con constructor vacío. 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date(); */
import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    private static Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {
        // Se piden por teclado día, mes y año y se guardan en variables
        System.out.println("Ingrese un día en números");
        int dia = sn.nextInt();
        System.out.println("Ingrese un mes en números");
        int mes = sn.nextInt();
        System.out.println("Ingrese un año en números");
        int anio = sn.nextInt();
        // Se instancia un objeto Date con las variables anteriormente creadas como
        // parámetros
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        // Se muestra por pantalla el objeto
        System.out.println(fecha);
        // Se instancia un objeto Date con la fecha actual
        Date fechaActual = new Date();
        // Se restan ambas fechas pasadas anteriormente a milisegundos y luego se las
        // convierte a años, luego el resultado se guarda en una variable
        int diferencia = (int) ((fechaActual.getTime() - fecha.getTime()) / 1000 / 60 / 60 / 24 / 365);
        // Se imprime por pantalla la diferencia con la funcion de valor absoluto de la
        // clase Math por las dudas de que la fecha ingresada sea posterior a la fecha
        // actual
        System.out.println("La diferencia entre entre ambas fechas es de " + Math.abs(diferencia) + " años");
    }
}