//import java.util.concurrent.TimeUnit;
 

/**
 * Ej08Cronometro: Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos.

 */
public class Ej08Cronometro {

public static void main(String[] args) {
    int hora;
    int minuto;
    int segundo;
    String borraAnterior = "\b\b\b\b\b\b\b\b";  

    // horas
    for (hora=0; hora<=23; hora++) {
      
      for (minuto=0; minuto<=59; minuto++) {
        
        for (segundo=0; segundo<=59; segundo++) {
          System.out.print(borraAnterior+hora+":"+minuto+":"+segundo);
          //TimeUnit.SECONDS.sleep(1);
        }

      }
    }

    
}
}
