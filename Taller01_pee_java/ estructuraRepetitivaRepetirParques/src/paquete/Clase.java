
package paquete;

import java.util.Random;
import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String volver;

        do {
            int cont = 0;
            int dado1 = 0;
            int dado2 = 0;

            do {
                System.out.println("\nLanzamiento " + (cont + 1) + ". Presione ENTER");
                sc.nextLine();

                dado1 = rand.nextInt(6) + 1;
                dado2 = rand.nextInt(6) + 1;

                if (dado1 == dado2) {
                    cont++;
                    System.out.println("Ha sacado par de " + dado1);
                    if (cont == 3) {
                        System.out.println("\n¡Saca una Ficha!");
                        cont = 3;
                    }
                } else {
                    System.out.println("Ha sacado " + dado1 + " y " + dado2 + ". ¡Lanza de Nuevo!");
                    cont = 3;
                }

            } while (cont < 3);

            System.out.print("\nPara repetir digite <s>, para salir cualquier otra tecla: ");
            volver = sc.nextLine();

        } while (volver.equalsIgnoreCase("s"));

        sc.close();
    }
}
