import java.util.Scanner;

/**
 * LeeNumeros
 */
public class LeeNumeros {

public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("Inserte un número: ");
    int numero_1 = s.nextInt(); s.nextLine();
    System.out.print("Inserte una cadena: ");
    String cadena = s.nextLine();
    System.out.println("Inserte otro número: ");
    int numero_2 = s.nextInt();
    int total = (2*numero_1) + numero_2;

    System.out.println("La cadena introducida es "+cadena);
    System.out.println("El primer número introducido es "+numero_1);
    System.out.println("Y el segundo número es "+numero_2);
    System.out.println("El doble del primer número mas el segundo es ");
    System.out.println(total);
}

}