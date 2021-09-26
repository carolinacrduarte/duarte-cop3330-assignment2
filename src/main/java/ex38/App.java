package ex38;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.util.*;

import static ex38.evenNumbers.filterEvenNumbers;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String data = in.nextLine();
        String[] list = data.split(" ");

        Integer[] evenList = filterEvenNumbers(list); //Function to select even numbers.

        System.out.print("The even numbers are ");
        //Printing out result:
        for (int i = 0; i < evenList.length; i++) {
            if (i < evenList.length - 1) {
                System.out.print(evenList[i] + " ");
            } else {
                System.out.print(evenList[i] + ".");
            }
        }
    }

}




