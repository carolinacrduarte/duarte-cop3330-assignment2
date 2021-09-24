package ex26;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.util.Scanner;

import static ex26.PaymentCalculator.calculateMonthsUntilPaidOff;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your balance? ");
        double b = input.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        double apr = input.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        double p = input.nextDouble();

        System.out.print("It will take you " + calculateMonthsUntilPaidOff(b, apr, p) + " months to pay off this card.");
    }
}
