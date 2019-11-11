import java.util.Scanner;

/**
 * Ej01AdivinarNumero: Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100. A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido,a demás de los intentos que te quedan (tienes 10 intentos para acertarlo). El programa termina cuando se acierta el número (además te dice en cuantos intentos lo has acertado), si se llega al limite de intentos te muestra el número que había generado.
 */
public class Ej01AdivinarNumero {

public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int intentos = 10;
    int numero;
    int numero_adivinar = (int) (Math.random()*100 + 1);
    
    System.out.print("Adivine el número (de 1 a 100): ");
    numero = s.nextInt();
    
    while (numero_adivinar!=numero && intentos>1) {
    if (numero_adivinar>numero) {
        System.out.println("Es menor que el número a adivinar");
    } else {
        System.out.println("Es mayor que el número a adivinar");
    }
    intentos = intentos-1;
    System.out.println("Le quedan "+intentos+" intentos:");
    System.out.print("Deme otro número (de 1 a 100): ");
    numero = s.nextInt();
    }
    
    if (numero_adivinar==numero) {
        System.out.println("Acerto el número en "+(11-intentos)+" intentos.");
    } else {
        System.out.println("El numero era: "+numero_adivinar);
    }

    s.close();
}    
}