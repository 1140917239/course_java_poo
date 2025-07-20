
package paquete;

import java.util.Random;
import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String volver;
        int i, num1, num2, num3, num4, num5, num6, aux;

        do {
            System.out.println("Diseñe un programa que por teclado solicite una acción y que muestre 6 números");
            System.out.println("aleatorios del 1 al 45 sin repetirse y organizados de menor a mayor (baloto).");
            System.out.println("\nPresione Enter para hallar los números del baloto:");
            sc.nextLine();

            num1 = rand.nextInt(45) + 1;

            do {
                num2 = rand.nextInt(45) + 1;
            } while (num2 == num1);

            do {
                num3 = rand.nextInt(45) + 1;
            } while (num3 == num1 || num3 == num2);

            do {
                num4 = rand.nextInt(45) + 1;
            } while (num4 == num1 || num4 == num2 || num4 == num3);

            do {
                num5 = rand.nextInt(45) + 1;
            } while (num5 == num1 || num5 == num2 || num5 == num3 || num5 == num4);

            do {
                num6 = rand.nextInt(45) + 1;
            } while (num6 == num1 || num6 == num2 || num6 == num3 || num6 == num4 || num6 == num5);

            for (i = 0; i <= 4; i++) {
                if (num1 > num2) { aux = num1; num1 = num2; num2 = aux; }
                if (num2 > num3) { aux = num2; num2 = num3; num3 = aux; }
                if (num3 > num4) { aux = num3; num3 = num4; num4 = aux; }
                if (num4 > num5) { aux = num4; num4 = num5; num5 = aux; }
                if (num5 > num6) { aux = num5; num5 = num6; num6 = aux; }
            }

            System.out.println();
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num4);
            System.out.println(num5);
            System.out.println(num6);

            System.out.print("\nPara repetir digite <s>, para salir cualquier tecla: ");
            volver = sc.next();
            sc.nextLine();
            System.out.println();

        } while (volver.equalsIgnoreCase("s"));
    }
}
