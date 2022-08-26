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
        // 16:35:52.175291400
        
        LocalTime passado = horaAtual.minusHours(1);
        LocalTime futuro = horaAtual.plusHours(1);      
        
        System.out.println(passado); // 15:35:52.175291400
        System.out.println(futuro); // 17:35:52.175291400          
    }
}
