/**
 *
 * @author kauas
 */
package javaLocalDateTime;

import java.time.LocalDateTime;

public class Exemplo16 {
    
    public static void main(String[] args) {
        LocalDateTime dataAtual = LocalDateTime.now();
        
        System.out.println(dataAtual); // 2022-08-26T16:40:31.571950100
        
        LocalDateTime futuro = dataAtual.plusHours(1).plusDays(2).plusSeconds(12);
        LocalDateTime passado = dataAtual.minusHours(1).minusDays(2).minusSeconds(12);
                
        System.out.println(passado); // 2022-08-24T15:40:19.571950100
        System.out.println(futuro); // 2022-08-28T17:40:43.571950100
    }
}
