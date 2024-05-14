package Ejercicio;

import java.util.Scanner;

/*Pedir 10 numeros. Mostar la media de los numeros positivos,
la media de los numeros negativos y la cantidad de ceros.*/

public class Ejercicio {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        
        int pos = 0, neg = 0, ceros = 0;
        int cantp = 0, cantn = 0, num; 
        double mediap, median;
        
        
        System.out.println("Ingrese 10 numero: ");
        
        for (int i = 1; i<=10; i++) {
            System.out.println("Numero "+i+": ");
            num = entrada.nextInt();
            
             if (num > 0) {
                 pos = pos + num; 
                 cantp++;
             } else {
                 if (num < 0) {
                    neg = neg + num; 
                    cantn++; 
                 } else {
                   if (num == 0) {
                       ceros++;
                   }  
                 }
             }
        }
        
         if (pos != 0) {
            mediap = pos / cantp;
             System.out.println("La media de positivos es: "+mediap+ " y hay una cantidad de: "+cantp);
         } else {
             System.out.println("No hay media de numeros positivos");
         }
        
         if (neg != 0) {
            median = neg / cantn;
             System.out.println("La media de negativos es: "+median+ " y hay una cantidad de: "+cantn);
         } else {
             System.out.println("No hay media de numeros negativos");
         }
        
        System.out.println("La cantidad de ceros es: "+ceros);
                      
        
    }
    
}
