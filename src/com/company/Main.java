package com.company;

public class Main {

    public static void main(String[] args) {
        Ints calc = new IntsCalculator();

        System.out.println("5 + 10 = " + calc.sum(5, 10));
        System.out.println("5 * 10 = " + calc.mult(5, 10));
        System.out.println("10 ^ 2 = " + calc.pow(10, 2));
    }
}
