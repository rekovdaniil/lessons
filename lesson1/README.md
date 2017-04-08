##### Как собрать и запустить программу на Java

Компилируем

```sh
[user@localhost]$ javac -d out src/FirstProgram.java
```

Запускаем

```sh
[user@localhost]$ java -cp out FirstProgram
Hello Worm!
```

##### Как собрать и запустить программу на Java, находящуюся в отдельном [package](https://docs.oracle.com/javase/tutorial/java/concepts/package.html)   

Компилируем

```sh
[user@localhost]$ javac src/org/hillel/FirstProgram.java -d out
```

Запускаем

```sh
[user@localhost]$ java -cp out org.hillel.FirstProgram
Hello Worm!
I like Java
```