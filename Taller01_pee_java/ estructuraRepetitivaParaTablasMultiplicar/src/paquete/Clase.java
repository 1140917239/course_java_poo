
package paquete;

import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String volver;

        do {
            // Objetivo del programa
            System.out.println("\nDiseñe un algoritmo que imprima todas las tablas de multiplicar (1-10).\n");

            // Imprimir todas las tablas del 1 al 10
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    int res = i * j;
                    System.out.println(i + " x " + j + " = " + res);
                }
                System.out.println(); // Espacio entre tablas
            }

            // Preguntar si desea repetir
            System.out.print("Digite <s> para repetir. Para salir, cualquier tecla: ");
            volver = sc.nextLine();

        } while (volver.equalsIgnoreCase("s"));
    }
}
