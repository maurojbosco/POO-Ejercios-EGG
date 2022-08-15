
/*Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. */
import Entidad.Puntos;
import Servicio.PuntosService;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Se instancia un objeto puntos mediante el método que pide los datos por
        // teclado
        PuntosService punser = new PuntosService();
        Puntos puntos = punser.crearPuntos();
        // Se aplica el método que calcula la distancia entre los puntos
        System.out.println("La distancia entre ambos puntos es de: " + puntos.calcularDistancia());
    }
}
