package com.company.JavaStudy.day04.Math;

public class MainClass {
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 5);
        Rational r2 = new Rational(3, 2);
        Rational result = new Rational(3, 2);
        int a = result.getNumerator();
        int b = result.getDenominator();
        System.out.println("1/5 + 3/2 = "+a+"/"+b);
        result = r1.sub(r2);
        a = result.getNumerator();
        b = result.getDenominator();
        System.out.println("1/5 - 3/2 = "+a+"/"+b);
    }


}
