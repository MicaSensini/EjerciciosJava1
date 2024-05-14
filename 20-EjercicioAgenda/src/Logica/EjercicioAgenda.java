package Logica;

import IGU.Pantalla;

 /*Agenda electrónica: programa para gestionar los contactos de una agenda electrónica.
En la agenda se debe permitir ingresar los siguientes datos: dni, nombre, apellido,
fecha nacimiento, teléfono y dirección.
Se necesita almacenar los datos de 10 personas. Para ello se propone la utilización de 
1 vector para almacenar los valores de cada uno de los campos (teniendo en cuenta que 
puede existir distintos tipos de datos), en donde cada índice indicará los datos de una 
determinada persona en todos los vectores.
El programa debe permitir cargar valores en una determinada posición del vector 
(al hacer clic en el vector cargar) y recorrer el vector encontrando los datos cargados.
*/

public class EjercicioAgenda {

    public static void main(String[] args) {
        //Inicializo, hago visible y centro Pantalla(el form, lo que ve el usuario)
       Pantalla p = new Pantalla();
       p.setVisible(true);
       p.setLocationRelativeTo(null);
       
    }
    
}
