# Classe Date

## Construtores

```java
Date();

Date(long milissegundo);

@Deprecated
Date(int ano, int mes, int dia);

@Deprecated
Date(int ano, int mes, int dia, int hora, int minuto);

@Deprecated
Date(int ano, int mes, int dia, int hora, int minuto, int segundo);

@Deprecated
Date(String s);
```


<br/>

### Date();

Aloca um objeto Date e inicializa-o para que represente a hora em que foi alocado, medido até o milissegundo mais próximo.

Ou seja, mostra a data atual no momento em que é executado.

#### Código:

```java
import java.util.Date;

public class Exemplo1 {
    public static void main(String[] args) {
        Date dataAtual = new Date();
        
        System.out.println(dataAtual); // Sun Aug 21 18:01:13 BRT 2022 
    }
}
```

#### Saída:

```
Sun Aug 21 18:01:13 BRT 2022
```


<br/>

### Date(long milissegundo);

Aloca um objeto Date e o inicializa para representar o número especificado de milissegundos desde a hora base padrão conhecida como "a época", ou seja, 1º de janeiro de 1970, 00:00:00 GMT.

Ou seja, essa classe precisa que você insira uma data no formato de milissegundos. A classe é baseada em um padrão chamado "época" que usa a data de 1º de janeiro de 1970, 00:00:00 como referência.

Para entender, vamos usar System.currentTimeMillis(). Este método retorna o valor de milissegundos no momento em que é executado.

#### Código:

```java
import java.util.Date;

public class Exemplo2 {
    public static void main(String[] args) {
        long milissegundoAtual = System.currentTimeMillis();

        System.out.println(milissegundoAtual); // 1661117319028
        Date dataDoMilisegundo2 = new Date(milissegundoAtual); 
        System.out.println(dataDoMilisegundo2); // Sun Aug 21 18:28:39 BRT 2022
    }
}
```

#### Saída:

```
1661117319028
Sun Aug 21 18:28:39 BRT 2022
```


<br/>

## Métodos principais

| Método | Retorno | Descrição |
| --- | --- | --- |
| .after(Date) | boolean | Verifica se o objeto Date de referência é posterior ao comparado |
| .before(Date) | boolean | Verifica se o objeto Date de referência é anterior ao comparado |
| .compareTo(Date) | int | Compara dois objetos Date |
| .equals(Date) | boolean | Checa se os objetos são iguais |
| .getTime() | long | Retorna a data em milissegundos |
| .setTime(long) | void | Define uma data com base em milissegundos |
| .from(Instant) | static Date | Define uma data com base em um Instant |
| .toInstant() | Instant | Retorna um Instant com base em um Date |


<br/>

### .after() e .before()

O método .after() verifica se o objeto Date de referência é posterior ao comparado, e retorna um valor do tipo boolean

O método .before() verifica se o objeto Date de referência é anterior ao comparado, e retorna um valor do tipo boolean


#### Código:

```java
import java.util.Date;

public class Exemplo3 {
    public static void main(String[] args) {
        Date data1 = new Date(1348384151878L); 
        Date data2 = new Date(1348531456975L); 
        
        System.out.println(data1); // Sun Sep 23 04:09:11 BRT 2012
        System.out.println(data2); // Mon Sep 24 21:04:16 BRT 2012
        
        // Verifica se a data1 é posterior a data2
        boolean isAfter = data1.after(data2);
        
        // Verifica se a data1 é anterior a data2
        boolean isBefore = data1.before(data2); 
        
        System.out.println();
        System.out.println(isAfter); // false
        System.out.println(isBefore); // true
    }
}
```

#### Saída:

```
Sun Sep 23 04:09:11 BRT 2012
Mon Sep 24 21:04:16 BRT 2012

false
true
```


<br/>

### .compareTo() e .equals()

O método .compareTo() compara dois objetos Date
  * Caso o primeiro Date seja um valor anterior ao segundo Date, o método retorna um valor do tipo inteiro: -1
  * Caso o primeiro Date seja um valor posterior ao segundo Date, o método retorna um valor do tipo inteiro: 1
  * Caso os dois Date sejam iguais, o método retorna um valor do tipo inteiro: 0
    
O método .equals() checa se os objetos são iguais, e retorna um valor do tipo boolean

#### Código:

```java
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
```

#### Saída:

```
true
false

-1
1
0
```


<br/>

### .toInstant()

O método .toInstant() converte o objeto Date em um Instant. A conversão cria um Instant que representa o mesmo ponto na linha do tempo que o Date, e retorna um instante representando o mesmo ponto na linha do tempo que este objeto Date.

Seu uso é indicado para gravar marcações temporais em eventos da sua aplicação.

#### Código:

```java
import java.time.Instant;
import java.util.Date;

public class Exemplo5 {
    public static void main(String[] args) {
        Date dataInicial = new Date(1661120251853L);
        
        System.out.println(dataInicial); // Sun Aug 21 19:17:31 BRT 2022
        
        System.out.println();
        
        Instant instant = dataInicial.toInstant();
        System.out.println(instant); // 2022-08-21T22:17:31.853Z
    }
}
```

#### Saída:

```
Sun Aug 21 19:17:31 BRT 2022

2022-08-21T22:17:31.853Z
```
