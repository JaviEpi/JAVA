import java.util.Scanner;

/**
 * Ej12AñoBisiesto: Escribir un programa que lea un año indicar si es bisiesto. Nota: un año es bisiesto si es un número divisible por 4, pero no si es divisible por 100, excepto que también sea divisible por 400.

 */
public class Ej12AñoBisiesto {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int año;

    // Pedimos el año que quiera
    System.out.print("Introduce el año: ");
    año = s.nextInt();

    // Calculos para saber si es bisiesto
    if ((año%4==0 && !(año%100==0)) || año%400==0){
        System.out.println("Año bisiesto");
    }else{
        System.out.println("Año no bisiesto");
    }
    
    
    
    s.close();

}
}