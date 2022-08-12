package Entidad;

import java.util.Scanner;

public class Circunferencia{
    //Atributos
    private double ratio;
    //Constructores
    public Circunferencia(double ratio){
        this.ratio = ratio;
    }
    //Getters y Setters
    public double getRatio() {
        return ratio;
    }
    public void setRatio(double ratio) {
        this.ratio = ratio;
    }
    //Método que pide el radio y lo guarda en el atributo del objeto
    public void crearCircunferencia(){
        System.out.println("Ingrese el radio de la circunferencia en cm");
        Scanner sn = new Scanner(System.in);
        this.ratio= sn.nextDouble();
        sn.close();
    }
    //Método para calcular el área de la circunferencia
    public double area(){
       double area = Math.PI*(this.ratio*this.ratio);
       return area;
    }
    //Método para calcular el perímetro
    public double perimetro(){
        double perimetro = 2*Math.PI*this.ratio;
        return perimetro;
    }

}
