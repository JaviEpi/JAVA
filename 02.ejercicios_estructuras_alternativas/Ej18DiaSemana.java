import java.util.Scanner;

/**
 * Ej18DiaSemana:Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si introducimos otro número nos da un error.
 */
public class Ej18DiaSemana {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int dia;
    
        // Pedimos los datos que necesitamos
        System.out.print("Dime un día de la semana (1-7): ");
        dia = s.nextInt();
    
        switch (dia) {
          case 1:
            System.out.println("Lunes");
            break;
          case 2:
            System.out.println("Martes");
            break;
          case 3:
            System.out.println("Miércoles");
            break;
          case 4:
            System.out.println("Jueves");
            break;
          case 5:
            System.out.println("Viernes");
            break;
          case 6:
            System.out.println("Sábado");
            break;
          case 7:
            System.out.println("Domingo");
            break;
          default:
            System.out.println("Día incorrecto");
        }

        s.close();
    }
    
}