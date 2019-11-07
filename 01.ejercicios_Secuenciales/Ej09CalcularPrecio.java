import java.util.Scanner;

/**
 * Ej09CalcularPrecio: Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuanto deberá pagar finalmente por su compra.
 */
public class Ej09CalcularPrecio {

public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    double total_compra;
    double descuento;

    System.out.println("Dime el precio total de la compra: ");
    total_compra = s.nextDouble();
    descuento = total_compra-total_compra * 0.15;
    System.out.println("El precio final es de "+descuento);

    s.close();
}
}