package ex34;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.util.Arrays;
import java.util.Scanner;

import static ex34.employeeRemoval.employeeNameRemoval;

public class App {
    public static void main(String[] args){
        String[] employeesArray = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"}; //Declaring original array.
        System.out.print("There are 5 employees: \r\n " + Arrays.toString(employeesArray).replace(",", "\n").replace("[", "").replace("]", ""));

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter an employee name to remove: ");
        String name = input.nextLine();
        employeeNameRemoval(name); //Function to run name removal from array.
    }
}
