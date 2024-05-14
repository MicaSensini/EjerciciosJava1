package Ejercicio;
/*Realizar un programa que permita el intercambio de valores entre dos variables.
por ejemplo: si una variable numero 1 vale 30 y una variable 2 vale 25
realizar las acciones necesarias para que intercambien los valores
una vez realizado mostar en pantalla*/

public class Ejercicio11 {

    
    public static void main(String[] args) {
        int numero1 = 30;
        int numero2 = 25;
        int aux;
        
        System.out.println("----Antes----");
        System.out.println("Numero 1: "+numero1);
        System.out.println("Numero 2: "+numero2);
        
        //paso el valor de numero1 a aux
        aux = numero1;
        //numero2 pasa a numero1
        numero1 = numero2;
        //numero2 toma aux
        numero2 = aux;
        
        System.out.println("----Despues----");
        System.out.println("Numero 1: "+numero1);
        System.out.println("Numero 2: "+numero2);
        
        
                
    }
    
}
