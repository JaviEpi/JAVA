import java.util.Scanner;

/**
 * Ej11Triangulos: Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los lados de un triángulo. El programa debe determinar que tipo de triangulo es, teniendo en cuenta los siguiente:

    Si se cumple Pitágoras entonces es triángulo rectángulo
    Si sólo dos lados del triángulo son iguales entonces es isósceles.
    Si los 3 lados son iguales entonces es equilátero.
    Si no se cumple ninguna de las condiciones anteriores, es escaleno.
 */
public class Ej11Triangulos {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double lado_A;
    double lado_B;
    double lado_C;

    System.out.print("Dimensión lado A: ");
    lado_A = s.nextDouble();
    System.out.print("Dimensión lado B: ");
    lado_B = s.nextDouble();
    System.out.print("Dimensión lado C: ");
    lado_C = s.nextDouble();

    if (Math.pow(lado_A,2)+Math.pow(lado_B,2)==Math.pow(lado_C,2) || Math.pow(lado_B,2)+Math.pow(lado_C,2)==Math.pow(lado_A,2) || Math.pow(lado_C,2)+Math.pow(lado_A,2)==Math.pow(lado_B,2)) {
        System.out.println("Es un triángulo rectángulo. ");
    }
    if (lado_A==lado_B && lado_B!=lado_C || lado_A==lado_C && lado_A!=lado_B || lado_B==lado_C && lado_B!=lado_A){
        System.out.println("Es un triángulo isóceles. ");
    }
    
    else if (lado_A==lado_B && lado_A==lado_C){
        System.out.println("Es un triángulo equilátero. ");
    }  else {
        System.out.println("El triángulo es escaleno. ");
        
    }

    s.close();
}

    
}