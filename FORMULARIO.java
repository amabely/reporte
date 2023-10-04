
/**
 * Write a description of class FORMULARIO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class FORMULARIO
{
         public static void main(String[] args){ 
             String primerapellido,segundoapellido,nombres, domicilio, curp; 
             
             Scanner entrada=new Scanner (System.in); // creando un objeto la scanner para la entrada de datos
       System.out.println("REPORTE DE CASOS DE ITS   ");
       System.out.println("OBJETIVO GENERAL");
       System.out.println("Proporcionar elementos para la elaboración de Protocolos para la prevención, detección y actuación en casos de abuso sexual, acoso escolar y maltrato en nuestra escuela, con la finalidad de salvaguardar la integridad de los alumnos.   ");
      entrada.nextLine();
      
                             int i = 2;
                switch(respuesta) {
      case "anonimo":
      opcion=1; 
      System.out.println("Seleccionaste ser anonimo");
      break;
     case "noanonimo":
     opcion=2;
    System.out.println("Seleccionaste NO ser anonimo");
    break;
  
  default:
    System.out.println("Elegir solo entres las dos unicas opciones");
    return;
}
         if (opcion==1){
             System.out.println("Describa el tipo de caso");
             entrada.nextLine();
             anonimo=entrada.nextLine();
             
 
           {
            int caso;
        Scanner teclado = new Scanner(System.in);
       System.out.println("Introduce la opcion segun el caso de reporte");
       System.out.println("1. Acoso escolar");
       System.out.println("2. Abuso");
       System.out.println("3. Maltrato o discriminacion");
       caso=teclado.nextInt();
       if(caso>0)
            System.out.println("Brindaremos la capacitación y asesoría a las Autoridades Educativas Locales necesarias para la elaboración de los Protocolos para la prevención, detección y actuación en tu caso de acoso escolar");
       else
            if(caso<0)
                System.out.println("Brindaremos la capacitación y asesoría a las Autoridades Educativas Locales necesarias para la elaboración de los Protocolos para la prevención, detección y actuación en tu caso de abuso");
            else
                System.out.println("Brindaremos la capacitación y asesoría a las Autoridades Educativas Locales necesarias para la elaboración de los Protocolos para la prevención, detección y actuación en tu caso de maltrato o discriminacion ");
    int num;
       System.out.println("¿Desea mantenerse anonimo?");
       System.out.println("1. Si");
       System.out.println("2. No");
       num=teclado.nextInt();
       if(num>0)
            System.out.println(" Su reporte SI sera anonimo");
          
            
       else
            if(num<0)
                System.out.println(" Su reporte NO sera anonimo");
            else
                System.out.println(num+" es nulo");
                       
                
                

                  
                     
        // creando un objeto la scanner para la entrada de datos
       System.out.println("¿Desea mantenerse anonimo?:         ");
       primerapellido=entrada.nextLine();
     
        System.out.println("Segundo apellido:         ");
       segundoapellido=entrada.nextLine();
     
      System.out.println("Nombres:         ");
       nombres=entrada.nextLine();
   

       System.out.println ("Ingrese su domicilio:             ");
       domicilio=entrada.nextLine();
      
       
       System.out.println ("Ingrese su curp:             ");
       curp=entrada.nextLine();
                
   
   } 
  
    }
}


