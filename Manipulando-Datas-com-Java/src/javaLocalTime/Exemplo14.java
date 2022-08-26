/**
 *
 * @author kauas
 */
package javaLocalTime;

import java.time.LocalTime;

public class Exemplo14 {
    
    public static void main(String[] args) {
        LocalTime horaAtual = LocalTime.now();
        
        System.out.println(horaAtual);
        // 15:20:33.041283900
        
        LocalTime daquiUmaHora = horaAtual.plusHours(1);
        
        System.out.println(daquiUmaHora);
        // 16:20:33.041283900
    }
}
