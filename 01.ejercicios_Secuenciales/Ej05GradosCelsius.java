import java.util.Scanner;

/**
 * Ej05GradosCelsius
 */
public class Ej05GradosCelsius {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double celsius;
    double fahrenheit;

    System.out.print("Introduce la temperatura ºF: ");
    fahrenheit = s.nextDouble();
    celsius = (fahrenheit-32)*5/9;
    System.out.println("La temperatura es "+celsius+"ºC");
    
    
}
}