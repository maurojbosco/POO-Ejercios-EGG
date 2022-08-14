package Entidad;

import java.util.Date;

public class Persona2 {
    // Atributos
    private String nombre;
    private Date fechaDeNacimiento;

    // Constructores
    public Persona2() {

    }

    public Persona2(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    // To string
    @Override
    public String toString() {
        return "Persona2 [fechaDeNacimiento=" + fechaDeNacimiento + ", nombre=" + nombre + "]";
    }

    // Método que calcula la edad a partir del atributo fechaDeNacimiento
    public void calcularEdad() {
        Date fechaActual = new Date();
        int edad = (int) ((fechaActual.getTime() - this.fechaDeNacimiento.getTime()) / 1000 / 60 / 60 / 24 / 365);
        System.out.println("La persona tiene " + edad + " años");
    }

    // Método que recibe como parámetro otra edad y retorna true en caso de que el
    // receptor tenga menor edad que la persona que se recibe como parámetro, o
    // false en caso contrario.
    public boolean menorQue(int edad) {
        Date fechaActual = new Date();
        int edad1 = (int) ((fechaActual.getTime() - this.fechaDeNacimiento.getTime()) / 1000 / 60 / 60 / 24 / 365);
        return edad1 < edad;
    }

    // Método que muestra el objeto persona creado por pantalla.
    public void mostrarPersona() {
        System.out.println("Nombre: " + this.nombre + ", fecha de nacimiento: " + this.fechaDeNacimiento + "]");
    }

}
