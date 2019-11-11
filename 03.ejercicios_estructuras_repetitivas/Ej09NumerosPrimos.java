import java.util.Scanner;

/**
 * Ej09NumerosPrimos: Mostrar en pantalla los N primero número primos. Se pide por teclado la cantidad de números primos que queremos mostrar.

 */
public class Ej09NumerosPrimos {

public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int cantidad_primos;
    int primos_mostrados;
    int numero;

    do {
      System.out.print("Ingrese la cantidad de números primos a mostrar: ");
      cantidad_primos = s.nextInt();
    } while (cantidad_primos<=0);

    System.out.println("1: 2");
    primos_mostrados = 1;

    numero = 3;
    while (primos_mostrados < cantidad_primos) {
      boolean esPrimo = true;
      for (int divisor=3; divisor<=Math.sqrt(numero) && esPrimo; divisor+=2) {
        if (numero%divisor==0) {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        primos_mostrados++;
        System.out.println(primos_mostrados+": "+numero);
      }
      numero += 2;
    }

    s.close();

}
}