/**
 *
 * @author kauas
 */
package javaDateFormat;

import java.text.DateFormat;
import java.util.Date;

public class Exemplo9 {
    
    public static void main(String[] args) {
        Date dataAtual = new Date();
        
        String dateToStr = DateFormat.getInstance().format(dataAtual);
        
        System.out.println(dateToStr);
        // 26/08/2022 14:55
        
        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(dataAtual);
        
        System.out.println(dateToStr);
        // 26 de agosto de 2022 14:55
    }
}
