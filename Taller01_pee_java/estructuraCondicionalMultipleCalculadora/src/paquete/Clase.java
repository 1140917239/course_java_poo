
package paquete;

import java.util.Scanner;
import java.util.Random;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int menu = 0;
        double num1 = 0.0, num2 = 0.0, res = 0.0;

        System.out.println("Diseñe un algoritmo para seleccionar un menú con 10 operaciones matemáticas básicas: suma, resta, multiplicación, división, módulo, cuadrado, raíz cuadrada, potencia, porcentaje y un número aleatorio.\n");

        System.out.println("-------------------- Bienvenido a la Calculadora -------------------");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Módulo");
        System.out.println("6. Cuadrado");
        System.out.println("7. Raíz Cuadrada");
        System.out.println("8. Potencia");
        System.out.println("9. Porcentaje");
        System.out.println("10. Número aleatorio");
        System.out.print("Digite una opción del menú: ");
        menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.println("\n------------------- Bienvenido a la Suma ------------------");
                System.out.print("Digite el primer sumando: ");
                num1 = sc.nextDouble();
                System.out.print("Digite el segundo sumando: ");
                num2 = sc.nextDouble();
                res = num1 + num2;
                System.out.println("\nEl resultado de la suma es: " + res);
                break;
            case 2:
                System.out.println("\n------------------ Bienvenido a la Resta ------------------");
                System.out.print("Digite el minuendo: ");
                num1 = sc.nextDouble();
                System.out.print("Digite el sustraendo: ");
                num2 = sc.nextDouble();
                res = num1 - num2;
                System.out.println("\nEl resultado de la resta es: " + res);
                break;
            case 3:
                System.out.println("\n-------------- Bienvenido a la Multiplicación --------------");
                System.out.print("Digite el primer multiplicando: ");
                num1 = sc.nextDouble();
                System.out.print("Digite el segundo multiplicando: ");
                num2 = sc.nextDouble();
                res = num1 * num2;
                System.out.println("\nEl resultado de la multiplicación es: " + res);
                break;
            case 4:
                System.out.println("\n----------------- Bienvenido a la División -----------------");
                System.out.print("Digite el dividendo: ");
                num1 = sc.nextDouble();
                System.out.print("Digite el divisor: ");
                num2 = sc.nextDouble();
                if (num2 != 0) {
                    res = num1 / num2;
                    System.out.println("\nEl resultado de la división es: " + res);
                } else {
                    System.out.println("\nImposible la división por 0");
                }
                break;
            case 5:
                System.out.println("\n---------- Bienvenido al Módulo de la División ------------");
                System.out.print("Digite el dividendo: ");
                num1 = sc.nextDouble();
                System.out.print("Digite el divisor: ");
                num2 = sc.nextDouble();
                if (num2 != 0) {
                    res = num1 % num2;
                    System.out.println("\nEl módulo de la división es: " + res);
                } else {
                    System.out.println("\nImposible la división por 0");
                }
                break;
            case 6:
                System.out.println("\n-------------- Bienvenido al Cuadrado --------------------");
                System.out.print("Digite la base: ");
                num1 = sc.nextDouble();
                res = Math.pow(num1, 2);
                System.out.println("\nEl cuadrado de " + num1 + " es " + res);
                break;
            case 7:
                System.out.println("\n----------- Bienvenido a la Raíz Cuadrada ----------------");
                System.out.print("Digite la base: ");
                num1 = sc.nextDouble();
                res = Math.sqrt(num1);
                System.out.println("\nLa raíz cuadrada de " + num1 + " es " + res);
                break;
            case 8:
                System.out.println("\n-------------- Bienvenido a la Potencia ------------------");
                System.out.print("Digite la base: ");
                num1 = sc.nextDouble();
                System.out.print("Digite el exponente: ");
                num2 = sc.nextDouble();
                res = Math.pow(num1, num2);
                System.out.println("\nLa potencia cuya base es " + num1 + " y exponente " + num2 + " es " + res);
                break;
            case 9:
                System.out.println("\n---------------- Bienvenido al Porcentaje ---------------");
                System.out.print("Digite el número: ");
                num1 = sc.nextDouble();
                System.out.print("Digite el porcentaje: ");
                num2 = sc.nextDouble();
                res = (num1 * num2) / 100;
                System.out.println("\nEl " + num2 + " porciento de " + num1 + " es " + res);
                break;
            case 10:
                System.out.println("\n----------- Bienvenido al Número Aleatorio --------------");
                System.out.print("Digite el número máximo de aleatoriedad: ");
                num1 = sc.nextDouble();
                res = rand.nextInt((int) num1) + 1;
                System.out.println("\nEl número aleatorio entre 0 y " + num1 + " es: " + res);
                break;
            default:
                System.out.println("\nLa opción no está en el menú");
        }

        System.out.println();
    }
}
