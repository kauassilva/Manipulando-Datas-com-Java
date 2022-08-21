/**
 *
 * @author kauas
 */
package javaDate;

import java.util.Date;

public class Exemplo4 {
    public static void main(String[] args) {
        Date data1 = new Date(1348384151878L); // Sun Sep 23 04:09:11 BRT 2012
        Date data2 = new Date(1348531456975L); // Mon Sep 24 21:04:16 BRT 2012
        Date data3 = new Date(1348531456975L); // Mon Sep 24 21:04:16 BRT 2012
        
        boolean isEquals1 = data2.equals(data3); 
        boolean isEquals2 = data1.equals(data2); 
        
        System.out.println(isEquals1); // true
        System.out.println(isEquals2); // false
        System.out.println();
        
        int caso1 = data1.compareTo(data2); 
        int caso2 = data2.compareTo(data1); 
        int caso3 = data2.compareTo(data3); 
        
        System.out.println(caso1); // -1
        System.out.println(caso2); // 1
        System.out.println(caso3); // 0
    }
}
