import java.util.Scanner;

/**
 * varianza1: Calcular máximo, mínimo, media y varianza de 10 notas introducidas por el usuario.
 * 
 * Media    = sumatorio notas / total de notas
 * Varianza = sumatorio de la diferencia de cada nota menos la media al cuadrado / total notas
 * 
 * Variables:
 *  nota: calificación introducida por el usuario
 *  mámimo y mínimo
 *  media
 *  varianza
 *  suma_notas: sumatorio de las notas
 *  i: contador ciclo
 * 
 * Algoritmo:
 * ---------- 
 * suma_notas <-- 0
 * máximo <-- 0
 * mínimo <-- 10
 * PARA i DESDE 1 HASTA 10
 *   LEER nota
 *   SI nota > máximo ENTOCES
 *      máximo <-- nota
 *   FIN-SI
 *      SI nota < mínimo
 *   FIN-SI 
 *      suma_notas <-- suma_notas + notas
 * FIN PARA
 * media <-- suma_notas/10
 * ESCRIBIR media
 * 
 * 
 */


public class varianza1 {

static final int numero_notas = 10;

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int i;
    double nota;
    double suma_notas = 0;
    double media;
    double maximo = 0;
    double minimo = 10;

    for (i=1; i<=numero_notas; i++){
        // Pedir nota entre 0 y 10
        System.out.print("Dame la nota número " + i +": ");
        nota = s.nextDouble();
        while (nota < 0 || nota > 10){
            System.out.print("Me has dado una nota errónea, vuelve a introducirla: ");
            nota = s.nextDouble();
        }
        // Actualizar los datos intermedios: máximo, mínimo y media.
        if (nota > maximo){
            maximo = nota;
        }
        if (nota < minimo){
            minimo = nota;
        }
        suma_notas += nota;

    }

    media = suma_notas/numero_notas;
    // Mostramos los resultados
    System.out.println("El máximo de las notas es " + maximo);
    System.out.println("El mínimo de las notas es " + minimo);
    System.out.println("La media de las notas es " + media);









    s.close();
}
}