import java.util.Scanner;

/**
 * Ej15Autobus
 */
public class Ej15Autobus {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int coste_autobus;
    double coste_alumno=0;
    int numero_alumnos;
    
    // Pedimos datos
    System.out.print("¿Cuántos alumnos participan en la actividad?: ");
    numero_alumnos = s.nextInt();
    
    // Proceso
    if (numero_alumnos>=100) {
        coste_alumno = 65;
    }
    else if (numero_alumnos>=50) {
        coste_alumno = 70;
    }
    else if (numero_alumnos>=30) {
        coste_alumno = 95;
    }
    else if (numero_alumnos>0) {
        coste_alumno = 4000.0/numero_alumnos;
    }
    if (numero_alumnos>0) {
        coste_autobus = (int) (numero_alumnos*coste_alumno);
        System.out.println("El coste por alumno es "+coste_alumno+" euros.");
        System.out.println("El coste del autobús es "+coste_autobus+" euros.");
        } else {
        System.out.println("El número de alumnos debe ser un valor positivo.");
    }
    s.close();
}
}