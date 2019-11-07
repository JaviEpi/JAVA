import java.util.Scanner;

/**
 * Ej16Adelantamiento: Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados por una distancia d. El que está detrás viaja a una velocidad mayor. Se pide hacer un algoritmo para ingresar la distancia entre los dos vehículos (km) y sus respectivas velocidades (km/h) y con esto determinar y mostrar en que tiempo (minutos) alcanzará el vehículo más rápido al otro.
 */
public class Ej16Adelantamiento {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double distancia;
    double tiempo;
    double v1;
    double v2;

    System.out.print("Velocidad del primer vehículo (km/h): ");
    v1 = s.nextDouble();
    System.out.print("Velocidad del segundo vehículo (más pequeña) (km/h): ");
    v2 = s.nextDouble();
    System.out.print("Distancia que recorren los vehículos (km): ");
    distancia = s.nextDouble();

    tiempo = distancia/(v1-v2);
    tiempo = tiempo*60;

    System.out.println("Lo alcanza en "+tiempo+" minutos");
    
    s.close();
}
}