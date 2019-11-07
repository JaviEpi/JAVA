import java.util.Scanner;

/**
 * Ej08Sueldo: Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las tres ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.
 */
public class Ej08Sueldo {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double sueldo_base;
    double comisiones;
    double venta_1;
    double venta_2;
    double venta_3;
    double sueldo_total;

    System.out.print("¿Cual es tu sueldo base al mes?: ");
    sueldo_base = s.nextDouble();
    System.out.print("Precio de la primera venta: ");
    venta_1 = s.nextDouble();
    System.out.print("Precio de la segunda venta: ");
    venta_2 = s.nextDouble();
    System.out.print("Precio de la tercera venta: ");
    venta_3 = s.nextDouble();

    
    comisiones = (venta_1+venta_2+venta_3)*0.1;
    sueldo_total = sueldo_base + comisiones;
    System.out.println("Comisión por ventas: "+comisiones);
    System.out.println("Sueldo total: "+sueldo_total);

    s.close();
    
}
}