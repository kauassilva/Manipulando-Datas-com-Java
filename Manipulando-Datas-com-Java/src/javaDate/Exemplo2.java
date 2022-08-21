/**
 *
 * @author kauas
 */
package javaDate;

import java.util.Date;

public class Exemplo2 {
    public static void main(String[] args) {
        long milissegundoAtual = System.currentTimeMillis();

        System.out.println(milissegundoAtual); // 1661117319028
        Date dataDoMilisegundo2 = new Date(milissegundoAtual); 
        System.out.println(dataDoMilisegundo2); // Sun Aug 21 18:28:39 BRT 2022
    }
}
