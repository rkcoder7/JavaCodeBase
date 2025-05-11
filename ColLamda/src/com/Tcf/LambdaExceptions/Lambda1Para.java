package com.Tcf.LambdaExceptions;

@FunctionalInterface
interface Consumer<T> {
    void accept(T t);
}

public class  Lambda1Para {
    public static void main(String[] args) {
        Consumer<String> consumer = (String s) -> System.out.println("Consumed: " + s);
        consumer.accept("Hello, Lambda!");
    }
}

