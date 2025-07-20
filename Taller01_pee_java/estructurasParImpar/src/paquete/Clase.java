
package paquete;

import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String volver, menu;
        int menuEnt, num1, num2, aux, i;

        do {
            System.out.println("Diseñe un programa que solicite 2 números por teclado, luego indique al usuario si desea la serie");
            System.out.println("par o impar, después muestre en pantalla la serie par o impar según la elección desde el número");
            System.out.println("menor que se ingresó al inicio hasta el número mayor.");

            System.out.print("Digite el primer número: ");
            num1 = sc.nextInt();
            System.out.print("Digite el segundo número: ");
            num2 = sc.nextInt();

            while (num1 == num2) {
                System.out.println("Digite nuevamente el segundo número, ya que no puede ser igual al primero:");
                num2 = sc.nextInt();
            }

            if (num1 > num2) {
                aux = num2;
                num2 = num1;
                num1 = aux;
            }

            do {
                menuEnt = 0;
                System.out.println("\n----- Series -----");
                System.out.println("1. Impar");
                System.out.println("2. Par");
                System.out.print("Digite una opción del menú, de lo contrario cualquier otra tecla para salir: ");
                menu = sc.next();

                if (menu.equals("1") || menu.equals("2")) {
                    menuEnt = Integer.parseInt(menu);
                    menu = "";

                    switch (menuEnt) {
                        case 1:
                            System.out.println("\nSerie Impar:");
                            for (i = num1; i <= num2; i++) {
                                if (i % 2 != 0) {
                                    System.out.print(" - " + i);
                                }
                            }
                            System.out.println();
                            break;
                        case 2:
                            System.out.println("\nSerie Par:");
                            for (i = num1; i <= num2; i++) {
                                if (i % 2 == 0) {
                                    System.out.print(" - " + i);
                                }
                            }
                            System.out.println();
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
