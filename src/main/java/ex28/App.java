package ex28;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        int count = 0;
        int sum = 0;
        while(count < 5){ //Counted loop to repeat user input request.
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int a1 = input.nextInt();
            sum = sum + a1;
            count++;
        }
        System.out.print("The total is " + sum + ".");
    }
}
