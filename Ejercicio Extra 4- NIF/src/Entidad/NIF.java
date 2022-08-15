package Entidad;

public class NIF {
    // Atributos
    private long DNI;
    private char letra;

    // Constructores
    public NIF() {
    }

    public NIF(long dNI, char letra) {
        DNI = dNI;
        this.letra = letra;
    }

    // Getters y Setters
    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    // Método que nos permite mostrar el NIF (ocho dígitos, un guion y la letra en
    // mayúscula).
    public void mostrar() {
        System.out.println("NIF: " + this.DNI + "-" + this.letra);
    }

}
