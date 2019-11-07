import java.util.Scanner;

/**
 * Ej06Media
 */
public class Ej06Media {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double numero_1;
    double numero_2;
    double numero_3;
    double media;

    System.out.println("Valor número 1: ");
    numero_1 = s.nextDouble();
    System.out.println("Valor número 2: ");
    numero_2 = s.nextDouble();
    System.out.println("Valor número 3: ");
    numero_3 = s.nextDouble();

    media = (numero_1+numero_2+numero_3)/3;
    System.out.println("La media de los tres números es "+media);

    s.close();
}
}