package Servicio;

import java.util.Scanner;

import Entidad.Rectangulo;

public class RectanguloService {
    private Scanner sn = new Scanner(System.in);
    // método para crear el rectángulo con los datos del Rectángulo dados por el
    // usuario
    public Rectangulo crearRectangulo() {
        
        System.out.println("Ingrese la base del Rectángulo");
        int base = sn.nextInt();
        System.out.println("Ingrese la altura del Rectángulo");
        int altura = sn.nextInt();
        return new Rectangulo(base, altura);
    }
    
}
