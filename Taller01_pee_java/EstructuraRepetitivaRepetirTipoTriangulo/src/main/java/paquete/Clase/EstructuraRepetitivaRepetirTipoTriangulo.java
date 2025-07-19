

package paquete.Clase;


import java.util.Scanner;

public class EstructuraRepetitivaRepetirTipoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char volver;

        int menu;
        double angA, angB, angC, ladoA, ladoB, ladoC;

        do {
            angA = angB = angC = 0.0;
            ladoA = ladoB = ladoC = 0.0;

            System.out.println("Diseñe un algoritmo que encuentre el tipo de triángulo que se tiene, mostrando un menú que pida si se ingresarán ángulos o lados");
            System.out.println("y se dé la opción para escoger uno de los dos. Si se selecciona por ángulos, la suma debe ser 180°.");
            System.out.println("Si se selecciona por lados, la suma de los dos lados más cortos debe ser mayor al más largo.");

            System.out.println();
            System.out.println("---------- MENU ----------");
            System.out.println("1. Ángulos");
            System.out.println("2. Lados");
            System.out.print("Seleccione una opción del menú: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println();
                    System.out.println("-------------- Triángulo x Ángulos ------------------");
                    do {
                        System.out.println();
                        System.out.println("Recuerde que los ángulos deben ser mayores a 0");
                        System.out.print("Digite el ángulo A: ");
                        angA = sc.nextDouble();
                        System.out.print("Digite el ángulo B: ");
                        angB = sc.nextDouble();
                    } while (angA <= 0 || angB <= 0);

                    angC = 180 - (angA + angB);

                    if (angC > 0) {
                        if (angA == 90 || angB == 90 || angC == 90) {
                            System.out.println("Es un triángulo: RECTÁNGULO");
                        }
                        if (angA > 90 || angB > 90 || angC > 90) {
                            System.out.println("Es un triángulo: OBTUSÁNGULO");
                        }
                        if (angA < 90 && angB < 90 && angC < 90) {
                            System.out.println("Es un triángulo: ACUTÁNGULO");
                        }
                    } else {
                        System.out.println("Ángulos Incorrectos");
                    }
                    break;

                case 2:
                    System.out.println();
                    System.out.println("-------------- Triángulo x Lados ------------------");
                    do {
                        System.out.println("Recuerde que los lados deben ser mayores a 0");
                        System.out.print("Digite el lado A: ");
                        ladoA = sc.nextDouble();
                        System.out.print("Digite el lado B: ");
                        ladoB = sc.nextDouble();
                        System.out.print("Digite el lado C: ");
                        ladoC = sc.nextDouble();
                    } while (ladoA <= 0 || ladoB <= 0 || ladoC <= 0);

                    if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
                        if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
                            if (ladoA == ladoB && ladoB == ladoC) {
                                System.out.println("Es un triángulo: EQUILATERO");
                            } else {
                                System.out.println("Es un triángulo: ISÓSCELES");
                            }
                        } else {
                            System.out.println("Es un triángulo: ESCALENO");
                        }
                    } else {
                        System.out.println("Lados Incorrectos");
                    }
                    break;

                default:
                    System.out.println("La opción del menú no existe");
                    break;
            }

            System.out.println();
            System.out.print("Para repetir digite < s >, para salir cualquier tecla: ");
            volver = sc.next().toLowerCase().charAt(0);

        } while (volver == 's');

        sc.close();
    }
}
