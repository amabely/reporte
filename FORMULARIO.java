
/**
 * Write a description of class FORMULARIO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class FORMULARIO {
    public static void main(String[] args) {
        String primerapellido, segundoapellido, nombres, domicilio, curp;
        int caso, esAnonimo;
        Scanner entrada = new Scanner(System.in); // creando un objeto la scanner para la entrada de datos
        System.out.println("REPORTE DE CASOS DE ITS   ");
        System.out.println("OBJETIVO GENERAL");
        System.out.println(
                "Proporcionar elementos para la elaboración de Protocolos para la prevención, detección y actuación en casos de abuso sexual, acoso escolar y maltrato en nuestra escuela, con la finalidad de salvaguardar la integridad de los alumnos.   ");
        entrada.nextLine();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la opcion segun el caso de reporte");
        System.out.println("1. Acoso escolar");
        System.out.println("2. Abuso");
        System.out.println("3. Maltrato o discriminacion");
        caso = teclado.nextInt();
        String texto = "Brindaremos la capacitación y asesoría a las Autoridades Educativas Locales necesarias para la elaboración de los Protocolos para la prevención, detección y actuación en tu caso de";
        String complemento = "";
        switch (caso) {
            case 1:
                complemento = "acoso escolar";
                break;
            case 2:
                complemento = "abuso";
                break;
            case 3:
                complemento = "maltrato o discriminacion";
                break;
            default:
                // Default secuencia de sentencias.
        }

        System.out.println(texto + " " + complemento);
        System.out.println("¿Desea mantenerse anonimo?");
        System.out.println("1. Si");
        System.out.println("2. No");
        esAnonimo = teclado.nextInt();

        if (esAnonimo == 1) {
            System.out.println(" Su reporte SI sera anonimo");
            System.out.println("¿Desea mantenerse anonimo?:");
            primerapellido = entrada.nextLine();

            System.out.println("Segundo apellido:");
            segundoapellido = entrada.nextLine();

            System.out.println("Nombres:");
            nombres = entrada.nextLine();

            System.out.println("Ingrese su domicilio:");
            domicilio = entrada.nextLine();

            System.out.println("Ingrese su curp:");
            curp = entrada.nextLine();
        } else if (esAnonimo == 2) {
            System.out.println(" Su reporte NO sera anonimo");
        } else {
            System.out.println(esAnonimo + " es una opcion incorrecta.");
        }
        // siguiente paso despues de formulario de anonimidad
    }
}