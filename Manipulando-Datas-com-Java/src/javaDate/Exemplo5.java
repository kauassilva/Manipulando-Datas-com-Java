/**
 *
 * @author kauas
 */
package javaDate;

import java.time.Instant;
import java.util.Date;

public class Exemplo5 {
    public static void main(String[] args) {
        Date dataInicial = new Date(1661120251853L);
        
        System.out.println(dataInicial); // Sun Aug 21 19:17:31 BRT 2022
        
        System.out.println();
        
        Instant instant = dataInicial.toInstant();
        
        System.out.println(instant); // 2022-08-21T22:17:31.853Z
    }
}
