package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public int divide(int a) {
        return a / x;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int sum(int y) {
        return x + y;
    }

    public int sumAllOperation(int a) {
        Calculator calculator = new Calculator();
        return sum(a) + minus(a) + calculator.multiply(a) + divide(a);
    }

    public static void main(String[] args) {
        int a = 5;
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(a);
        System.out.println("multiply: " + rsl);
        rsl = minus(a);
        System.out.println("minus: " + rsl);
        rsl = sum(a);
        System.out.println("sum: " + rsl);
        rsl = calculator.divide(a);
        System.out.println("divide: " + rsl);
        rsl = calculator.sumAllOperation(a);
        System.out.println("sum all operations: " + rsl);
    }
}
