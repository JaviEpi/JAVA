/**
 * 01NombreSaludo
 */
import java.util.Scanner;

public class Ej01NombreSaludo {
public static void main(String args[]) {
    Scanner s  = new Scanner(System.in);
    String nombre;
    System.out.println("Dime tu nombre: ");
    nombre = s.nextLine();
    System.out.println("Hola "+nombre);
    
}
    
}