/**
 * Ej04Calculos: Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.
 */
import java.util.Scanner;

public class Ej04Calculos {

public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    double numero_1;
    double numero_2;

    System.out.print("Introduce el número 1: ");
    numero_1 = s.nextDouble();
    System.out.print("Introduce el número 2: ");
    numero_2 = s.nextDouble();

    System.out.println("La suma es "+(numero_1+numero_2));
    System.out.println("La resta es "+(numero_1-numero_2));
    System.out.println("La multiplicación es "+(numero_1*numero_2));
    System.out.println("La división es "+(numero_1/numero_2)); 

    s.close();
}
 
}