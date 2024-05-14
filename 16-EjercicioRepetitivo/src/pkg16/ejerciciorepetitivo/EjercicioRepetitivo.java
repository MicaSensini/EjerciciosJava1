package pkg16.ejerciciorepetitivo;

/* hacer una piramide
    *
   ***
  *****
 ******* */

public class EjercicioRepetitivo {

    public static void main(String[] args) {
       
        //Declaramos la altura de la piramide
        int alt = 4;
        
        //Bucle para recorres todas las filas
        for(int fila=0; fila<alt; fila++){
            
            //Bucle para los espacios
            for(int espacio =0; espacio< alt-fila-1; espacio++){
                System.out.print(" ");
            }
            
            //Bucle para los asteriscos
            for(int asterisco=0; asterisco<(fila*2)+1; asterisco++) {
                System.out.print("*");
            }
            
            System.out.println(" ");
        }
        
        
    }
    
}
