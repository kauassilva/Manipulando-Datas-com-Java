/**
 *
 * @author kauas
 */
package javaDate;

import java.util.Date;

public class Exemplo3 {
    public static void main(String[] args) {
        Date data1 = new Date(1348384151878L); 
        Date data2 = new Date(1348531456975L); 
        
        System.out.println(data1); // Sun Sep 23 04:09:11 BRT 2012
        System.out.println(data2); // Mon Sep 24 21:04:16 BRT 2012
        
        boolean isAfter = data1.after(data2); 
        boolean isBefore = data1.before(data2); 
        
        System.out.println();
        System.out.println(isAfter); // false
        System.out.println(isBefore); // true
    }
}
