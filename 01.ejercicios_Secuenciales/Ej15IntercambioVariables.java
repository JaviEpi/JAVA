import java.util.Scanner;

/**
 * Ej15IntercambioVariables:  Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide realizar un algoritmo que intercambie los valores de ambas variables y muestre cuanto valen al final las dos variables.
 */
public class Ej15IntercambioVariables {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a;
    int b;
    int auxiliar;

    System.out.print("Valor de A: ");
    a = s.nextInt();
    System.out.print("Valor de B ");
    b = s.nextInt();
    
    auxiliar = a;
    a = b;
    b = auxiliar;

    System.out.println("El valor de A es: " +a);
    System.out.println("El valor de B es: " +b);

    s.close();
}
}