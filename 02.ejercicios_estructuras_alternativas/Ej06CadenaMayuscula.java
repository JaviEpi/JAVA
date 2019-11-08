import java.util.Scanner;

/**
 * Ej06CadenaMayuscula: Programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
 */
public class Ej06CadenaMayuscula {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String cadena;

    System.out.print("introduce una cadena: ");
    cadena = s.nextLine();

    if (cadena.length()==1 && (cadena.compareTo("A")>=0 && cadena.compareTo("Z")<=0)){
        System.out.println("La cadena es una letra mayúscula. ");
    }  else{
        System.out.println("La cadena es una letra minúscula. ");
    }
    
    
    
    s.close();
}
    
}