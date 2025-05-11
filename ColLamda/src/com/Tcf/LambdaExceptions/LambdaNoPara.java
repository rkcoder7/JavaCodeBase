package com.Tcf.LambdaExceptions;

@FunctionalInterface
interface Runnable {
    void run();
}

public class LambdaNoPara {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello, Lambda!");
        runnable.run();
    }
}

