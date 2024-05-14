package Ejercicios;

import java.util.Scanner;

/*En tres vectores diferentes se guardan los nombres, temperaturas maximas y minimas 
de 5 ciudades de la provincia de Buenos Aires. En el 1° vector se guardan los nombres
de las cuidades, en el 2° las temperaturas minimas alcanzadas y en el 3° las 
temperaturas maximas. Se necesita un programa que permita la carga de las ciudades, las 
temperaturas min y max; ademas, debera informar por pantalla cual fue la ciudad con la 
temperatura mas baja y cual con la temperatura mas alta (dando a conocer al mismo tiempo 
la cantidad de grados)*/

public class EjerciciosArreglos {

    public static void main(String[] args) {
        String[] provincia = new String[5];
        double[] temMin = new double[5];
        double[] temMax = new double[5];
        Scanner teclado = new Scanner(System.in);
        double max = -100,min = 100;
        int posMin=0,posMax=0;
        
        for(int i=0; i<provincia.length; i++){
            System.out.print("Ingrese la provincia "+(i+1)+": ");
            provincia[i]= teclado.next();
            
            System.out.print("Temperatura minima: ");
            temMin[i]=teclado.nextDouble();
            
            System.out.print("Temperatura maxima: ");
            temMax[i]=teclado.nextDouble();
            
            if(temMin[i] < min){
                min=temMin[i];
                posMin=i;
            }
            
            if(temMax[i]>max){
                max=temMax[i];
                posMax=i;
            }   
        }
        
        System.out.println("La temperatura minima fue "+min+" en la provincia "+provincia[posMin]);
        System.out.println("La temperatura maxima fue "+max+" en la provincia "+provincia[posMax]);
        
        
        
    }
    
}
