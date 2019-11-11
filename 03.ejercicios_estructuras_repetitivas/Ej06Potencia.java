import java.util.Scanner;

/**
 * Ej06Potencia: Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el operador de potencia.
 */
public class Ej06Potencia {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double base;
    int exponente;
    double potencia;

    System.out.print("Dame la base de la potencia: ");
    base = s.nextDouble();
    do {
      System.out.print("Dame el exponente de la potencia: ");
      exponente = s.nextInt();
      if (exponente<0) {
        System.out.println("ERROR: El exponente debe ser positivo");
      }
    } while (exponente<0);

    potencia = 1;
    for (int i=1;i<=exponente;i++) {
      potencia *= base;
    }
    System.out.println("Potencia: "+potencia);

    s.close();
}
}

