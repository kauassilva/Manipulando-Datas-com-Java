/**
 *
 * @author kauas
 */
package javaDate;

import java.time.Instant;
import java.util.Date;

public class Exemplo5 {
    public static void main(String[] args) {
        Date dataInicial = new Date(1548531456975L);
        
        System.out.println(dataInicial); // Sat Jan 26 17:37:36 BRST 2019
        
        System.out.println();
        
        Instant instant = dataInicial.toInstant();
        System.out.println(instant); // 2019-01-26T19:37:36.975Z
    }
}
