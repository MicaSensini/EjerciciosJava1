package Ejercicio;

import java.util.Scanner;

/* Leer un numero y mostar su cuadrado, repetir el proceso 
hasta que se introduzca un numero negativo
 */

public class Ejercicio {

   
    public static void main(String[] args) {
        
       //Scanner permite obtener una entrada de datos
       Scanner entrada = new Scanner(System.in);
       int numero; 
       double suma;
       
        System.out.println("Ingrese un numero. Con numero negativo Sale ");
        //Tomo el valor que ingresa el usuario
        numero = entrada.nextInt();
        
        while (numero >= 0) {
        
           if (numero >= 1) {
        
                suma = Math.pow(numero, 2);
                System.out.println("Su cuadrado es: "+suma);
                
            } 
            
            System.out.println("Ingrese otro numero: ");
            numero = entrada.nextInt();
    }
        
        
    }
    
}
