
/**
 * Write a description of class gali here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

//*Programa que bloquee aplicaciones NO escolares en hora clase*//
 import java.util.Scanner;
 import java.time.LocalDateTime;
 import java.net.URL;
public class EJERCICIO5 {
     public static void main (String []args)
    {//descripcion de variables 
        LocalDateTime locaDate = LocalDateTime.now();
        int hours  = locaDate.getHour();
        int minutes = locaDate.getMinute();
        int seconds = locaDate.getSecond();
        int horaEntrada,horaSalida;
        
         System.out.println("Hora actual : " + hours + ":" + minutes  );
         
         Scanner entrada=new Scanner (System.in);
       System.out.print("Introduce tu hora de entrada :    ");
       horaEntrada=entrada.nextInt()  ;
       
       
       System.out.print("Introduce tu hora de salida:    ");
       horaSalida=entrada.nextInt()  ;
         
        if (horaEntrada <= hours && horaSalida <= hours) {
            System.out.println("¡Puedes usar la aplicación que más te guste!");
            System.out.println("Facebook:https://www.facebook.com/?locale=es_LA" );
            System.out.println("Instagram:https://www.instagram.com/");
            System.out.println("Tik Tok:https://www.tiktok.com/es/");
            System.out.println("Entre otras...");
            
        }
        else {
            System.out.println("¡No puedes usar la aplicación!");
            System.out.println("Puedes usar estas aplicaciones escolares en tu hora clase:");
            System.out.println("Classroom:https://classroom.google.com/" );
            System.out.println("Teams:https://www.microsoft.com/es-mx/microsoft-teams/log-in");
            System.out.println("Google:https://www.google.com.mx/?hl=es ");
            System.out.println("Khan Academy:https://es.khanacademy.org/ ");
            System.out.println("Duolingo:https://es.duolingo.com/ ");
            System.out.println("Entre otras...");
        }
        
        
        
    
    }
}
