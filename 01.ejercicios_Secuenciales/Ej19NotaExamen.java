import java.util.Scanner;

/**
 * Ej19NotaExamen: Escribir un algoritmo para calcular la nota final de un estudiante, considerando que por cada respuesta correcta 5 puntos, por una incorrecta -1 y por respuestas en blanco 0. Imprime el resultado obtenido por el estudiante.
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