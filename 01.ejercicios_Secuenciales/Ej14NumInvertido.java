import java.util.Scanner;

/**
 * Ej14NumInvertido: Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número invertido.


 */
public class Ej14NumInvertido {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero;
    int decenas;
    int unidades;

    System.out.print("Número de dos cifras: ");
    numero = s.nextInt();

    decenas = numero/10;
    unidades = numero%10;
    
    System.out.println("El número invertido es "+(10*unidades+decenas));
    
    s.close();
}
}