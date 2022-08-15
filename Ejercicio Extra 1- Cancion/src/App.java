
/*Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá definir
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
definir los métodos getters y setters correspondientes. */
import Entidad.Cancion;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Se instancia un objeto Cancion
        Cancion cancion = new Cancion("Aserejé", "Las Ketchup");
        System.out.println(cancion.toString());

    }
}
