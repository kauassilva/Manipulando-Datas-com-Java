# Classe DateFormat

A classe DateFormat serve para formatação de datas. Existe também, a classe SimpleDateFormat com o mesmo propósito, e que também será implementada neste diretório.

## DateFormat

Esta classe fornece vários métodos para formatar e analisar data e hora em java de maneira independente de linguagem. A classe DateFormat é uma classe abstrata.

Vamos ver um exemplo simples para formatar data e hora em Java usando a classe DateFormat.

### Código

```java
import java.text.DateFormat;
import java.util.Date;

public class Exemplo9 {
    
    public static void main(String[] args) {
        Date dataAtual = new Date();
        
        String dateToStr = DateFormat.getInstance().format(dataAtual);
        
        System.out.println(dateToStr);
        
        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(dataAtual);
        
        System.out.println(dateToStr);
    }
}
```

### Output

```
26/08/2022 14:55
26 de agosto de 2022 14:55
```

## SimpleDateFormat

A classe SimpleDateFormat, diferente da anterior, define um padrão de formatação para a saída de data.

Vamos ver um exemplo simples para formatar data e hora em Java usando a classe SimpleDateFormat.

### Código

```java
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo10 {
    
    public static void main(String[] args) {
        Date dataAtual = new Date();
        
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        
        String dataFormatada = formatar.format(dataAtual);
        
        System.out.println(dataFormatada);
    }
}
```

### Output

```
26/08/2022
```

## Referências

* https://docs.oracle.com/javase/8/docs/api/java/text/DateFormat.html
* https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
