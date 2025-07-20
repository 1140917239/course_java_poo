
package paquete;

import java.util.Random;
import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String volver;
        int[] dados = new int[2];
        String[] lanzamiento = {"Primer", "Segundo", "Tercer"};

        do {
            System.out.println("\n---------------------------------------------");
            System.out.println("Simulación del juego de parques con dados");
            System.out.println("---------------------------------------------");

            for (int i = 0; i < 3; i++) {
                System.out.println("\n" + lanzamiento[i] + " lanzamiento. Presione ENTER para lanzar dados...");
                sc.nextLine(); 
                
                dados[0] = rand.nextInt(6) + 1; 
                dados[1] = rand.nextInt(6) + 1;

                if (dados[0] == dados[1]) {
                    System.out.println("Ha sacado par de " + dados[0]);
                    if (i == 2) {
                        System.out.println("\n¡Saca una Ficha!");
                        break;
                    }
                } else {
                    System.out.println("Ha sacado " + dados[0] + " y " + dados[1]);
                    System.out.println("¡Lanza de nuevo!");
                    break;
                }
            }

            
            System.out.print("\nPara repetir digite <s>, para salir cualquier otra tecla: ");
            volver = sc.nextLine();

        } while (volver.equalsIgnoreCase("s"));
    }
}
