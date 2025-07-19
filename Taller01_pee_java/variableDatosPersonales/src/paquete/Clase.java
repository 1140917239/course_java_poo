
package paquete;
import java.util.Scanner;

public class Clase {

    
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

      

        
        String nombre;
        char sexo;
        int edad;
        double salario;
        boolean transporte;

       
        nombre = "";
        sexo = ' ';
        edad = 0;
        salario = 0.0;
        transporte = false;

        
        System.out.print("Digite su nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Digite su sexo (H,M): ");
        sexo = scanner.next().charAt(0);

        System.out.print("Digite su edad: ");
        edad = scanner.nextInt();

        System.out.print("Digite su salario (con centavos): ");
        salario = scanner.nextDouble();

        System.out.print("¿Tiene vehículo? (1 = Si, 0 = No): ");
        int vehiculo = scanner.nextInt();
        transporte = (vehiculo == 1);

       
        System.out.println("");
        System.out.println("    Su nombre es : " + nombre);
        System.out.println("        Usted es : " + sexo);
        System.out.println("     Usted Tiene : " + edad + " años");
        System.out.println("      Usted gana : " + salario + " pesos");
        System.out.println("¿Tiene vehículo? : " + transporte);
        System.out.println("");

        scanner.close();
    }
    
}
