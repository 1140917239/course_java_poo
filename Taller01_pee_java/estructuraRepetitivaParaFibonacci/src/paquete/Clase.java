
package paquete;

import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String volver;

        do {
            int anterior = 0;
            int posterior = 1;
            int acum = 0;
            int cant;

            System.out.println("Diseñe un algoritmo que solicite la cantidad de números que se desea ver de la serie de Fibonacci.");
            System.out.print("\nIngrese la cantidad de números de la serie Fibonacci: ");
            cant = sc.nextInt();

            System.out.println();
            for (int i = 0; i < cant; i++) {
                System.out.print(anterior + " ");
                acum = anterior + posterior;
                posterior = anterior;
                anterior = acum;
            }

            System.out.println();
            System.out.print("Para repetir digite <s>, para salir cualquier tecla: ");
            volver = sc.next();
            System.out.println();

        } while (volver.equalsIgnoreCase("s"));
    }
}
