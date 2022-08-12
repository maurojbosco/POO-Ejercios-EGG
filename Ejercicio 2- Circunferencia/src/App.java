
/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����). */
import Entidad.Circunferencia;
import Servicio.CircunferenciaService;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        CircunferenciaService circ1 = new CircunferenciaService();
        Circunferencia circu = circ1.crearCircunferencia();
        System.out.println("el area de la cirunferencia es igual a " + circu.area() + " cm");
        System.out.println("el perímetro de la circunferencia es igual a " + circu.perimetro() + " cm");
    }
}