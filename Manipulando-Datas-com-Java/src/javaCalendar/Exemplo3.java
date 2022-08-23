/**
 *
 * @author kauas
 */
package javaCalendar;

import java.util.Calendar;

public class Exemplo3 {
    public static void main(String[] args) {
        Calendar dataAtual = Calendar.getInstance();
        
        // ter. ago. 23 18:35:40 BRT 2022
        System.out.printf("%tc\n",dataAtual); 
        
        // 2022-08-23
        System.out.printf("%tF\n",dataAtual);
        
        // 08/23/22
        System.out.printf("%tD\n",dataAtual);
        
        // 06:35:40 PM
        System.out.printf("%tr\n",dataAtual);
        
        // 18:35:40
        System.out.printf("%tT\n",dataAtual);
    }
}
