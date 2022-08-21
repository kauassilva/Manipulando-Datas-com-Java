/**
 *
 * @author kauas
 */
package javaDate;

import java.util.Date;

public class Exemplo2 {
    public static void main(String[] args) {
        long milissegundoFixo = 10800000;
        long milissegundoAtual = System.currentTimeMillis();
        
        System.out.println(milissegundoFixo); // 10800000 
        Date dataDoMilisegundo1 = new Date(milissegundoFixo); 
        System.out.println(dataDoMilisegundo1); // Thu Jan 01 00:00:00 BRT 1970
        
        System.out.println();
        
        System.out.println(milissegundoAtual); // 1661111718963
        Date dataDoMilisegundo2 = new Date(milissegundoAtual); 
        System.out.println(dataDoMilisegundo2); // Sun Aug 21 16:55:18 BRT 2022
    }
}
