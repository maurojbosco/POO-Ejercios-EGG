package Servicio;
import java.util.Scanner;
import Entidad.Libro;

public class LibroService {
  //Método para crear un libro pidiendo los datos por teclado
  public Libro crearLibro(){
    Scanner sn = new Scanner(System.in);
    Libro libroCompleto = new Libro();
    System.out.println("ingrese ISBN del libro");
    libroCompleto.setISBN(sn.nextInt());
    System.out.println("Ingrese el nombre del libro");
    libroCompleto.setTitulo(sn.next());
    System.out.println("Ingrese el autor del libro");
    libroCompleto.setAutor(sn.next());
    System.out.println("Ingrese el número de páginas del libro");
    libroCompleto.setNumerodepaginas(sn.nextInt());
    sn.close();
    return libroCompleto;
}
//Método para mostrar por pantalla el libro
public void mostrarLibro(Libro libroCompleto){

    System.out.print("ISBN= " + libroCompleto.getISBN() + ", Autor= "+ libroCompleto.getAutor() + ", numerodepaginas="
    + libroCompleto.getNumerodepaginas() +", Título = " + libroCompleto.getTitulo());
}


}

