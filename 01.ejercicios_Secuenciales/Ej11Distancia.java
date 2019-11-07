import java.util.Scanner;

/**
 * Ej11Distancia:  Pide al usuario dos números y muestra la "distancia" entre ellos (el valor absoluto de su diferencia, de modo que el resultado sea siempre positivo).
 */
public class Ej11Distancia {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero_1;
    int numero_2;

    System.out.print("Valor del primer número: ");
    numero_1 = s.nextInt();
    System.out.print("Valor del segundo número: ");
    numero_2 = s.nextInt();
    
    System.out.println("La distancia es: " +Math.abs(numero_1-numero_2));
    
    s.close();
}

    
}