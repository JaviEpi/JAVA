import java.util.Scanner;

/**
 * Ej15IntercambioVariables
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