/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����). */
import Entidad.Circunferencia;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Circunferencia circ1 = new Circunferencia(5.6);
        circ1.crearCircunferencia();
        System.out.println("el area de la cirunferencia es igual a "+circ1.area()+" cm");
        System.out.println("el perímetro de la circunferencia es igual a "+circ1.perimetro()+ " cm");
    }
}