
package paquete;

import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int color1 = 0, color2 = 0;
        String resultado = "";

        System.out.println("Diseñe un algoritmo que muestre un menú: Amarillo = 1, azul = 2, rojo = 3. Luego solicite al usuario digitar dos de estos números para descifrar la combinación. Ejemplo: 1 y 3, el resultado mostrado en pantalla (su combinación es naranja). Recuerde que el usuario puede colocar el mismo número dos veces y números fuera del rango.\n");

        System.out.println("----- MENU -----");
        System.out.println("1. Amarillo");
        System.out.println("2. Azul");
        System.out.println("3. Rojo");
        System.out.print("Seleccione el primer número de color: ");
        color1 = sc.nextInt();
        System.out.print("Seleccione el segundo número de color: ");
        color2 = sc.nextInt();

        if ((color1 > 0 && color1 <= 3) && (color2 > 0 && color2 <= 3)) {
            if (color1 != color2) {
                if ((color1 == 1 && color2 == 2) || (color2 == 1 && color1 == 2)) {
                    resultado = "Verde";
                }
                if ((color1 == 1 && color2 == 3) || (color2 == 1 && color1 == 3)) {
                    resultado = "Naranja";
                }
                if ((color1 == 2 && color2 == 3) || (color2 == 2 && color1 == 3)) {
                    resultado = "Violeta";
                }
            } else {
                if (color1 == 1) {
                    resultado = "Amarillo";
                }
                if (color1 == 2) {
                    resultado = "Azul";
                }
                if (color1 == 3) {
                    resultado = "Rojo";
                }
                resultado = resultado + ". Seleccionó el mismo color.";
            }
            System.out.println("\nEl color es: " + resultado);
        } else {
            System.out.println("\nEn el Menú no existe el color");
        }

        System.out.println();
    }
}
