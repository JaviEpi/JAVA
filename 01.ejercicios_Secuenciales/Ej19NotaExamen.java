import java.util.Scanner;

/**
 * Ej19NotaExamen
 */
public class Ej19NotaExamen {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int total_preguntas;
    int correctas;
    int incorrectas;
    int puntos;

    System.out.print("Total de preguntas: ");
    total_preguntas = s.nextInt();
    System.out.print("Total de aciertos: ");
    correctas = s.nextInt();
    System.out.print("Total de errores: ");
    incorrectas = s.nextInt();

    total_preguntas = total_preguntas *5;
    puntos = correctas*5+incorrectas*(-1);
    System.out.println("Tu nota es "+puntos+"/ "+total_preguntas);

    s.close();
}
}