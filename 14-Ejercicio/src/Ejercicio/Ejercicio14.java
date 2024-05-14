package Ejercicio;

import java.util.Scanner;

/* dadas 6 notas, escribir la cantidad de alumnos 
aprobados, condicionales (=4) y suspensos.*/

public class Ejercicio14 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int cana = 0, cants = 0, cantc = 0, notas;
      
      
      for (int i = 1; i<=6; i++) {
          
          do {
          System.out.print("Ingrse la nota alumno "+i+": ");
          notas = entrada.nextInt();
          } while(notas<0 || notas>10);
          
          
          if (notas > 4) {
              cana++;
          } else {
              if (notas < 4) {
                  cants++;
              } else {
                  if (notas == 4) {
                     cantc++; 
                  }
              }
          }
      }
      
        System.out.println("-------------------------");
        System.out.println("Alumnos aprobados: "+cana);
        System.out.println("Alumnos suspensos: "+cants);
        System.out.println("Alumnos condicionales: "+cantc);
        
        
    }
    
}
