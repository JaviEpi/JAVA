import java.util.Scanner;

/**
 * Ej04NumeroPares
 */
public class Ej04NumeroPares {

    
public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int numero;
    int numero_1;
    int numero_2;

    System.out.print("Introduce el número 1: ");
    numero_1 = s.nextInt();
    System.out.print("Introduce el número 2: ");
    numero_2 = s.nextInt();
    
    if (numero_1%2==1) {
        numero_1++;
    }
    
    
    for (numero=numero_1; numero<=numero_2; numero+=2) {
        System.out.print(numero +" ");
    }

    s.close();
}
}