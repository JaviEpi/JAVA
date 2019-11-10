import java.util.Scanner;

/**
 * Ej17Dado
 */
public class Ej17Dado {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int cara;
    
        // Pedimos datos
        System.out.print("Introduce el número de la cara: ");
        cara = s.nextInt();
    
        // Proceso
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