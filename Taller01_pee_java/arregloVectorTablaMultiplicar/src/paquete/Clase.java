
package paquete;

import java.util.Scanner;

public class Clase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String volver;

        do {
            // Limpiar pantalla no es necesario en consola Java tradicional
            System.out.println("\nDiseñe un algoritmo que muestre en pantalla la tabla de");
            System.out.println("multiplicar del número indicado por el usuario (del 1 al 10)");

            int[] tabla = new int[11]; // índice de 1 a 10 (se ignora la posición 0)
            int num;

            // Entrada del número
            System.out.print("\nDigite la tabla de multiplicar que desea visualizar: ");
            num = sc.nextInt();

            // Cálculo de la tabla de multiplicar
            for (int i = 1; i <= 10; i++) {
                tabla[i] = i * num;
            }

            // Mostrar la tabla
            System.out.println();
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + tabla[i]);
            }

            // Preguntar si desea repetir
            System.out.print("\nPara repetir digite <s>, para salir cualquier tecla: ");
            sc.nextLine(); // limpiar buffer
            volver = sc.nextLine();

        } while (volver.equalsIgnoreCase("s"));
    }
}
