
package paquete.Clase;

import java.util.Scanner;

public class AlgoritmoCentinela0_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char volver;

        do {
            System.out.println("");
            volver = 's';
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.print("Para repetir digite < s >, para salir cualquier tecla: ");
            volver = sc.next().charAt(0);
        } while (volver == 's');

        sc.close();
    }
}

