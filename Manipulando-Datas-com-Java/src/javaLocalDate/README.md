# Classe LocalDate

LocalDate é uma classe de data imutável que representa uma data, geralmente vista como ano-mês-dia (yyyy-MM-dd).

Vamos ver um exemplo simples de como instanciar e exibir a data atual.

### Código

```java
import java.time.LocalDate;

public class Exemplo11 {
    
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        
        System.out.println(dataAtual);
    }
}
```

### Output

```
2022-08-26
```


<br/>

Agora iremos ver um exemplo simples de como alterar a data, adicionando ou diminuindo o dia.

### Código

```java
import java.time.LocalDate;

public class Exemplo12 {
    
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate ontem = hoje.minusDays(1);
        LocalDate amanha = hoje.plusDays(1);
        
        System.out.println(ontem);
        System.out.println(hoje);
        System.out.println(amanha);
    }
}
```

### Output

```
2022-08-25
2022-08-26
2022-08-27
```

## Referência

* https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html
