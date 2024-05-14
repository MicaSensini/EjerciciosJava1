package Ejercicio;

import java.util.Scanner;

/*
Una pequeña despensa desea calcular los sueldos de sus empleados. 
Los puestos de los mismos pueden tener 3 categorias:
*Los repositores cobran $15.890 + un bono del 10%
*Los Cajeros cobran $25630,89 fijos
*los supervisores cobran $35.560,20 en bruto se les descuenta un 11% de jubilacion

Se necesita un programa que dependiendo del tipo de empleado del que se trate,
calcule y muestre en pantalla el correspondiente sueldo
 */

public class Ejercicio12 {

    public static void main(String[] args) {
        double sueldo = 0;
        int categoria = 0;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la categoria para calcular el sueldo");
        categoria = entrada.nextInt();
        
        if (categoria == 1){
             sueldo = 15890 + (15890*0.1);      
        } else {
            if (categoria == 2) {
               sueldo = 25630.69; 
            } else {
                if (categoria == 3){
                     sueldo = 35560.20 - (35560.20 * 0.11);
                } 
            }
        }
        
        if (categoria == 1 || categoria == 2 || categoria == 3) {
           System.out.println("El total del sueldo para la categoria "+categoria+" es: "+sueldo); 
        } else {
           System.out.println("Debe ingresar una categoria valida");
        }
        
        
    }
    
}
