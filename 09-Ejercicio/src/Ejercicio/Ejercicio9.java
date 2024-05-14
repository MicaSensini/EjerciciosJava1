package Ejercicio;

import java.util.Scanner;

/*Dadas las edades y alturas de 5 alumnos, mostar la edad
y la estatura media, la cantidad de alumnos mayores de 18
y la cantidad de alumnos que miden mas de 1,75*/

public class Ejercicio9 {

   
    public static void main(String[] args) {
       double testatura, tedad, sestatura = 0, sumaedad = 0;
       int cant1 = 0;
       int mayora = 0, mayore = 0;
       double  altura;
       int edad;
       
       
       Scanner entrada = new Scanner(System.in);
       
      for (int i = 1; i <=5; i++) {
          System.out.println("Alumno "+i+": ");
          System.out.print("Ingrese su edad: ");
          edad = entrada.nextInt();
          System.out.print("Ingrese su altura: ");
          altura = entrada.nextDouble();
          
          sestatura = sestatura + altura;
          cant1++;
          sumaedad = sumaedad + edad;
      
          
          if (edad >= 18){
              mayore++;
          }
          
          if (altura >= 1.75) {
              mayora++;
          }
      } 
       
      if (sestatura > 0 && sumaedad > 0) {
          testatura = sestatura/cant1;
          tedad = sumaedad/cant1;
          System.out.println("La estatura promedio es: "+ testatura);
          System.out.println("La edad promedio es: "+tedad);
      } else {
          System.out.println("Ingrese altura y edad correctas"); 
      }
      
     if (mayore > 0){
       System.out.println("Alumnos mayores a 18: "+mayore);  
     } else {
         System.out.println("No hay alumnos mayores de 18");
     }
     
     if (mayore > 0){
        System.out.println("Alumnos que miden mas de 1.75: "+mayora); 
     } else {
         System.out.println("No hay alumnos que miden mas de 1.75");
     }
             
        
        
        
    }
    
}
