# Classe LocalDateTime

LocalDateTime é uma classe que funciona como uma espécie de junção entre as classes [LocalDate](https://github.com/kauassilva/Manipulando-Datas-com-Java/tree/main/Manipulando-Datas-com-Java/src/javaLocalDate) e [LocalTime](https://github.com/kauassilva/Manipulando-Datas-com-Java/tree/main/Manipulando-Datas-com-Java/src/javaLocalTime).

Vamos ver um exemplo simples de como instanciar e exibir a data e o horário atual.

### Código

```java
import java.time.LocalDateTime;

public class Exemplo15 {
    
    public static void main(String[] args) {
        LocalDateTime dataAtual = LocalDateTime.now();
        
        System.out.println(dataAtual);
    }
}
```

### Output

```
2022-08-26T15:23:25.172470900
```


<br/>

Agora iremos ver um exemplo simples de como alterar a data e o horário, adicionando ou diminuindo seus campos.

### Código

```java
import java.time.LocalDateTime;

public class Exemplo16 {
    
    public static void main(String[] args) {
        LocalDateTime dataAtual = LocalDateTime.now();
        
        System.out.println(dataAtual); 
        
        LocalDateTime futuro = dataAtual.plusHours(1).plusDays(2).plusSeconds(12);
        LocalDateTime passado = dataAtual.minusHours(1).minusDays(2).minusSeconds(12);
                
        System.out.println(passado); 
        System.out.println(futuro); 
    }
}
```

### Output

```
2022-08-26T16:40:31.571950100
2022-08-24T15:40:19.571950100
2022-08-28T17:40:43.571950100
```

## Referência

* https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html
