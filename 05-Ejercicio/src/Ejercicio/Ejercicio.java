package Ejercicio;

import java.util.Scanner;

/*realizar un juego para adivinar un numero.
para ello generar un numero aleatorio entre 0-100, y luego
ir pidiendo numeros indicando "es mayor" o "es menor" segun
sea mayor o menor con respecto a n. el proceso termina cuando
el usuario acierta.  mostar el numero de intentos.
*/

public class Ejercicio {

    
    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
          int num, cant = 0, aleatorio;
      
      
        aleatorio = (int)(Math.random()*100);
      
         System.out.println("Ingrese un numero: "+aleatorio);
         
       do {
          num = entrada.nextInt();
          
          if (num < 0 || num > 100){
              System.out.println("Debe ingresar un numero entre 0 y 100, Ingrese otro");
          } else {
             if (num > aleatorio) {
              System.out.println("Digite un numero menor");
          } else {
              System.out.println("Digite un numero mayor");
          }
              cant++;
          }
       } while( num != aleatorio);
       
       
        System.out.println("Acertaste el numero!!\nIntentos: "+cant);
      
        
        
    }
    
}
