
package paquete;

import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String volver;
        int num, cant, resid, temp;

        do {
            System.out.println("Diseñe un programa que solicite un número por teclado, encuentre cuántos dígitos");
            System.out.println("tiene y lo descomponga y muestre en pantalla.");
            System.out.print("Escriba un número entero: ");
            num = sc.nextInt();

            temp = num;
            cant = 0;
            while (temp > 0) {
                temp = temp / 10;
                cant++;
            }

            System.out.println("El número tiene " + cant + " dígitos y se descompone así:\n");

            resid = num;
            while (cant > 0) {
                temp = (int) Math.pow(10, cant - 1);
                num = resid / temp;
                System.out.print(num * temp);
                cant--;
                resid = resid % temp;
                if (cant > 0) {
                    System.out.print(" - ");
                }
            }

            System.out.print("\n\nPara repetir digite <s>, para salir cualquier tecla: ");
            volver = sc.next();
            System.out.println();
        } while (volver.equalsIgnoreCase("s"));
    }
}
