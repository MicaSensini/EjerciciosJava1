package Ejercicio;

import java.util.Scanner;

/*Leer numeros hasta que se introduzca un 0. Para cada uno
indicar si es par o impar*/

public class Ejercicio {

  public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un numero. Con 0 sale");
        num = entrada.nextInt();
                
        while (num != 0) {
            
            if (num % 2 == 0) {
                System.out.println("El numero es par");
            } else {
               System.out.println("El numero es impar");
            }
            
         
        System.out.println("Ingrese otro numero, con 0 sale");
        num = entrada.nextInt();
                
        }
              
    }
    
}
