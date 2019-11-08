import java.util.Scanner;

/**
 * Ej08Sexo: Algoritmo que pida dos números ‘nota’ y ‘edad’ y un carácter ‘sexo’ y muestre el 
mensaje ‘ACEPTADA’ si la nota es mayor o igual a cinco, la edad es mayor o igual a 
dieciocho y el sexo es ‘F’. En caso de que se cumpla lo mismo, pero el sexo sea ‘M’, debe 
imprimir ‘POSIBLE’. Si no se cumplen dichas condiciones se debe mostrar ‘NO ACEPTADA’.
 */
public class Ej08Sexo {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double nota;
    int edad;
    String sexo;

    System.out.print("Nota del examen: ");
    nota = s.nextDouble();
    System.out.print("Edad: ");
    edad = s.nextInt();
    System.out.print("Sexo ('H' o 'F'): ");
    sexo = s.next();

    if (nota>=5 && edad>=18) {
        if (sexo.toUpperCase().equals("F")) {
          System.out.println("Aceptada");
        } else if (sexo.toUpperCase().equals("M")) {
            System.out.println("Posible");
        } else {
            System.out.println("El sexo no es F ni M. No Aceptada");
        }
      } else {
        System.out.println("No Aceptada");
      }
    
    
    s.close();
}    

    
}