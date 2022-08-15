package Entidades;

public class Ahorcado {
    // Atributos
    private char[] palabraABuscar;
    private int cantPalEncontradas;
    private int jugadasMaximas;

    // Constructores
    public Ahorcado() {
    }

    public Ahorcado(char[] palabraABuscar, int cantPalEncontradas, int jugadasMaximas) {
        this.palabraABuscar = palabraABuscar;
        this.cantPalEncontradas = cantPalEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }
    // Método que muestra la longitud de la palabra que se debe encontrar
    public void longitud(){
        System.out.println("La palabra tiene " +this.palabraABuscar.length + " letras");
    }

    // Método que recibe una letra dada por el usuario y busca sila letra ingresada
    // es parte de la palabra o no.
    public void buscar(char letra) {
        for (int i = 0; i < this.palabraABuscar.length; i++) {
            if (this.palabraABuscar[i] == letra) {
                System.out.println("La letra es parte de la palabra");
            } else {
                System.out.println("La letra no es parte de la palabra");
            }
        }
    }

    // Método encontradas(letra): que reciba una letra ingresada por el usuario y
    // muestre
    // cuantas letras han sido encontradas y cuantas le faltan. Este método además
    // deberá
    // devolver true si la letra estaba y false si la letra no estaba, ya que, cada
    // vez que se
    // busque una letra que no esté, se le restará uno a sus oportunidades.
    public boolean encontradas(char letra) {
        buscar(letra);
    }

}
