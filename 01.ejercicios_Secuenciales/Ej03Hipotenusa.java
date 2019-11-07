/**
 * Ej03Hipotenusa: Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
 */
import java.util.Scanner;

public class Ej03Hipotenusa{
public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    double cateto_1;
    double cateto_2;
    double hipotenusa;

    System.out.println("Introduce el cateto 1: ");
    cateto_1 = s.nextDouble();
    System.out.println("Introduce el cateto 2: ");
    cateto_2 = s.nextDouble();
    
    hipotenusa = Math.sqrt(Math.pow(cateto_1,2)+Math.pow(cateto_2,2));
    System.out.println("La hipotenusa es "+hipotenusa);

    s.close();
}
    
}