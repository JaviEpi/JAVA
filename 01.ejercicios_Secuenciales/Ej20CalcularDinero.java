import java.util.Scanner;

/**
 * Ej20CalcularDinero
 */
public class Ej20CalcularDinero {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int euros_2;
    int euros_1;
    int centimos_50;
    int centimos_20;
    int centimos_10;
    int total_euros;
    int total_centimos;

    System.out.print("Monedas de 2 €: ");
    euros_2 = s.nextInt();
    System.out.print("Monedas de 1 €: ");
    euros_1 = s.nextInt();
    System.out.print("Monedas de 50 cent: ");
    centimos_50 = s.nextInt();
    System.out.print("Monedas de 20 cent: ");
    centimos_20 = s.nextInt();
    System.out.print("Monedas de 10 cent: ");
    centimos_10 = s.nextInt();

    total_euros = euros_2*2 + euros_1;
    total_centimos = centimos_50*50+centimos_20*20+centimos_10*10;

    total_euros = total_euros+(total_centimos/100);
    total_centimos = total_centimos%100;

    System.out.println(total_euros+" Euros "+total_centimos+" centimos");
    
    s.close();
}
}