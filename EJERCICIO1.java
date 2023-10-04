
/**
 * Write a description of class EJERCICIO1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class EJERCICIO1
{
   public static void main (String []args)
   {//descripcion de variables
     double n1, n2, n3, suma, division;
    String nombre;

      Scanner entrada=new Scanner (System.in); // creando un objeto la scanner para la entrada de datos
     System.out.print("Da tu nombre:         ");
     nombre=entrada.nextLine();

     System.out.print("Da la primera calificacion:             ");
     n1=entrada.nextInt();

     System.out.print ("Da la segunda calificacion:             ");
    n2=entrada.nextDouble ();

     System.out.print("Da la tercera calificacion:                 ");
     n3=entrada.nextDouble();

     //operaciones
     suma=n1+n2+n3;
     division= (suma)/3;

     //salida
    System.out.print("El promedio de " +nombre+"es"+ division);


}
}