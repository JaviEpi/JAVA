import java.util.Scanner;

/**
 * Ej20Transporte
 */
public class Ej20Transporte {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int peso;
        int zona;
        
        //Pedimos los datos necesarios
        System.out.print("¿Qué peso tiene el paquete (en gramos)?: ");
        peso = s.nextInt();
    
       
        if (peso>0 && peso<=5000) {
          System.out.println("1.- América del Norte");
          System.out.println("2.- América Central");
          System.out.println("3.- América del Sur");
          System.out.println("4.- Europa");
          System.out.println("5.- Asia");
          System.out.print("A que zona se reparte (1-5): ");
          zona = s.nextInt();
          switch (zona) {
            case 1:
              System.out.println("Coste: "+peso*24+" euros.");
              break;
            case 2:
              System.out.println("Coste: "+peso*20+" euros.");
              break;
            case 3:
              System.out.println("Coste: "+peso*21+" euros.");
              break;
            case 4:
              System.out.println("Coste: "+peso*10+" euros.");
              break;
            case 5:
              System.out.println("Coste: "+peso*18+" euros.");
              break;
            default:
              System.out.println("Zona incorrecta.");
          }
        } else {
          System.out.println("Peso incorrecto (no podemos transportar paquetes de más de 5Kg).");
        }

        s.close();
    }
}