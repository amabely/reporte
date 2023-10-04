
/**
 * Write a description of class EJERCICIO3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class EJERCICIO3

{
   public static void main (String[]args)
   {//descripcion de variables
     int codigopostal, fecha,domicilio2, añoderegistro;
     String primerapellido,segundoapellido,nombres, domicilio, curp; 

     
     
      Scanner entrada=new Scanner (System.in); // creando un objeto la scanner para la entrada de datos
       System.out.println("¿Desea mantenerse anonimo?:         ");
       primerapellido=entrada.nextLine();
     
        System.out.println("Segundo apellido:         ");
       segundoapellido=entrada.nextLine();
     
      System.out.println("Nombres:         ");
       nombres=entrada.nextLine();
     
       
       System.out.println ("Ingrese su fecha de nacimiento:             ");
       fecha=entrada.nextInt();
       entrada.nextLine();
       
       System.out.println ("Ingrese su codigo postal:             ");
       codigopostal=entrada.nextInt();
       entrada.nextLine();

       System.out.println ("Ingrese su domicilio:             ");
       domicilio=entrada.nextLine();
      
       System.out.println ("Ingrese numero de su domicilio:             ");
       domicilio2=entrada.nextInt();
         entrada.nextLine();
      
       System.out.println ("Ingrese su curp:             ");
       curp=entrada.nextLine();
      
    System.out.println ("Año de registro:             ");
      añoderegistro=entrada.nextInt();
      entrada.nextLine();
   

     //salida
      System.out.println("TUS DATOS SON LOS SIGUIENTES");
      System.out.println("NOMBRE ");
      System.out.println(""+primerapellido+" "+segundoapellido+" "+nombres);
      System.out.println("FECHA DE NACIMIENTO");
      System.out.println(""+fecha);
      System.out.println("C.P");
      System.out.println(""+codigopostal);
      System.out.println("DOMICILIO");
      System.out.println(""+domicilio+ " "+domicilio2);
      System.out.println("CURP");
      System.out.println(""+curp);
      System.out.println("VIGENCIA");
      System.out.println("2022-2032");
       System.out.println("AÑO DE REGISTRO");
         System.out.println(""+añoderegistro);

}
}
 

