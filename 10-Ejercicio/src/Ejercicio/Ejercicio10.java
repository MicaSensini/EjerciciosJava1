package Ejercicio;

import java.util.Scanner;

/*Pide un numero y mostar la tabla de multiplicar de dicho numero*/

public class Ejercicio10 {

   
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int num, total , i = 0;
      
        System.out.println("Ingrese un numero: ");
        num = entrada.nextInt();
      
        if (num > 0) {
       while (i <= 10) {
           total = i * num;
           System.out.println(i+" * "+num+"= "+total);
           i++;
       }
        } else {
            System.out.println("Ingrese un numero mayor a 0");
        }
        
        
    }   
}
