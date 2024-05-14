package Ejercicios;

import java.util.Scanner;

/* Realizar un programa que permita cargar 15 numeros en un vector.
Una vez cargados, se necesita que el programa cuente e informe
por panralla cuantas veces se cargo el numero 3*/

public class EjerciciosArreglos {

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      int numeros[] = new int[15];
      int cant3 = 0;
      
        System.out.println("Ingrese los 15 numeros");
      for(int i=0; i<numeros.length; i++){
          System.out.print("Numero "+(i+1)+": ");
          numeros[i] = teclado.nextInt();
      }
      
      for(int i=1; i<numeros.length; i++){
         if(numeros[i] == 3){
            cant3++; 
         }
      }
      
      System.out.println("La cantidad de veces que se repite el numero 3 es: "+cant3);
      
      
    }
    
}
