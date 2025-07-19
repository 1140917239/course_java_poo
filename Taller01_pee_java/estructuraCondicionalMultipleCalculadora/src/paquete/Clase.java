package paquete;
import java.util.Scanner;
import java.util.Random;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int menu;
        double num1, num2, res;
        String volver;

        do {
            System.out.println("\n-------------------- Bienvenido a la Calculadora -------------------");
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
            System.out.print("Digite una opción (1-10): ");
            menu = sc.nextInt();

            switch (menu) {
                case 1: // Suma
                    System.out.print("Ingrese el primer número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = sc.nextDouble();
                    res = num1 + num2;
                    System.out.println("Resultado: " + res);
                    break;

                case 2: // Resta
                    System.out.print("Ingrese el primer número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = sc.nextDouble();
                    res = num1 - num2;
                    System.out.println("Resultado: " + res);
                    break;

                case 3: // Multiplicación
                    System.out.print("Ingrese el primer número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = sc.nextDouble();
                    res = num1 * num2;
                    System.out.println("Resultado: " + res);
                    break;

                case 4: // División
                    System.out.print("Ingrese el numerador: ");
                    num1 = sc.nextDouble();
                    System.out.print("Ingrese el denominador: ");
                    num2 = sc.nextDouble();
                    if (num2 != 0) {
                        res = num1 / num2;
                        System.out.println("Resultado: " + res);
                    } else {
                        System.out.println("Error: División entre cero.");
                    }
                    break;

                case 5: // Módulo
                    System.out.print("Ingrese el primer número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = sc.nextDouble();
                    res = num1 % num2;
                    System.out.println("Resultado: " + res);
                    break;

                case 6: // Cuadrado
                    System.out.print("Ingrese un número: ");
                    num1 = sc.nextDouble();
                    res = Math.pow(num1, 2);
                    System.out.println("Resultado: " + res);
                    break;

                case 7: // Raíz cuadrada
                    System.out.print("Ingrese un número: ");
                    num1 = sc.nextDouble();
                    if (num1 >= 0) {
                        res = Math.sqrt(num1);
                        System.out.println("Resultado: " + res);
                    } else {
                        System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                    }
                    break;

                case 8: // Potencia
                    System.out.print("Ingrese la base: ");
                    num1 = sc.nextDouble();
                    System.out.print("Ingrese el exponente: ");
                    num2 = sc.nextDouble();
                    res = Math.pow(num1, num2);
                    System.out.println("Resultado: " + res);
                    break;

                case 9: // Porcentaje
                    System.out.print("Ingrese el número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Ingrese el porcentaje: ");
                    num2 = sc.nextDouble();
                    res = (num1 * num2) / 100;
                    System.out.println("Resultado: " + res);
                    break;

                case 10: // Número aleatorio
                    res = rand.nextDouble(); // entre 0.0 y 1.0
                    System.out.println("Número aleatorio: " + res);
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            System.out.print("¿Desea volver al menú? (s/n): ");
            volver = sc.next();
        } while (volver.equalsIgnoreCase("s"));

        sc.close();
        System.out.println("Gracias por usar la calculadora.");
    }
}
