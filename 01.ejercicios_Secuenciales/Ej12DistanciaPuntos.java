import java.util.Scanner;

/**
 * Ej12DistanciaPuntos: Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en el plano. Calcula y muestra la distancia entre ellos.
 */
public class Ej12DistanciaPuntos {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double distancia;
    int x1;
    int x2;
    int y1;
    int y2;
    
    System.out.println("Dime las coordenadas del primer punto: ");
    x1 = s.nextInt();
    y1 = s.nextInt();
    System.out.println("Dime las coordenadas del segundo punto: ");
    x2 = s.nextInt();
    y2 = s.nextInt();

    distancia = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

    System.out.println("La distancia entre los dos puntos es: " +distancia);
    
    s.close();
    
}
}