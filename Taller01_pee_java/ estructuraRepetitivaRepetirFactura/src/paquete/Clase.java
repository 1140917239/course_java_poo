
package paquete;

import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String volver, canasta, mas, articulo;
        int cantidad;
        double IVA = 0.19;
        double precio, ivaPrd, ivaAcm, subtotal, totalParcial, total;

        do {
            canasta = "";
            articulo = "";
            cantidad = 0;
            ivaAcm = 0.0;
            precio = 0.0;
            total = 0.0;

            do {
                ivaPrd = 0.0;
                totalParcial = 0.0;
                subtotal = 0.0;

                System.out.print("\nNombre del Artículo: ");
                articulo = sc.nextLine();
                System.out.print("             Precio: ");
                precio = Double.parseDouble(sc.nextLine());
                System.out.print("           Cantidad: ");
                cantidad = Integer.parseInt(sc.nextLine());
                System.out.print("      Canasta (s/n): ");
                canasta = sc.nextLine();

                totalParcial = precio * cantidad;

                if (!canasta.equalsIgnoreCase("s")) {
                    ivaPrd = totalParcial * IVA;
                }

                totalParcial = totalParcial - ivaPrd;
                subtotal = totalParcial + ivaPrd;

                total += totalParcial;
                ivaAcm += ivaPrd;

                System.out.printf("      Total Parcial:   %.2f\n", totalParcial);
                System.out.printf("                IVA:   %.2f\n", ivaPrd);
                System.out.printf("  Subtotal Producto:   %.2f\n", subtotal);
                System.out.printf("    Subtotal Compra:   %.2f\n", total);
                System.out.printf("      IVA Acumulado:   %.2f\n", ivaAcm);

                System.out.print("\nDigite < s > para ingresar otro articulo, de lo contrario cualquier tecla: ");
                mas = sc.nextLine();
            } while (mas.equalsIgnoreCase("s"));

            System.out.println("\n----------- GRACIAS POR SU COMPRA -----------------");
            System.out.printf("    Subtotal Compra:   %.2f\n", total);
            System.out.printf("      IVA Acumulado:   %.2f\n", ivaAcm);
            total = total + ivaAcm;
            System.out.printf("      Total a Pagar:   %.2f\n", total);

            System.out.print("\nPara repetir digite < s >, para salir cualquier tecla: ");
            volver = sc.nextLine();
        } while (volver.equalsIgnoreCase("s"));
    }
}

