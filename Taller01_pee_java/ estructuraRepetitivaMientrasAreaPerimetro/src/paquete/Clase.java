
package paquete;

import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        double ladoA = 0.0, ladoB = 0.0, ladoC = 0.0, radio = 0.0;
        double area = 0.0, perimetro = 0.0;

        System.out.println("---------- MENU ----------");
        System.out.println("1. Triángulo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Círculo");
        System.out.print("Seleccione una opción del menú: ");
        menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.print("Digite la base: ");
                ladoA = sc.nextDouble();
                while (ladoA <= 0) {
                    System.out.print("Digite nuevamente la base: ");
                    ladoA = sc.nextDouble();
                }

                System.out.print("Digite la altura: ");
                ladoB = sc.nextDouble();
                while (ladoB <= 0) {
                    System.out.print("Digite nuevamente la altura: ");
                    ladoB = sc.nextDouble();
                }

                area = (ladoA * ladoB) / 2;
                ladoC = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2));
                perimetro = ladoA + ladoB + ladoC;

                System.out.println("La figura es un Triángulo.");
                System.out.println("Área: " + area + " unidades cuadradas");
                System.out.println("Perímetro: " + perimetro + " unidades");
                break;

            case 2:
                System.out.print("Digite el lado A: ");
                ladoA = sc.nextDouble();
                System.out.print("Digite el lado B: ");
                ladoB = sc.nextDouble();
                while (ladoA <= 0 || ladoB <= 0) {
                    System.out.print("Digite nuevamente el lado A: ");
                    ladoA = sc.nextDouble();
                    System.out.print("Digite nuevamente el lado B: ");
                    ladoB = sc.nextDouble();
                }

                area = ladoA * ladoB;
                perimetro = 2 * (ladoA + ladoB);

                System.out.println("La figura es un Rectángulo.");
                System.out.println("Área: " + area + " unidades cuadradas");
                System.out.println("Perímetro: " + perimetro + " unidades");
                break;

            case 3:
                System.out.print("Digite el radio: ");
                radio = sc.nextDouble();
                while (radio <= 0) {
                    System.out.print("Digite nuevamente el radio: ");
                    radio = sc.nextDouble();
                }

                area = Math.PI * Math.pow(radio, 2);
                perimetro = 2 * Math.PI * radio;

                System.out.println("La figura es un Círculo.");
                System.out.println("Área: " + area + " unidades cuadradas");
                System.out.println("Perímetro: " + perimetro + " unidades");
                break;

            default:
                System.out.println("La opción del menú no existe.");
        }

        sc.close();
    }
}
