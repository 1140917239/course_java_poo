
package paquete;

import java.util.Random;
import java.util.Scanner;

public class Clase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String volver;
        int[] vector = new int[10];
        int i;

        do {
            System.out.println("Diseñe un algoritmo que llene un vector de 10 posiciones con un ciclo para,");
            System.out.println("luego imprima con otro ciclo el vector mostrando el índice, la posición y el valor.\n");

            for (i = 0; i < 10; i++) {
                vector[i] = rand.nextInt(100);
            }

            System.out.println();
            for (i = 0; i < 10; i++) {
                System.out.println("Índice: " + i + ". Posición: " + (i + 1) + ". Valor: " + vector[i]);
            }

            System.out.print("\nPara repetir digite <s>, para salir cualquier tecla: ");
            volver = sc.next();
            System.out.println();

        } while (volver.equalsIgnoreCase("s"));
    }
}
