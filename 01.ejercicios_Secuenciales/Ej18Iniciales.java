import java.util.Scanner;

/**
 * Ej18Iniciales:  Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales.
 */
public class Ej18Iniciales {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String nombre;
    String primer_apellido;
    String segundo_apellido;
    String iniciales;

    System.out.print("Dime tu nombre: ");
    nombre = s.nextLine();
    System.out.print("Dime tu primer apellido: ");
    primer_apellido = s.nextLine();
    System.out.print("Dime tu segundo apellido: ");
    segundo_apellido = s.nextLine();

    iniciales = nombre.substring(0,1);
    iniciales = iniciales.concat(primer_apellido.substring(0,1));
    iniciales = iniciales.concat(segundo_apellido.substring(0,1));
    iniciales = iniciales.toUpperCase();

    System.out.println("Las iniciales son: "+iniciales);
    s.close();
}
    
}