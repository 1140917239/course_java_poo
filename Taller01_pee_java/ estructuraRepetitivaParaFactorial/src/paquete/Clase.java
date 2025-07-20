
package paquete;

import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String volver;

        do {
            int cant, factorial = 1;

            System.out.println("Encuentre el factorial de un número del 0 al 12, si lo supera, el factorial es infinito.");
            System.out.print("\nIngrese el número factorial: ");
            cant = sc.nextInt();

            if (cant <= 12) {
                factorial = 1;
                for (int i = 1; i <= cant; i++) {
                    factorial *= i;
                }
                System.out.println("\nEl factorial de " + cant + " es: " + factorial);
            } else {
                System.out.println("\nEl factorial es infinito");
            }

            System.out.print("\nPara repetir digite <s>, para salir cualquier tecla: ");
            volver = sc.next();
            System.out.println();

        } while (volver.equalsIgnoreCase("s"));
    }
}
