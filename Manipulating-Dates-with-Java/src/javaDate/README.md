# Date class

## Constructors

```java
Date();

Date(long date);

@Deprecated
Date(int year, int month, int date);

@Deprecated
Date(int year, int month, int date, int hrs, int min);

@Deprecated
Date(int year, int month, int date, int hrs, int min, int sec);

@Deprecated
Date(String s);
```

### Date();

Allocates a Date object and initializes it so that it represents the time at which it was allocated, measured to the nearest millisecond.

Briefly, it shows the current date when it runs.

#### Code:

```java
import java.util.Date;

public class Exemplo1 {
    public static void main(String[] args) {
        Date dataAtual = new Date();
        
        System.out.println(dataAtual); // Sun Aug 21 18:01:13 BRT 2022 
    }
}
```

#### Output:

```bash
Sun Aug 21 18:01:13 BRT 2022
```


