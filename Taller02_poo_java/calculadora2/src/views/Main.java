package views;

import models.Class;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int menu;
        int res;
        Scanner ent = new Scanner(System.in);
        
        System.out.println("----------Menu-----------");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        System.out.println("digite una opcion");
        menu = ent.nextInt();

        switch (menu) {
            case 1:
                
                Class suma = new Class();
              
                System.out.print("Ingrese el primer número: ");
                suma.setNum_1(ent.nextInt());
                
                System.out.print("Ingrese el segundo número: ");
                suma.setNum_2(ent.nextInt());
                
                System.out.println("La suma es: " + suma.sumar());
                
             
                break;

             
            case 2:
                Class resta = new Class();
              
                System.out.print("Ingrese el primer número: ");
                resta.setNum_1(ent.nextInt());
                
                System.out.print("Ingrese el segundo número: ");
                resta.setNum_2(ent.nextInt());
               
                
                System.out.println("La resta es: " +resta.restar());
                break;
                

            case 3:
                Class multiplicacion = new Class();
              
                System.out.print("Ingrese el primer número: ");
                multiplicacion.setNum_1(ent.nextInt());
                
                System.out.print("Ingrese el segundo número: ");
                multiplicacion.setNum_2(ent.nextInt());
               
               
                System.out.println("La multiplicacion es: " + multiplicacion.multiplicar());
                break;
             
            case 4:
                Class division = new Class();
              
                System.out.print("Ingrese el primer número: ");
                division.setNum_1(ent.nextInt());
                
                System.out.print("Ingrese el segundo número: ");
                division.setNum_2(ent.nextInt());
               
                
                System.out.println("La division es: " + division.dividir());
                break;
               

        }

    }

}

   

