
package paquete;

import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String volver;
        String[] vector = new String[5];
        String[][] matriz = new String[5][5];
        int i, j;

        do {
            System.out.println("Llene un vector de dimensión 5 con las palabras nombre, apellido, edad,");
            System.out.println("estado civil y teléfono; y llene una matriz de 4 por 5 con los datos de");
            System.out.println("sus compañeros. Luego de llenar la matriz, la muestre en pantalla de forma organizada.\n");

            vector[0] = "nombre     |";
            vector[1] = "apellido   |";
            vector[2] = "edad       |";
            vector[3] = "estado     |";
            vector[4] = "telefono   |";

            for (i = 0; i < 5; i++) {
                System.out.println();
                for (j = 0; j < 5; j++) {
                    System.out.print("[" + i + "," + j + "]. " + vector[j] + ": ");
                    matriz[i][j] = sc.nextLine();
                    matriz[i][j] = String.format("%-11s|", matriz[i][j]);
                }
            }

            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------|");
            for (j = 0; j < 5; j++) {
                System.out.print("     " + vector[j]);
            }
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------|");

            for (i = 0; i < 5; i++) {
                for (j = 0; j < 5; j++) {
                    System.out.print("     " + matriz[i][j]);
                }
                System.out.println();
            }

            System.out.println("-----------------------------------------------------------------------------------------|\n");
            System.out.print("Digite < s > para repetir o cualquier tecla para salir: ");
            volver = sc.nextLine();
            System.out.println();

        } while (volver.equalsIgnoreCase("s"));
    }
}
