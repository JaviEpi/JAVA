/**
 * 01NombreSaludo: Escribir un programa que pregunte al usuario su nombre, y luego lo salude.
 */
import java.util.Scanner;

public class Ej01NombreSaludo {
public static void main(String args[]) {
    Scanner s  = new Scanner(System.in);
    String nombre;
    System.out.println("Dime tu nombre: ");
    nombre = s.nextLine();
    System.out.println("Hola "+nombre);
    
    s.close();
}
    
}