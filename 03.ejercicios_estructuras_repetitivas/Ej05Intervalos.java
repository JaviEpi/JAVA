import java.util.Scanner;

/**
 * Ej05Intervalos
 */
public class Ej05Intervalos {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int contador_intervalo = 0;
    boolean igual_limites = false;
    int limite_inferior;
    int limite_superior;
    int numero;
    int suma_intervalo = 0;

    do {
      System.out.print("Introduce el límite inferior del intervalo: ");
      limite_inferior = s.nextInt();
      System.out.print("Introduce el límite superior del intervalo: ");
      limite_superior = s.nextInt();
      if (limite_inferior>limite_superior) {
        System.out.println("ERROR: El límite inferior debe ser menor que el superior.");
      }
    } while (limite_inferior>limite_superior);

    System.out.print("Introduce un número (0, para salir): ");
    numero = s.nextInt();
    while (numero!=0) {
      if (numero>limite_inferior && numero<limite_superior) {
        suma_intervalo += numero;
      } else {
        contador_intervalo++;
      }

      if (numero==limite_inferior || numero==limite_superior) {
        igual_limites = true;
      }
      System.out.print("Introduce un número (0, para salir): ");
      numero = s.nextInt();
    }

    System.out.println("La suma de los número dentro del intervalo es " + suma_intervalo);
    System.out.println("La cantidad de números fuera del intervalo es " + contador_intervalo);
    if (igual_limites) {
      System.out.println("Se ha introducido algún número igual a los límites del intervalo.");
    } else {
      System.out.println("No se ha introducido ningún número igual a los límites del intervalo.");
    }

    s.close();
}
}