import java.util.Scanner;

/**
 * Ej17Ciclista: Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos. El tiempo de viaje hasta llegar a otra ciudad B es de T segundos. Escribir un algoritmo que determine la hora de llegada a la ciudad B.
 */
public class Ej17Ciclista {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int hora_llegada;
    int hora_partida;
    int minutos_llegada;
    int minutos_partida;
    int segundos_llegada;
    int segundos_partida;
    int segundos_final;
    int segundos_inicial;
    int segundos_viaje;

    System.out.print("Hora de salida: ");
    hora_partida = s.nextInt();
    System.out.print("Minutos de salida: ");
    minutos_partida = s.nextInt();
    System.out.print("Segundos de salida: ");
    segundos_partida = s.nextInt();
    System.out.print("Tiempo que has tardado en segundos: ");
    segundos_viaje = s.nextInt();

    segundos_inicial = hora_partida*3600+minutos_partida*60+segundos_partida;
    segundos_final = segundos_inicial+segundos_viaje;
    hora_llegada = segundos_final/3600;
    minutos_llegada = (segundos_final%3600)/60;
    segundos_llegada = (segundos_final%3600)%60;

    System.out.print("Hora de llegada ");
    System.out.println(hora_llegada+":"+minutos_llegada+":"+segundos_llegada);
    
    s.close();
}
}