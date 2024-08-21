/*
 * Integrantes: José María Hernández Pérez
 *              Aldo Enrique Yañez Ramirez
 */
import java.util.Scanner;
public class Ejercicio02{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Introduce un entero a: ");
    int a = in.nextInt();
    System.out.print("Introduce un entero b: ");
    int b = in.nextInt();
    System.out.print("Introduce un entero c: ");
    int c = in.nextInt();
    if (c<b && c<a){
        System.out.print("IZQUIERDA");
    } else if (c>b && c>a){
        System.out.print("DERECHA");
    } else {
        System.out.print("INTERVALO");
    }
}
}