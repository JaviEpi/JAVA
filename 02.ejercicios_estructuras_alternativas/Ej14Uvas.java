import java.util.Scanner;

/**
 * Ej14Uvas: La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la venta del producto, ésta es de un solo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque, considerando lo siguiente: si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de tamaño 2. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2. Realice un algoritmo para determinar la ganancia obtenida.
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