package Ejercicio;

import java.util.Scanner;

/* pedir numeros hasta que se teclee un 0, 
mostar la suma de todos los numeros introducidos. 
 */

public class Ejercicio {

   
    public static void main(String[] args) {
       
      Scanner entrada = new Scanner(System.in);
      int suma = 0, numero;
      
        System.out.println("Ingrese numeros aleatorios, con 0 sale");
        System.out.print("numero: ");
        numero = entrada.nextInt();
        
        while (numero !=0) {
            suma = suma + numero;
            
            
            System.out.print("numero: ");
            numero = entrada.nextInt();
            
        }
      
        System.out.println("la suma total de los numeros es: "+suma);
      
    }
    
    
}
