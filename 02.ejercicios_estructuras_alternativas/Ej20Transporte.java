import java.util.Scanner;

/**
 * Ej20Transporte: Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América Central, América del Sur, Europa y Asia. El costo por el servicio de transporte se basa en el peso del paquete y la zona a la que va dirigido. Lo anterior se muestra en la tabla:
    ZONA	UBICACIÓN	COSTO/GRAMO
      1	América del Norte	24.00 euros
      2	América Central	20.00 euros
      3	América del Sur	21.00 euros
      4	Europa	10.00 euros
      5	Asia	18.00 euros
Parte de su política implica que los paquetes con un peso superior a 5 kg no son transportados, esto por cuestiones de logística y de seguridad. 
Realice un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.
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