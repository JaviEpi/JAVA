import java.util.Scanner;

/**
 * Ej03Vocales
 */
public class Ej03Vocales {

public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    String caracter;
    
    do {
        System.out.print("Introduce un carácter: ");
        caracter = s.nextLine();
    } while (caracter.length()!=1);
    
    while (!caracter.equals(" ")) {
    if (caracter.toUpperCase().equals("A") || caracter.toUpperCase().equals("E") || caracter.toUpperCase().equals("I") || caracter.toUpperCase().equals("O") || caracter.toUpperCase().equals("U")) {
    System.out.println("VOCAL");
    } else {
        System.out.println("NO VOCAL");
    
    do {
        System.out.print("Introduce un carácter: ");
        caracter = s.nextLine();
    } while (caracter.length()!=1);
    }
    
    s.close();
}

}