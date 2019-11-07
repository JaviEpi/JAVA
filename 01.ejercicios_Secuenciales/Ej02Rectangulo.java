import java.util.Scanner;

public class Ej02Rectangulo{
public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    double altura;
    double area;
    double base;
    double perimetro;
    System.out.println("Introduce la base: ");
    base = Double.parseDouble(s.nextLine());
    System.out.println("Introduce la altura: ");
    altura = Double.parseDouble(s.nextLine());
    perimetro = 2*base+2*altura;
    area = base*altura;

    System.out.println("El perí­metro es "+perimetro+" y el área es "+area);
    
}
    
} 