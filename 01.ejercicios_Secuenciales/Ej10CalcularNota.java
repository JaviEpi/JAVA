import java.util.Scanner;

/**
 * Ej10CalcularNota: Un alumno desea saber cual será su calificación final en la materia de Algoritmos. Dicha calificación se compone de los siguientes porcentajes:
    55% del promedio de sus tres calificaciones parciales.
    30% de la calificación del examen final.
    15% de la calificación de un trabajo final.
 */
public class Ej10CalcularNota {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double parcial_1;
    double parcial_2;
    double parcial_3;
    double media_parciales;
    double examen_final;
    double trabajo_final;
    double nota_final;

    System.out.print("Nota del primer parcial: ");
    parcial_1 = s.nextDouble();
    System.out.print("Nota del segundo parcial: ");
    parcial_2 = s.nextDouble();
    System.out.print("Nota del tercer parcial: ");
    parcial_3 = s.nextDouble();
    media_parciales = (parcial_1+parcial_2+parcial_3)/3;

    System.out.print("Nota examen final: ");
    examen_final = s.nextDouble();
    System.out.print("Nora del trabajo final: ");
    trabajo_final = s.nextDouble();

    nota_final = ((media_parciales*0.55)+(examen_final*0.3)+(trabajo_final*0.15));
    System.out.println("La nota final es "+nota_final);


    s.close();
}
}