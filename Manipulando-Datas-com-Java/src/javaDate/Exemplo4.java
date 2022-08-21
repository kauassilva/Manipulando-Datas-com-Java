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
        
        // Verifica se a data2 é igual a data3
        boolean isEquals1 = data2.equals(data3); 
        
        // Verifica se a data1 é igual a data2
        boolean isEquals2 = data1.equals(data2); 
        
        System.out.println(isEquals1); // true
        System.out.println(isEquals2); // false
        System.out.println();
        
        // Compara a data1 com a data 2
        int caso1 = data1.compareTo(data2);
        
        // Compara a data2 com a data1
        int caso2 = data2.compareTo(data1);
        
        // Compara a data2 com a data3
        int caso3 = data2.compareTo(data3); 
        
        System.out.println(caso1); // -1, ou seja, a data1 vem antes da data2
        System.out.println(caso2); // 1, ou seja, a data2 vem depois da data1
        System.out.println(caso3); // 0, ou seja, a data2 é a mesma que a data3
    }
}
