
package paquete;

import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String volver;

        do {
            volver = "s";

            System.out.println();

            System.out.println();

            System.out.println();

            System.out.print("Para repetir digite < s >, para salir cualquier tecla: ");
            volver = sc.nextLine().toLowerCase();

        } while (volver.equals("s"));
    }
}

