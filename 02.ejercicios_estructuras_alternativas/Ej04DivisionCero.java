import java.util.Scanner;

/**
 * Ej04DivisionCero: Crea un programa que pida al usuario dos números y muestre su división si el segundo no es cero, o un mensaje de aviso en caso contrario.
 */
public class Ej04DivisionCero {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero_1;
    int numero_2;
    
    System.out.print("Valor del primer núemro: ");
    numero_1 = s.nextInt();
    System.out.print("Valor del segundo número: ");
    numero_2 = s.nextInt();

    if(numero_2==0){
        System.out.println("Error no se puede dividir entre cero");
    }  else{
        System.out.println("El resultado de la división es "+(numero_1/numero_2));
    }
    
    s.close();
}
}