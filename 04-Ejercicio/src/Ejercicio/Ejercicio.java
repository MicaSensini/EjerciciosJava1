package Ejercicio;

import java.util.Scanner;

/*pedir numeros hasta que se teclee uno negativo, 
y mostar cuantos numeros se han intrducido */

public class Ejercicio {

   
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int num, cont = 0;
       
        System.out.println("Ingrese un numero: \n"+"Con negativo sale");
        num = entrada.nextInt();
        
        while (num >=0) {
            cont++;
            System.out.println("ingrese otro numero");
            num = entrada.nextInt();
        }
        
        System.out.println("Cantidad de numeros ingresados: "+cont);
         
    }
    
}
