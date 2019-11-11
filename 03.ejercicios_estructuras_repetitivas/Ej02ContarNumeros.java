import java.util.Scanner;

/**
 * Ej02ContarNumeros: Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir). El programa debe informar de cuantos números introducidos son mayores que 0, menores que 0 e iguales a 0.
 
 */
public class Ej02ContarNumeros {

public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int cantidad_numeros;
    int numero;
    int contador_ceros = 0;
    int contador_negativos = 0;
    int contador_positivos = 0;
    int i;
    
    
    
    System.out.print("¿Cuántos números vas a introducir?: ");
    cantidad_numeros = s.nextInt();
    
    // Ciclo
    for (i=1; i<=cantidad_numeros; i++) {
    System.out.print("Número "+i+": ");
    numero = s.nextInt();
    
    if (numero>0) {
        contador_positivos = contador_positivos+1;
    } else if (numero<0) {
        contador_negativos = contador_negativos+1;
    } else {
        contador_ceros = contador_ceros+1;
    }
    }
    
        
    System.out.println("Números positivos: "+contador_positivos);
    System.out.println("Números negativos: "+contador_negativos);
    System.out.println("Números igual a 0: "+contador_ceros);

    s.close();
}

}