
package paquete;


import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String volver;

        do {
            double radio = 0.0, altura = 0.0, area = 0.0, perimetro = 0.0, volumen = 0.0;

            do {
                System.out.println("Recuerde que el radio de la tapa y la altura no pueden ser menores o iguales a 0");
                System.out.print("Digite el radio: ");
                radio = sc.nextDouble();
                System.out.print("Digite la altura: ");
                altura = sc.nextDouble();
            } while (radio <= 0 || altura <= 0);

            perimetro = 2 * Math.PI * radio;
            area = 2 * Math.PI * Math.pow(radio, 2);
            area = area + (perimetro * altura);
            perimetro = (4 * perimetro) + (2 * altura);
            volumen = Math.PI * Math.pow(radio, 2) * altura;

            System.out.println("\nLa figura es un:   Cilindro");
            System.out.println("Su perímetro es:   " + perimetro + " metros");
            System.out.println("Su área es:        " + area + " metros cuadrados");
            System.out.println("Su volumen es:     " + volumen + " metros cúbicos");

            System.out.print("\nPara repetir digite <s>, para salir cualquier otra tecla: ");
            volver = sc.next();

        } while (volver.equalsIgnoreCase("s"));

        sc.close();
    }
}
