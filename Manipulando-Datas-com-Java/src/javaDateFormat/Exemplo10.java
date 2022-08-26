/**
 *
 * @author kauas
 */
package javaDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo10 {
    
    public static void main(String[] args) {
        Date dataAtual = new Date();
        
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        
        String dataFormatada = formatar.format(dataAtual);
        
        System.out.println(dataFormatada);
        // 26/08/2022
    }
}
