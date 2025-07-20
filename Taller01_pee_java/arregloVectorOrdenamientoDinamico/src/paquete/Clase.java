
package paquete;

import java.util.Scanner;
import java.util.Random;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String volver;
        int[] vector = new int[10];

        do {
            System.out.println("\n--------------------------------------------------");
            System.out.println("Generando vector con 10 valores aleatorios (0-99)");
            System.out.println("--------------------------------------------------");

           
            for (int i = 0; i < 10; i++) {
                vector[i] = rand.nextInt(100); 
            }

            
            System.out.println();
            for (int i = 0; i < 10; i++) {
                System.out.println("Índice: " + i + ". Posición: " + (i + 1) + ". Valor: " + vector[i]);
            }

            
            System.out.print("\nPara repetir digite <s>, para salir cualquier otra tecla: ");
            volver = sc.nextLine();

        } while (volver.equalsIgnoreCase("s"));
    }
}
