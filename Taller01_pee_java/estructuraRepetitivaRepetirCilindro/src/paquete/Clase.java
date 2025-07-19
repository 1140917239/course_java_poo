
package paquete;

import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char volver;

        double radio, altura, area, perimetro, volumen;

        do {
            radio = 0.0;
            altura = 0.0;
            area = 0.0;
            perimetro = 0.0;
            volumen = 0.0;

            System.out.println("Diseñe un algoritmo que encuentre el área y perímetro del material necesario para construir un cilindro con tapa,");
            System.out.println("también que volumen ocupará, con sus respectivas unidades y restricciones.");

            do {
                System.out.println();
                System.out.println("Recuerde que el radio de la tapa y la altura del rectángulo no pueden ser menores o iguales a 0");
                System.out.print("Digite el radio: ");
                radio = sc.nextDouble();
                System.out.print("Digite la altura: ");
                altura = sc.nextDouble();
            } while (radio <= 0 || altura <= 0);

            perimetro = 2 * Math.PI * radio;
            area = 2 * (Math.PI * Math.pow(radio, 2));
            area = area + (perimetro * altura);
            perimetro = (4 * perimetro) + (2 * altura);
            volumen = (Math.PI * Math.pow(radio, 2)) * altura;

            System.out.println();
            System.out.println("La Figura es un:   Cilindro");
            System.out.println("Su perímetro es:   " + perimetro + " metros");
            System.out.println("Su área es:        " + area + " metros cuadrados");
            System.out.println("Su volumen es:     " + volumen + " metros cúbicos");

            System.out.println();
            System.out.print("Para repetir digite < s >, para salir cualquier tecla: ");
            volver = sc.next().toLowerCase().charAt(0);

        } while (volver == 's');

        sc.close();
    }
}

