
/*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) 
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase 
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a 
través de los métodos set, se guardará la frase y la longitud de manera automática según 
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos: 
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase 
ingresada. 
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por 
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
d) Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
compone la clase con otra nueva frase ingresada por el usuario.
e) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con 
una nueva frase ingresada por el usuario y mostrar la frase resultante.
f) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la 
frase resultante.
g) Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
ingresa el usuario y devuelve verdadero si la contiene y falso si no. */
import Entidad.Cadena;
import java.util.Scanner;

public class App {
    /**
     * @param args
     */

    private static Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {
        // Se instancia un objeto Cadena
        Cadena cadena = new Cadena();
        // se le pide al usuario que asigne el valor del atributo frase por teclado"
        System.out.println("Ingrese una frase");
        cadena.setFrase(sn.nextLine());
        // Se asigna el atributo longitud del objeto Cadena automaticamente segun la
        // longitud del atributo frase
        cadena.setLongitud(cadena.getFrase().length());
        // Se llama al método que cuenta las vocales del atriburo frase
        cadena.mostrarVocales();
        // Se llama al método que imprime por pantalla el valor invertido del atributo
        // frase
        cadena.invertirFrase();
        // Se llama al método que contabiliza cuantas veces se repite un caracter dado
        // en el atributo frase
        cadena.vecesRepetido("a");
        // Se llama al método que compara la longitud del atributo frase con otra frase
        // pasada por parámetro;
        cadena.compararLongitud("hola mundo");
        // Se llama al método que le concatena un String pasado por parámetro al final
        // del atributo frase
        cadena.unirFrases("hola mundo");
        // Se llama al método que reemplaza las letras 'a' del atributo frase por un
        // caracter pasado por parámetro
        cadena.reemplazar("@");
        // se llama al método que compueba si la frase contiene un caracter pasado por
        // parámetro
        System.out.println(cadena.contiene("E"));

    }
}
