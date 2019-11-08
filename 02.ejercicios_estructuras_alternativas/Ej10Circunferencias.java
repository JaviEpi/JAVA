import java.util.Scanner;

/**
 * Ej10Circunferencias: Algoritmo que pida los puntos centrales x1,y1,x2,y2 y los radios r1,r2 de dos 
circunferencias y las clasifique en uno de estos estados:
    exteriores
    tangentes exteriores
    secantes
    tangentes interiores
    interiores
    concéntricas
 */
public class Ej10Circunferencias {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        double distancia;
        double r1;
        double r2;
        double x1;
        double x2;
        double y1;
        double y2;
    
        System.out.print("Dime coordenada x primera circunferencia: ");
        x1 = s.nextDouble();
        System.out.print("Dime coordenada y primera circunferencia: ");
        y1 = s.nextDouble();
        System.out.print("Dime radio primera circunferencia: ");
        r1 = s.nextDouble();
        System.out.print("Dime coordenada x segunda circunferencia: ");
        x2 = s.nextDouble();
        System.out.print("Dime coordenada y segunda circunferencia: ");
        y2 = s.nextDouble();
        System.out.print("Dime radio segunda circunferencia: ");
        r2 = s.nextDouble();
    
       
        distancia = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        if (distancia>(r1+r2)) {
          System.out.println("Circunferencias exteriores");
        }
        if (distancia==(r1+r2)) {
          System.out.println("Circunferencias tangentes exteriores");
        }
        if (distancia<(r1+r2) && distancia>Math.abs(r1-r2)) {
          System.out.println("Circunferencias secantes");
        }
        if (distancia==Math.abs(r1-r2)) {
          System.out.println("Circunferencias tangentes interiores");
        }
        if (distancia>0 && distancia<Math.abs(r1-r2)) {
          System.out.println("Circunferencias interiores");
        }
        if (distancia==0) {
          System.out.println("Circunferencias concétricas");
        }

        s.close();
    
}
    
}