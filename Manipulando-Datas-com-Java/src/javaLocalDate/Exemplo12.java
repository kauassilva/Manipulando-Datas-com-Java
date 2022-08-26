/**
 *
 * @author kauas
 */
package javaLocalDate;

import java.time.LocalDate;

public class Exemplo12 {
    
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate ontem = hoje.minusDays(1);
        LocalDate amanha = hoje.plusDays(1);
        
        System.out.println(ontem); // 2022-08-25
        System.out.println(hoje); // 2022-08-26
        System.out.println(amanha); // 2022-08-27
    }
}
