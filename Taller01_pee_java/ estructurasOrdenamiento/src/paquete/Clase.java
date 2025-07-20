
package paquete;

import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String volver, menu;
        int menuEnt, num1, num2, num3, aux;

        do {
            System.out.println("Diseñe un programa que por teclado solicite tres números y que según");
            System.out.println("la decisión del usuario los organice de forma ascendente o descendente.");

            System.out.print("\nDigite el valor del primer número: ");
            num1 = sc.nextInt();
            System.out.print("Digite el valor del segundo número: ");
            num2 = sc.nextInt();
            System.out.print("Digite el valor del tercer número: ");
            num3 = sc.nextInt();

            for (int i = 0; i <= 1; i++) {
                if (num1 >= num2) {
                    aux = num1;
                    num1 = num2;
                    num2 = aux;
                }
                if (num2 >= num3) {
                    aux = num2;
                    num2 = num3;
                    num3 = aux;
                }
            }

            do {
                menuEnt = 0;
                System.out.println("\n----- Ordenamiento -----");
                System.out.println("1. Ascendente");
                System.out.println("2. Descendente");
                System.out.print("\nDigite una opción del menú, de lo contrario cualquier tecla para salir: ");
                menu = sc.next();

                if (menu.equals("1") || menu.equals("2")) {
                    menuEnt = Integer.parseInt(menu);
                    menu = "";

                    switch (menuEnt) {
                        case 1:
                            System.out.println("\n" + num1 + " - " + num2 + " - " + num3);
                            break;
                        case 2:
                            System.out.println("\n" + num3 + " - " + num2 + " - " + num1);
                            break;
                    }
                }
            } while (menuEnt == 1 || menuEnt == 2);

            System.out.print("\nPara repetir digite <s>, para salir cualquier tecla: ");
            volver = sc.next();
            System.out.println();

        } while (volver.equalsIgnoreCase("s"));
    }
}
