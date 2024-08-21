/*
 * Integrantes: José María Hernández Pérez
 *              Aldo Enrique Yañez Ramirez
 */
import java.util.Scanner;
public class Ejercicio01{
    public static void main(String[] args){
         Scanner in = new Scanner(System.in); //creacion del scanner
         System.out.print("Nombre del remitente: "); //asignacion de valores y declaracion de variables
         String remitenteNombre = in.nextLine();
         System.out.print("Profesion del remitente: ");
         String remitenteProfesion = in.nextLine();
         System.out.print("Nombre del destinatario: ");
         String destinatarioNombre = in.nextLine();
         System.out.print("Profesion del destinatario: ");
         String destinatarioProfesion = in.nextLine();
         System.out.print("Mensaje:  ");
         String mensaje = in.nextLine();
         System.out.print("¿Es urgente? 1=Si. 2=No: ");
         int esUrgente = in.nextInt();   
         System.out.print("Direccion del destinatario (Calle numero.ciudad CP): ");
         String direccion = in.nextLine();
         String placeholder = in.nextLine();
         //System.out.print("si jalo");
         System.out.println("\nDe:"); //imprimir primera linea
         remitenteProfesion = remitenteProfesion.substring(0, 3); //cortar la profesion
         String remitente = remitenteProfesion + ". " + remitenteNombre; //concatenar nombre y profesion a un solo string
         remitente = remitente.toUpperCase(); //mayusculas
         System.out.print(remitente);
         destinatarioProfesion = destinatarioProfesion.substring(0, 3); //cortar la profesion
         String destinatario = destinatarioProfesion + ". " + destinatarioNombre; //concatenar nombre y profesion a un solo string
         destinatario = destinatario.toUpperCase(); //mayusculas
         System.out.println("\nPara: "); //imprimir segunda linea
         System.out.print(destinatario);
         int costo = 0; 
         mensaje = "   " + mensaje;
         System.out.print("\n \nMensaje: \n" + mensaje); //imprimir mensaje
         switch (esUrgente){ //evaluar esUrgente y calcular el costo
            case 1:
            costo = mensaje.length() * 4;
            System.out.print("\nEste mensaje es urgente. El costo por caracter es $4");
            break;
            case 2:
            costo = mensaje.length() * 2;
            System.out.print("\nEste mensaje no es urgente. El costo por caracter es $2");
            break;
            default:
            System.out.println("\nERROR: Valor de urgencia invalido. El telegrama no se enviara");
            break;
         }
         System.out.print("\nEl costo es: $" + costo); //imprimir costo
         
         int punto = placeholder.indexOf('.');
         direccion = placeholder.substring(0, punto) + "\n" + placeholder.substring(punto+1);
         System.out.println("\nDireccion:\n"+direccion);
        }
}