package paquete;

import java.util.Scanner;

public class Clase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int color1;
        int color2;
        String resultado;

        color1 = 0;
        color2 = 0;
        resultado = "";
        System.out.print("");
        System.out.print("1.amarillo");
        System.out.print("2.azul");
        System.out.print("3.rojo");
         System.out.print("");

        System.out.print("Seleccione el primer número de color: ");
        color1 = scanner.nextInt();

        System.out.print("Seleccione el segundo número de color: ");
        color2 = scanner.nextInt();
        
        if ((color1 > 0 && color1 <= 3) && (color2 > 0 && color2 <= 3)) {
            if (color1 != color2) {
               
                if ((color1 == 1 && color2 == 2) || (color1 == 2 && color2 == 1)) {
                    resultado = "Verde";
                }
                if ((color1 == 1 && color2 == 3) || (color1 == 3 && color2 == 1)) {
                    resultado = "Naranja";
                }
                if ((color1 == 2 && color2 == 3) || (color1 == 3 && color2 == 2)) {
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
                resultado += ". Seleccionó el mismo color.";
            }

            
            System.out.println();
            System.out.println("El color es: " + resultado);
        } else {
            
            System.out.println();
            System.out.println("En el Menú no existe el color.");
        }

        System.out.println();
        scanner.close();
    }

}
