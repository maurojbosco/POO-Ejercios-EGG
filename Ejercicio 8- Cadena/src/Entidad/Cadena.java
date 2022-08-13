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

    // To string
    @Override
    public String toString() {
        return "Cadena [frase=" + frase + ", longitud=" + longitud + "]";
    }

    // Método que contabiliza la cantidad de vocales que tiene la frase ingresada.
    public void mostrarVocales() {
        int count = 0;
        for (int i = 0; i < this.longitud; i++) {
            if (this.frase.toUpperCase().charAt(i) == 'A' || this.frase.toUpperCase().charAt(i) == 'E'
                    || this.frase.toUpperCase().charAt(i) == 'I' || this.frase.toUpperCase().charAt(i) == 'O'
                    || this.frase.toUpperCase().charAt(i) == 'U') {
                count++;
            }
        }
        System.out.println("La frase tiene " + count + " vocales");
    }

    // Método que invierte la frase ingresada y la muestra por pantalla
    public void invertirFrase() {
        for (int i = this.longitud - 1; i >= 0; i--) {
            System.out.print(this.frase.charAt(i));
        }
        System.out.println("");
    }

    // Método que recibe un carácter ingresado por el usuario y contabilizar cuántas
    // veces se repite el carácter en la frase
    public void vecesRepetido(String letra) {
        int count = 0;
        for (int i = 0; i < this.longitud; i++) {
            if (this.frase.toUpperCase().charAt(i) == letra.toUpperCase().charAt(0)) {
                count++;
            }

        }
        System.out.println("el caracter " + letra + " se repite " + count + " veces");
    }

    // Método que compara la longitud de la frase que compone la clase con otra
    // nueva frase ingresada por el usuario.
    public void compararLongitud(String frase) {
        if (this.longitud > frase.length()) {
            System.out.println(
                    "la longitud de la frase ingresada es menor que la longitud del atributo frase del objeto");
        } else if (this.longitud == frase.length()) {
            System.out.println(
                    "la longitud de la frase ingresada es igual que la longitud del atributo frase del objeto");
        } else {
            System.out.println(
                    "la longitud de la frase ingresada es mayor que la longitud del atributo frase del objeto");
        }
    }

    // Método que une la frase contenida en el atributo frase con una nueva frase
    // ingresada por el usuario y muestra la frase resultante.
    public void unirFrases(String frase) {
        System.out.println(this.frase.concat(" "+frase));
    }

    // Método que reemplaza todas las letras “a” que se encuentren en la frase, por
    // algún otro carácter seleccionado por el usuario y muestra la frase
    // resultante.
    public void reemplazar(String letra) {
        for (int i = 0; i < this.longitud; i++) {
            if (this.frase.toLowerCase().charAt(i) == 'a') {
                System.out.print(letra);
            } else {
                System.out.print(this.frase.charAt(i));
            }

        }
        System.out.println("");
    }

    // Método que comprueba si la frase contiene una letra que ingresa el usuario
    public boolean contiene(String letra) {
        boolean flag = false;
        for (int i = 0; i < this.longitud; i++) {
            if (this.frase.toLowerCase().charAt(i) == frase.charAt(0)) {
                flag = true;
            }
        }
        return flag;
    }
}