package Entidad;

public class Cadena {
    // Atributos
    private String frase;
    private int longitud;

    // Constructores
    public Cadena() {

    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    // Getters y Setters
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    // Método que contabiliza la cantidad de vocales que tiene la frase ingresada.
    public void mostrarVocales() {
        int count = 0;
        for (int i = 0; i < this.longitud; i++) {
            if (this.frase.toUpperCase().substring(i, i + 1) == "A" || this.frase.substring(i, i + 1) == "E"
                    || this.frase.substring(i, i + 1) == "I" || this.frase.substring(i, i + 1) == "O"
                    || this.frase.substring(i, i + 1) == "U") {
                count++;
            }
        }
        System.out.println("La frase tiene " + count + " vocales");
    }
    // Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por 
    //ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    
}
