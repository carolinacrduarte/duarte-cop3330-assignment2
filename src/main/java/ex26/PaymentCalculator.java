package ex26;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Carolina Duarte
 */

public class PaymentCalculator {
    public static double calculateMonthsUntilPaidOff(double b, double p, double apr){
        double i = apr/365;
        double n;
        double x = 1+i;
        double y = 30;
        n = (float) (-(1/30) * (Math.log(1 + (b/p) * (1 - Math.pow(x, y))))/Math.log(1+i));
        return (n);
    }
}
