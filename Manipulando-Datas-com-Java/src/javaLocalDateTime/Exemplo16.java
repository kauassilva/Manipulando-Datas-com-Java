/**
 *
 * @author kauas
 */
package javaLocalDateTime;

import java.time.LocalDateTime;

public class Exemplo16 {
    
    public static void main(String[] args) {
        LocalDateTime dataAtual = LocalDateTime.now();
        
        System.out.println(dataAtual);
        // 2022-08-26T15:25:17.356753100
        
        LocalDateTime futuro = dataAtual.plusHours(1).plusDays(2).plusSeconds(12);
        
        System.out.println(futuro);
        // 2022-08-28T16:25:29.356753100
    }
}
