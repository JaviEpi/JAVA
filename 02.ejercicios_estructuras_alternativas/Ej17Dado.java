import java.util.Scanner;

/**
 * Ej17Dado: Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
  Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
  Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: “ERROR: número incorrecto.”.
 */
public class Ej17Dado {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int cara;
    
        // Pedimos datos
        System.out.print("Introduce el número de la cara: ");
        cara = s.nextInt();
    
        
        switch (cara) {
          case 1:
            System.out.println("SEIS");
            break;
          case 2:
            System.out.println("CINCO");
            break;
          case 3:
            System.out.println("CUATRO");
            break;
          case 4:
            System.out.println("TRES");
            break;
          case 5:
            System.out.println("DOS");
            break;
          case 6:
            System.out.println("UNO");
            break;
          default:
            System.out.println("Error: número incorrecto.");
        }

        s.close();
      }
    
}