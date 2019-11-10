import java.util.Scanner;

/**
 * Ej19DiaMes
 */
public class Ej19DiaMes {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int mes;
    
        // Pedimos el mes
        System.out.print("Introduce el número de mes (1-12): ");
        mes = s.nextInt();
    
        switch (mes) {
          case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            System.out.println("31 días");
            break;
          case 2:
            System.out.println("28 o 29 días");
            break;
          case 4: case 6: case 9: case 11:
            System.out.println("30 días");
            break;
          default:
            System.out.println("Mes incorrecto");
        }

        s.close();
    }
}