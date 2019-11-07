import java.util.Scanner;

/**
 * Ej07Horas: Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas horas y minutos corresponde.
 */
public class Ej07Horas {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int minutos;
    int resHoras;
    int resMinutos;
    System.out.println("Introduce los minutos: ");
    minutos = s.nextInt();
    resHoras = minutos/60;
    resMinutos = minutos%60;
    System.out.println(resHoras+"horas y "+resMinutos+"minutos");

    s.close();
}
}