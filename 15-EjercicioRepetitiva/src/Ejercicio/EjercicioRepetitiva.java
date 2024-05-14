package Ejercicio;

import java.util.Scanner;

/*Realizar un programa que dado un limite numerico por teclado (por ejemplo 100)
muestre en pantalla todos los numeros hasta ese limte (empezando por 1)*/

public class EjercicioRepetitiva {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el limite numerico: ");
        int limite = teclado.nextInt();
        
        if (limite <= 0){
            System.out.println("Ingrese un numero mayor a 0");
        } else {
            
        //Repetitivo con for 
        System.out.println("-----Repetitivo con for-----");
        for (int i = 1; i<=limite; i++){
            System.out.print(i+"-");
        }
        
        //Repetitivo con while 
        System.out.println("");
        System.out.println("-----Repetitivo while-----");
        int cont = 1;
        
        while(cont <= limite){
            System.out.print(cont+"-");
            cont++;
        }
        System.out.println("");
        
        }
        
    }
    
}
