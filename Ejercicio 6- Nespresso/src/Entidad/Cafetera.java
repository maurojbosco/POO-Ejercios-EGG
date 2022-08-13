package Entidad;

public class Cafetera {
    // Atributos
    private int capacidadMaxima;
    private int cantidadActual;

    // Constructores
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public Cafetera() {

    }

    // Getters y Setters
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    // Método que hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }

    /*
     * Método que pide el tamaño de una taza vacía y simula la acción de servir la
     * taza con la capacidad
     * indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se
     * sirve lo que queda. El
     * método le informa al usuario si se llenó o no la taza, y de no haberse
     * llenado en cuanto quedó la taza.
     */
    public void servirTaza(int tamanioTaza) {
        if (this.cantidadActual < tamanioTaza) {
            System.out.println("La taza de " + tamanioTaza + "ml solo se sirvió con " + this.cantidadActual + " ml");
            this.cantidadActual = 0;
        } else {
            System.out.println("La taza se llenó");
            this.cantidadActual -= tamanioTaza;
        }
    }

    // Método que pone la cantidad de café actual en cero.
    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }

    // Método que le pide al usuario una cantidad de café y le añade a la cafetera
    // la cantidad de café indicada
    public void agregarCafe(int cantidad) {
        this.cantidadActual += cantidad;
        if (this.cantidadActual > this.capacidadMaxima) {
            System.out.println(this.cantidadActual-this.capacidadMaxima +" ml de café de los "+cantidad+" ml indicados no pudieron ser agregados porque la cafetera se llenó antes");
            this.cantidadActual = this.capacidadMaxima;
        }
    }

}
