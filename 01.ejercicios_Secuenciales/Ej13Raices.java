import java.util.Scanner;

/**
 * Ej13Raices: Realizar un algoritmos que lea un número y que muestre su raíz cuadrada y su raíz cúbica. PSeInt no tiene ninguna función predefinida que permita calcular la raíz cúbica, ¿cómo se puede calcular?


 */
public class Ej13Raices {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero;

    System.out.print("Valor del número: ");
    numero = s.nextInt();
     
    System.out.println("Raíz cuadrada: " +Math.sqrt(numero));
    System.out.println("Raíz cúbica: " +Math.pow(numero,(double)1/3));
    
    s.close();
}
}