
package paquete;

import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = 0.0, num2 = 0.0, res = 0.0;

        System.out.print("Digite el primer número: ");
        num1 = sc.nextDouble();

        System.out.print("Digite el segundo número: ");
        num2 = sc.nextDouble();

        res = num1 * num2;

        System.out.println();
        System.out.println("El producto del número " + num1 + " con el número " + num2 + " es: " + res);
        System.out.println();
    }
}

