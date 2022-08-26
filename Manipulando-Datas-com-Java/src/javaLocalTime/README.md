# Classe LocalTime

LocalTime é uma classe imutável que representa um horário, geralmente vista como hora-minuto-segundo (hh-mm-ss). Além de poder representar nanosegundos.

Vamos ver um exemplo simples de como instanciar e exibir o horário atual.

### Código

```java
import java.time.LocalTime;

public class Exemplo13 {
    
    public static void main(String[] args) {
        LocalTime horaAtual = LocalTime.now();
        
        System.out.println(horaAtual);
    }
}
```

### Output

```
15:17:54.765363600
```


<br/>

Agora iremos ver um exemplo simples de como alterar o horário, adicionando ou diminuindo as horas.

### Código

```java
import java.time.LocalTime;

public class Exemplo14 {
    
    public static void main(String[] args) {
        LocalTime horaAtual = LocalTime.now();
        
        System.out.println(horaAtual);
        
        LocalTime passado = horaAtual.minusHours(1);
        LocalTime futuro = horaAtual.plusHours(1);      
        
        System.out.println(passado);
        System.out.println(futuro);       
    }
}
```

### Output

```
16:35:52.175291400
15:35:52.175291400
17:35:52.175291400   
```

## Referência

* https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html
