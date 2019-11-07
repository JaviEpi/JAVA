import java.util.Scanner;

/**
 * ComparaCadenas
 */
public class ComparaCadenas {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String cadena_1;
    String cadena_2;
    String cadena_3;
    String cadena_4;

    System.out.print("Introduce la cadena número 1: ");
    cadena_1 = s.nextLine();
    System.out.print("Introduce la cadena número 2: ");
    cadena_2 = s.nextLine();
    if (cadena_1.equals(cadena_2)){
      System.out.println(cadena_1+" es igual a "+cadena_2);
        
    } else{
      System.out.println(cadena_1+" es diferente "+cadena_2);
    }

    System.out.print("Introduce la cadena número 3: ");
    cadena_3 = s.nextLine();
    System.out.print("Introduce la cadena número 4: ");
    cadena_4 = s.nextLine();
    if (cadena_3.compareTo(cadena_4)<0){
      System.out.println(cadena_1+" es igual a "+cadena_2);
        
    } else{
      System.out.println(cadena_1+" es diferente "+cadena_2);
    }
    s.close();
}
}