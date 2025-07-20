
package paquete;

import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String volver;

        final double IVA = 0.19;
        String[][] factura = new String[20][8];
        String[] encabezado = {
            "Item        |", "Nombre      |", "Precio      |", "Cantidad    |",
            "Canst (s/n) |", "IvaProd     |", "Parcial     |", "SubTotal    |"
        };

        do {
            String otroPrd;
            int i = 0, cant = 0;
            double ivaAcm = 0, total = 0;

            do {
                double subtotal = 0, ivaParc = 0, totalParc = 0;

                for (int j = 0; j < 8; j++) {
                    factura[i][0] = String.valueOf(i + 1);

                    if (j > 0 && j < 5) {
                        System.out.print("[" + i + "," + j + "]. " + encabezado[j] + ": ");
                        factura[i][j] = sc.nextLine();
                    }

                    if (j == 5) {
                        double precio = Double.parseDouble(factura[i][2]);
                        int cantidad = Integer.parseInt(factura[i][3]);
                        subtotal = precio * cantidad;

                        if (!factura[i][4].equalsIgnoreCase("s")) {
                            ivaParc = subtotal * IVA;
                            factura[i][5] = String.format("%.2f", ivaParc);
                            factura[i][4] = "19 %";
                        } else {
                            ivaParc = 0;
                            factura[i][5] = "0";
                            factura[i][4] = " 0 %";
                        }

                        ivaAcm += ivaParc;
                    }

                    if (j == 6) {
                        totalParc = subtotal - ivaParc;
                        factura[i][6] = String.format("%.2f", totalParc);
                        total += totalParc;
                    }

                    if (j == 7) {
                        factura[i][7] = String.format("%.2f", subtotal);
                    }
                }

                System.out.println("\n      IVA Producto |: > " + ivaParc);
                System.out.println("     Total Parcial |: > " + totalParc);
                System.out.println(" Subtotal Producto |: > " + subtotal);

                System.out.println("\n         Total IVA |: > " + ivaAcm);
                System.out.println("   SubTotal Compra |: > " + total);
                System.out.println("     Total a Pagar |: > " + (total + ivaAcm));

                System.out.print("\n¿Desea agregar otro articulo? (s / n): ");
                otroPrd = sc.nextLine();

                if (otroPrd.equalsIgnoreCase("s")) {
                    cant++;
                    i++;
                } else {
                    cant = i + 1;
                }

            } while (i < cant);

            // Mostrar tabla
            System.out.println("\n------------------------------------------------------------------------------------------------------------|");
            for (String title : encabezado) {
                System.out.print("     " + title);
            }
            System.out.println("\n------------------------------------------------------------------------------------------------------------|");

            for (i = 0; i < cant; i++) {
                for (int j = 0; j < 8; j++) {
                    String dato = factura[i][j];
                    while (dato.length() < 11) {
                        dato += " ";
                    }
                    System.out.print("     " + dato + "|");
                }
                System.out.println();
            }

            System.out.println("------------------------------------------------------------------------------------------------------------|");
            System.out.println("\n                                                                                           Total IVA :     " + ivaAcm);
            System.out.println("                                                                                     SubTotal Compra :     " + total);
            System.out.println("                                                                                       Total a Pagar :     " + (total + ivaAcm));
            System.out.println("------------------------------------------------------------------------------------------------------------|");

            System.out.print("\nPara repetir digite <s>, para salir cualquier tecla: ");
            volver = sc.nextLine();

        } while (volver.equalsIgnoreCase("s"));
    }
}
