import java.util.Scanner;

/**
 * Ej14Uvas
 */
public class Ej14Uvas {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int kilos;
    double precio_inicio;
    double precio_fin;
    String tamaño;
    String tipo;

    // Pedimos los datos que necesitamos
    System.out.print("Precio inicial por kilos de la UVA (centimos): ");
    precio_inicio = s.nextDouble();
    System.out.print("Total kilos vendidos: ");
    kilos = s.nextInt();
    s.nextLine();
    System.out.print("Introduce el tipo de la UVA (A/B): ");
    tipo = s.nextLine();

    if (!tipo.toUpperCase().equals("A") && !tipo.toUpperCase().equals("B")) {
      System.out.println("Tipo incorrecto");
    } else {
      System.out.print("Introduce el tamaño de la UVA (1/2):");
      tamaño = s.nextLine();
      if (!tamaño.equals("1")&!tamaño.equals("2")) {
        System.out.println("Tamaño incorrecto");
      } else {
        if (tipo.toUpperCase().equals("A")) {
          if (tamaño.equals("1")) {
            precio_inicio = precio_inicio+20;
          } else {
            precio_inicio = precio_inicio+30;
          }
        } else {
          if (tamaño.equals("1")) {
            precio_inicio = precio_inicio-20;
          } else {
            precio_inicio = precio_inicio-30;
          }
        }
        precio_fin = precio_inicio*kilos;
        System.out.println("La ganancia es "+precio_fin/100+" euros.");
      }
    }

    s.close();
}
}