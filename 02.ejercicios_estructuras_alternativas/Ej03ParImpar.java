import java.util.Scanner;

/**
 * Ej03ParImpar: Escribe un programa que lea un número e indique si es par o impar.
 */
public class Ej03ParImpar {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero;

    System.out.print("Valor de un número: ");
    numero = s.nextInt();

    if (numero%2 == 0){
        System.out.println("El número "+numero+" es par");
    }  else{
        System.out.println("El número "+numero+" es impar");
    }
    
    s.close();
}
}