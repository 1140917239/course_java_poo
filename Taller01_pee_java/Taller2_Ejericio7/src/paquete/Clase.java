


package paquete;


import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String volver;

        do {
            int num1 = 0, num2 = 0, aux;
            int[] pares = new int[100000];
            int[] impares = new int[100000];
            int cont = 0;
            int menu;

            // Objetivo del algoritmo
            System.out.println("Diseñe un programa que solicite 2 números por teclado, luego indique");
            System.out.println("al usuario si desea la serie par o impar, y muestre la serie entre los dos números.\n");

            // Ingreso de datos
            System.out.print("Digite el primer número: ");
            num1 = sc.nextInt();

            do {
                System.out.print("Digite el segundo número: ");
                num2 = sc.nextInt();

                if (num1 == num2) {
                    System.out.println("\nEl segundo número no puede ser igual al primero. Intente de nuevo.\n");
                } else if (num1 > num2) {
                    aux = num1;
                    num1 = num2;
                    num2 = aux;
                }
            } while (num1 == num2);

            // Llenar vectores
            int indexPar = 0, indexImpar = 0;
            for (int i = num1; i <= num2; i++) {
                if (i % 2 == 0) {
                    pares[indexPar++] = i;
                } else {
                    impares[indexImpar++] = i;
                }
            }

            // Menú
            sc.nextLine(); // limpiar buffer
            do {
                System.out.println("\n----- Series -----");
                System.out.println("1. Impar");
                System.out.println("2. Par");
                System.out.print("Digite una opción del menú: ");
                String opcion = sc.nextLine();

                switch (opcion) {
                    case "1":
                        System.out.println("\nSerie Impar:");
                        for (int i = 0; i < indexImpar; i++) {
                            System.out.print(impares[i] + " ");
                        }
                        System.out.println();
                        break;

                    case "2":
                        System.out.println("\nSerie Par:");
                        for (int i = 0; i < indexPar; i++) {
                            System.out.print(pares[i] + " ");
                        }
                        System.out.println();
                        break;

                    default:
                        opcion = "x"; // Para salir del menú
                }

                if (!opcion.equals("1") && !opcion.equals("2")) {
                    break;
                }
            } while (true);

            // Preguntar si desea repetir
            System.out.print("\nSi desea volver al ejercicio digite (s), de lo contrario cualquier otra tecla: ");
            volver = sc.nextLine();
            System.out.println();

        } while (volver.equalsIgnoreCase("s"));
    }
}
