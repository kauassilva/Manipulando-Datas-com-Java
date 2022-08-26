/**
 *
 * @author kauas
 */
package javaCalendar;

import java.util.Calendar;

public class Exemplo7 {
    public static void main(String[] args) {
        Calendar dataAtual = Calendar.getInstance();
        
        // Tue Aug 23 18:14:40 BRT 2022
        System.out.println("Data atual: "+dataAtual.getTime());
        
        // Thu Aug 25 18:22:57 BRT 2022
        dataAtual.add(Calendar.DATE, 2);
        System.out.println("\n2 dias a frente: "+dataAtual.getTime());
        
        // Mon Jul 25 18:22:57 BRT 2022
        dataAtual.add(Calendar.MONTH, -1);
        System.out.println("\n1 mês atrás: "+dataAtual.getTime());
        
        // Fri Jul 25 18:22:57 BRT 2025
        dataAtual.add(Calendar.YEAR, 3);
        System.out.println("\n3 anos a frente: "+dataAtual.getTime());
    }
}
