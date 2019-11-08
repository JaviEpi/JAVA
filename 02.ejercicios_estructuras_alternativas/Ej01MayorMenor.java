import java.util.Scanner;

/**
 * Ej01MayorMenor: Algoritmo que pida dos números e indique si el primero es mayor que el segundo o no.
 */
public class Ej01MayorMenor {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero_1;
    int numero_2;

    System.out.print("Valor del primer número: ");
    numero_1 = s.nextInt();
    System.out.print("Valor del segundo número: ");
    numero_2 = s.nextInt();

    if (numero_1>numero_2){
        System.out.println("El primer número "+numero_1+" es mayor que el segundo "+numero_2);
    }  else{
        System.out.println("El primer número "+numero_1+" es menor que el segundo "+numero_2);
    }

    s.close();
}    
}