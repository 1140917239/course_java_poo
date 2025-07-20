
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

        if (num2 != 0) {
            res = num1 / num2;
            System.out.println();
            System.out.println("La división de su número " + num1 + " entre su número " + num2 + " es: " + res);
        } else {
            System.out.println();
            System.out.println("Imposible la división por 0");
        }

        System.out.println();
    }
}
