# Classe Calendar

Quando o JDK 1.1 veio, era necessário facilitar alguns recursos da classe Date. Criando, assim, a classe Calendar, fazendo com que os construtores e métodos da classe Date fossem depreciados.

A classe Calendar é abstrata e fornece métodos para conversão de datas entre instantes específicos.

Para sua manipulação, a classe Calendar possui parâmetros específicos, por exemplo: YEAR, MONTH, HOUR, além de outros.


<br/>

## getInstance()

O método .getInstance() é implementada para obter o instante no momento de execução. Coletando diversos dados referentes a data e o horário.


### Código

```java
import java.util.Calendar;

public class Exemplo6 {

    public static void main(String[] args) {
        Calendar dataAtual = Calendar.getInstance();
        
        System.out.println(dataAtual);
    }
}
```


### Output 

Quando executado o código acima, a saída é retornada em apenas uma linha! Eu apenas quebrei as linhas para que seja mais fácil observar os dados coletados.

```
java.util.GregorianCalendar[
    time=1661295336900,
    areFieldsSet=true,
    areAllFieldsSet=true,
    lenient=true,
    zone=sun.util.calendar.ZoneInfo[
      id="America/Sao_Paulo",
      offset=-10800000,
      dstSavings=0,
     useDaylight=false,
      transitions=93,
      lastRule=null
    ],
    firstDayOfWeek=1,
    minimalDaysInFirstWeek=1,
    ERA=1,
    YEAR=2022,
    MONTH=7,
    WEEK_OF_YEAR=35,
    WEEK_OF_MONTH=4,
    DAY_OF_MONTH=23,
    DAY_OF_YEAR=235,
    DAY_OF_WEEK=3,
    DAY_OF_WEEK_IN_MONTH=4,
    AM_PM=1,
    HOUR=7,
    HOUR_OF_DAY=19,
    MINUTE=55,
    SECOND=36,
    MILLISECOND=900,
    ZONE_OFFSET=-10800000,
    DST_OFFSET=0
]
```


<br/>

## add(x, y)

O método .add(x, y) é implementado para manipular datas, adicionando ou subtraindo o tempo. Para executar o método, será necessário dois parâmetros: o campo da data (que será adicionada ou subtraída) e a quantidade.


### Código

```java
import java.util.Calendar;

public class Exemplo7 {
    public static void main(String[] args) {
        Calendar dataAtual = Calendar.getInstance();
        
        // Tue Aug 23 20:14:45 BRT 2022
        System.out.println("Data atual: "+dataAtual.getTime());
        
        // Thu Aug 25 20:14:45 BRT 2022
        dataAtual.add(Calendar.DATE, 2);
        System.out.println("\n2 dias a frente: "+dataAtual.getTime());
        
        // Mon Jul 25 20:14:45 BRT 2022
        dataAtual.add(Calendar.MONTH, -1);
        System.out.println("\n1 mês atrás: "+dataAtual.getTime());
        
        // Fri Jul 25 20:14:45 BRT 2025
        dataAtual.add(Calendar.YEAR, 3);
        System.out.println("\n3 anos a frente: "+dataAtual.getTime());
    }
}
```


### Output

```
Data atual: Tue Aug 23 20:14:45 BRT 2022

2 dias a frente: Thu Aug 25 20:14:45 BRT 2022

1 mês atrás: Mon Jul 25 20:14:45 BRT 2022

3 anos a frente: Fri Jul 25 20:14:45 BRT 2025
```


<br/>

## Imprimindo Datas e Horários

Caso queira exibir uma data ou um horário de forma mais 'amigável', aqui vai algumas maneiras de converter o resultado de um objeto Calendar:


### Código

```java
import java.util.Calendar;

public class Exemplo8 {
    public static void main(String[] args) {
        Calendar dataAtual = Calendar.getInstance();
        
        // ter. ago. 23 20:22:29 BRT 2022
        System.out.printf("%tc\n",dataAtual); 
        
        // 2022-08-23
        System.out.printf("%tF\n",dataAtual);
        
        // 08/23/22
        System.out.printf("%tD\n",dataAtual);
        
        // 08:22:29 PM
        System.out.printf("%tr\n",dataAtual);
        
        // 20:22:29
        System.out.printf("%tT\n",dataAtual);
    }
}
```


### Output

```
ter. ago. 23 20:22:29 BRT 2022
2022-08-23
08/23/22
08:22:29 PM
20:22:29
```


<br/>

## Referências

* https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html
* https://www.javatpoint.com/java-util-calendar
