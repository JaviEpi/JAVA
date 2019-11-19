import java.util.Scanner;

/**
 * varianza
 */
public class varianza {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int i;
    double nota;
    double maximo_nota = 0;
    double minimo_nota = 10;
    double media = 0;
    String varianza = "";
    double varianza_nota;
    double varianza_total = 0;

    System.out.print("Introduce el número de notas que vas a instertar: ");
    int numero_notas = s.nextInt();

    for (i = 0; i < numero_notas; i++){
        nota = s.nextDouble();
        
        if (nota > maximo_nota){
            maximo_nota = nota;
        }  else if (nota > minimo_nota){
           minimo_nota = nota; 
        }

        media = media + (nota/numero_notas);

        varianza = varianza + " " + nota;

        Scanner v = new Scanner(varianza);
        for (i = 0; i < numero_notas; i++){
            varianza_nota = Double.parseDouble(v.next());
            varianza_total = varianza_total + (Math.pow((varianza_nota - media),2) / numero_notas);
        }

        System.out.println("De las notas introducidas:");
        System.out.println("La nota máxima es: " +maximo_nota);
        System.out.println("La nota mínima es: " +minimo_nota);
        System.out.println("La nota media es: " +media);
        System.out.println("La varianza es: " +varianza_total);

        s.close();
        v.close();
    }
}
}