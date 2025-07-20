
package paquete;

import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String volver;

        do {
            int[] vector = new int[3];
            String menu;

            
            System.out.println("Diseñe un programa que por teclado solicite tres números y que según");
            System.out.println("la decisión del usuario los organice de forma ascendente o descendente.\n");

            
            for (int i = 0; i < 3; i++) {
                System.out.print("Digite el valor " + (i + 1) + ": ");
                vector[i] = sc.nextInt();
            }

            
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    if (vector[j] >= vector[j + 1]) {
                        int aux = vector[j];
                        vector[j] = vector[j + 1];
                        vector[j + 1] = aux;
                    }
                }
            }

           
            sc.nextLine(); 
            do {
                System.out.println("\n----- Ordenamiento -----");
                System.out.println("1. Ascendente");
                System.out.println("2. Descendente");
                System.out.print("Digite una opción del menú: ");
                menu = sc.nextLine();

                switch (menu) {
                    case "1":
                        System.out.print("\nVector ordenado ascendentemente: ");
                        for (int i = 0; i < 3; i++) {
                            System.out.print(vector[i] + " ");
                        }
                        System.out.println();
                        break;
                    case "2":
                        System.out.print("\nVector ordenado descendentemente: ");
                        for (int i = 2; i >= 0; i--) {
                            System.out.print(vector[i] + " ");
                        }
                        System.out.println();
                        break;
                }
            } while (menu.equals("1") || menu.equals("2"));

          
            
            System.out.print("\nSi desea volver a escribir los números digite (s), de lo contrario cualquier tecla: ");
            volver = sc.nextLine();
            System.out.println();

        } while (volver.equalsIgnoreCase("s"));
    }
}
