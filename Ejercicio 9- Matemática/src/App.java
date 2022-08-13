
/*Realizar una clase llamada Matemática que tenga como atributos dos números reales con 
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un 
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el 
Math.random para generar los dos números y se guardaran en el objeto con su 
respectivos set. Deberá además implementar los siguientes métodos: 
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado 
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
import Entidad.Matematica;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Se instancia el objeto
        Matematica nums = new Matematica();
        //Se asignan valores aleatorios a sus atributos
        nums.setReal1(Math.random());
        nums.setReal2(Math.random());
        // Se llama al método que indica cual atributo es mayor
        nums.devolverMayor();
        // Se llama al método que calcula la potencia del mayor número elevado al menor
        nums.calcularPotencia();
        // Se llama al método que calcula la raiz cuadrada del menor de los 2 atributos
        nums.calcularRaiz();
    }
}
