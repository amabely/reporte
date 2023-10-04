
/**
 * Write a description of class EJERCICIO2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EJERCICIO2

{
   public static void main (String []args)
   {//descripcion de variables
     double n1, n2, n3, suma, perimetro;
    String nombre;

      Scanner entrada=new Scanner (System.in); // creando un objeto la scanner para la entrada de datos
     System.out.print("Da tu nombre:         ");
     nombre=entrada.nextLine();

     System.out.print ("Ingresa la altura:             ");
      n2=entrada.nextDouble ();

     System.out.print("Da la  base del rectangulo:                 ");
     n3=entrada.nextDouble();

     //operaciones
     suma= n2*n3;
     perimetro= (suma)*2;

     //salida
    System.out.print("El resultado del perimetro de "+nombre+"es"+ perimetro);
    System.out.print("El resultado del area de "+nombre+"es"+ suma);


}
}
