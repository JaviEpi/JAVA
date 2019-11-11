import java.util.Scanner;

/**
 * Ej16Telefono: La política de cobro de una compañía telefónica es: cuando se realiza una llamada, el cobro es por el tiempo que ésta dura, de tal forma que los primeros cinco minutos cuestan 1 euro, los siguientes tres, 80 céntimos, los siguientes dos minutos, 70 céntimos, y a partir del décimo minuto, 50 céntimos. Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno de mañana, 15 %, y en turno de tarde, 10 %. Realice un algoritmo para determinar cuánto debe pagar por cada concepto una persona que realiza una llamada.
 */
public class Ej16Telefono {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        double coste; // centimos
        String domingo;
        int tiempo;
        String turno="";
    
        // Pedimos datos
        System.out.print("¿Cuánto tiempo es la llamada?: ");
        tiempo = s.nextInt(); s.nextLine(); // Metemos excepcionalmente dos instrucciones en la misma línea
        System.out.print("¿Es Domingo? (S/N): ");
        domingo = s.nextLine();
        if (domingo.toUpperCase().equals("N")) {
          System.out.print("¿Qué turno: Mañana o Tarde? (M/T)?: ");
          turno = s.nextLine();
        }
    
        // Proceso
        if (tiempo<=5) {
          coste = tiempo*100;
        } else if (tiempo<=8) {
          coste = (tiempo-5)*80+500;
        } else if (tiempo<=10) {
          coste = (tiempo-8)*70+240+500;
        } else {
          coste = (tiempo-10)*50+140+240+500;
        }
        // impuestos
        if (domingo.toUpperCase().equals("S")) {
          coste += coste*0.03;
        } else if (turno.toUpperCase().equals("M")) {
          coste += coste*0.15;
        } else {
          coste += coste*0.10;
        }
        System.out.println("El coste de la llamada: "+coste/100+" euros.");

        s.close();
      }  
}