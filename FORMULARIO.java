
/**
 * Write a description of class FORMULARIO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class FORMULARIO {
    static void iniciarPrograma() {
        String caso1, escuela, clave, nombrecompleto, turno, telefono, correo, fecha, nombres, narracion, aspecto, dato;
        String reportaje, s;

        int caso, esAnonimo;

        Scanner entrada = new Scanner(System.in); // creando un objeto la scanner para la entrada de datos
        System.out.println("REPORTE DE CASOS DE ITS   ");
        System.out.println("OBJETIVO GENERAL");
        System.out.println(
                "Proporcionar elementos para la elaboración de Protocolos para la prevención, detección y actuación en ");
        System.out.println(
                "casos de abuso sexual, acoso escolar y maltrato en nuestra escuela, con la finalidad de salvaguardar la ");
        System.out.println("integridad de los alumnos. ");
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
            System.out.println("Describa su caso:");
            caso1 = entrada.nextLine();

            System.out.println("Nombre de la escuela:");
            escuela = entrada.nextLine();

            System.out.println("Fecha del acontecimiento:");
            fecha = entrada.nextLine();

            System.out.println("Nombre de la(s) persona(s) involucradas y de quién(es)pone en conocimiento el caso:");
            nombres = entrada.nextLine();

            System.out.println("Narra la conducta del adulto, en su caso:");
            narracion = entrada.nextLine();

            System.out.println("Describir el aspecto general:");
            aspecto = entrada.nextLine();

            System.out.println("Si desea agregar algun otro dato:");
            dato = entrada.nextLine();

            System.out.println("TUS DATOS QUEDARON REGISTRADOS DE LA SIGUIENTE MANERA");
            System.out.println(" " + caso1);
            System.out.println(" " + escuela);
            System.out.println(" " + fecha);
            System.out.println(" " + nombres);
            System.out.println(" " + narracion);
            System.out.println(" " + aspecto);
            System.out.println("" + dato);

        } else if (esAnonimo == 2) {
            System.out.println(" Su reporte NO sera anonimo");
            System.out.println("Nombre completo:");
            nombrecompleto = entrada.nextLine();

            System.out.println("Introduzca su clave/numero de control:");
            clave = entrada.nextLine();

            System.out.println("Correo electronico:");
            correo = entrada.nextLine();

            System.out.println("Turno");
            turno = entrada.nextLine();

            System.out.println("Telefono");
            telefono = entrada.nextLine();

            System.out.println("Describa su caso:");
            caso1 = entrada.nextLine();

            System.out.println("Nombre de la escuela:");
            escuela = entrada.nextLine();

            System.out.println("Fecha del acontecimiento:");
            fecha = entrada.nextLine();

            System.out.println("Nombre de la(s) persona(s) involucradas y de quién(es)pone en conocimiento el caso:");
            nombres = entrada.nextLine();

            System.out.println("Narra la conducta del adulto, en su caso:");
            narracion = entrada.nextLine();

            System.out.println("Describir el aspecto general:");
            aspecto = entrada.nextLine();

            System.out.println("Si desea agregar algun otro dato:");
            dato = entrada.nextLine();

            System.out.println("TUS DATOS QUEDARON REGISTRADOS DE LA SIGUIENTE MANERA");
            System.out.println(" " + caso1);
            System.out.println(" " + escuela);
            System.out.println(" " + clave);
            System.out.println(" " + nombrecompleto);
            System.out.println(" " + turno);
            System.out.println(" " + telefono);
            System.out.println(" " + correo);
            System.out.println(" " + fecha);
            System.out.println(" " + nombres);
            System.out.println(" " + narracion);
            System.out.println(" " + aspecto);
            System.out.println("" + dato);

        } else {
            System.out.println(esAnonimo + " es una opcion incorrecta.");
        }
        // siguiente paso despues de formulario de anonimidad

        System.out.println(
                "Se comunicara por escrito y digital a su autoridad inmediata superior sobre la denuncia o detección realizada");
        System.out.println("Quedara tambien redactado en un Acta de Hechos que será elaborada");
        System.out.println("por personal de la dirección y en colaboración con quien ha referido el caso");
        System.out.println("ante la percepción de indicadores de riesgo.");
        reportaje = entrada.nextLine();
    }

    public static void main(String[] args) {
        iniciarPrograma();
    }
}
