
package paquete;

import java.util.Scanner;

public class Clase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String volver;

        do {
            System.out.println("Diseñe un algoritmo que muestre en pantalla la tabla de");
            System.out.println("multiplicar del número indicado por el usuario (del 1 al 10).");
            System.out.print("Digite la tabla de multiplicar que desea visualizar: ");
            int tabla = sc.nextInt();

            System.out.println();
            for (int i = 1; i <= 10; i++) {
                int res = i * tabla;
                System.out.println(tabla + " x " + i + " = " + res);
            }

            System.out.print("\nPara repetir digite <s>, para salir cualquier tecla: ");
            volver = sc.next();
            System.out.println();

        } while (volver.equalsIgnoreCase("s"));
    }
}

