
package paquete;

import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String volver;

        do {
            System.out.println("Diseñe un algoritmo que imprima todas las tablas de multiplicar (1-10).\n");

            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    int res = i * j;
                    System.out.println(i + " x " + j + " = " + res);
                }
                System.out.println();
            }

            System.out.print("Digite <s> para repetir. Para salir, cualquier tecla: ");
            volver = sc.next();
            System.out.println();

        } while (volver.equalsIgnoreCase("s"));
    }
}
