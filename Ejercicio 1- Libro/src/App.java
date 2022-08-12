/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas*/
import Entidad.Libro;
import Servicio.LibroService;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        LibroService libroserv = new LibroService();
        Libro libro1 = libroserv.crearLibro();
        libroserv.mostrarLibro(libro1);
        libro1 = null;
    }
}
