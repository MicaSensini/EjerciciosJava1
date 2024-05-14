package Ejercicios;

import java.util.Scanner;

/* En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundaria.
cada fila corresponde a las notas y al promedio de cada alumno. Se necesita un programa 
que permita a un profesor cargar, en las 3 posiciones (columnas) de cada fila, las notas
del alumno y que en la ultima columna se calcule el promedio. 
Una vez realizado los calculos, se desea mostrar las 3 notas de cada alumno y el promedio 
correspondiente.
 */

public class EjerciciosArreglos {

    public static void main(String[] args) {
        
        Double notas[][] = new Double[4][4];
        Scanner teclado = new Scanner(System.in);
        double promedio = 0;
        
        for(int f=0; f<4; f++){
            System.out.println("Ingrese la notas del alumno "+(f+1)+": ");
          for(int c=0; c<3; c++){
              
              do{
                System.out.print("Nota "+(c+1)+": ");
                notas[f][c]= teclado.nextDouble();   
              } while(notas[f][c]<0 || notas[f][c]>10);
              
           promedio = promedio+notas[f][c];    
          }
          notas[f][3] = promedio/3;
          promedio=0;
        }
        
        for(int f=0; f<4; f++){
            System.out.println("La notas del alumnos "+(f+1)+" son: ");
          for(int c=0; c<3; c++){
              System.out.print("- Nota "+(c+1)+": "+notas[f][c]);
          }
            System.out.print(" => Promedio: "+notas[f][3]);
            System.out.println("");
        }
        
        
        
        
        
        
    }
    
}
