
/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 
20.*/
import java.util.Arrays;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Se crean 2 arreglos
        double[] A = new double[50];
        double[] B = new double[20];
        // Se inicializa el arreglo A con números aleatorios
        for (int i = 0; i < A.length; i++) {
            A[i] = Math.random()*10;
        }
        Arrays.fill(B, 0);
        // Se imprime el arreglo A por pantalla
        System.out.println("A: ");
        System.out.println(Arrays.toString(A));
        // Se ordenan los elementos del arreglo A
        Arrays.sort(A);
        // Se copian los primeros 20 valores ordenados del arreglo A al arreglo B
        B = Arrays.copyOf(A, 20);
        // Se sobrescriben los últimos 10 elementos con el valor 0.5
        Arrays.fill(B, 10, 20, 0.5);
        // Se imprimen ambos arreglos por pantalla
        System.out.println("A: ");
        System.out.println(Arrays.toString(A));
        System.out.println("B: ");
        System.out.println(Arrays.toString(B));
    }
}
