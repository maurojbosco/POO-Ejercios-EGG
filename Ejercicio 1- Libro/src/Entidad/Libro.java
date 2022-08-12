package Entidad;

public class Libro {
    public int ISBN;
    public String titulo;
    public String autor;
    public int numerodepaginas;

    public Libro(){

    }
    public Libro(int ISBN, String titulo, String autor, int numerodepaginas){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numerodepaginas = numerodepaginas;
    }
    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getNumerodepaginas() {
        return numerodepaginas;
    }
    public void setNumerodepaginas(int numerodepaginas) {
        this.numerodepaginas = numerodepaginas;
    }
    
}
