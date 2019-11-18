
/**
 * Ej08Cronometro: Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos.

 */
import java.util.concurrent.TimeUnit;

public class Ej08Cronometro {

public static void main(String[] args) throws InterruptedException{
  int hora;
  int minuto;
  int segundo;
  String borra_anterior = "\b\b\b\b\b\b\b\b";  

  // horas
  for (hora=0; hora<=23; hora++) {
      
    for (minuto=0; minuto<=59; minuto++) {
        
      for (segundo=0; segundo<=59; segundo++) {
          System.out.printf("%02d:%02d:%02d", hora,minuto,segundo);
          TimeUnit.SECONDS.sleep(1);
          System.out.print(borra_anterior);
      }
    }
  }
}
}
