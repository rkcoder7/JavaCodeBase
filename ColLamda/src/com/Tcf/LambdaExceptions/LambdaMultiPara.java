package com.Tcf.LambdaExceptions;

@FunctionalInterface
interface Calculator {
    int calculate(int x, int y);
}

public class LambdaMultiPara {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;

        System.out.println("Addition: " + add.calculate(10, 5)); // Output: 15
        System.out.println("Subtraction: " + subtract.calculate(10, 5)); // Output: 5
    }
}


