import java.util.Scanner;

/**
 * Ej07Potencia: Realiza un algoritmo que calcule la potencia, para ello pide por teclado la base y el exponente. Pueden ocurrir tres cosas:
    El exponente sea positivo, sólo tienes que imprimir la potencia.
    El exponente sea 0, el resultado es 1.
    El exponente sea negativo, el resultado es 1/potencia con el exponente positivo
 */
public class Ej07Potencia {

public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int base;
    int exponente;

    System.out.print("Valor de la base del exponente: ");
    base = s.nextInt();
    System.out.print("Valor del exponente: ");
    exponente = s.nextInt();

    if(exponente==0){
        System.out.println("El resultado es 1");
    }
    else if(exponente>0){
        System.out.println("El resultado es: "+ Math.pow(base, exponente));
    }  else{
        System.out.println("El resultado es: "+1/(Math.pow(base,Math.abs(exponente))));
    }
 
    s.close();
    
}
}
