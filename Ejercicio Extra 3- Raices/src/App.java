/*Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió true, imprime las 2 posibles
soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b */

import Entidad.Raices;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Se instancia un objeto
        Raices raices = new Raices(7, 6, 1);
        // Se obtiene el discriminante
        System.out.println(raices.getDiscriminante());
        // Se llama al método que indica si tiene dos raíces
        System.out.println("La función tiene 2 raíces? " + raices.tieneRaices());
        // Se llama al método que indica si tiene una raiz
        System.out.println("La función tiene una sola raiz? " + raices.tieneRaiz());
        // Se llama al método que imprime el valor de las dos raíces
        raices.obtenerRaices();
        // Se llama al método que imprime el valor de la única raiz
        raices.obtenerRaiz();
        // Se llama al método compuesto que calcula el valor de la/s raiz/es
        raices.calcular();

    }
}
