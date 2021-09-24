package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        String[] namesArray = {}; //Empty array declaration.
        do {
            System.out.print("Enter a name: ");
            name = input.nextLine();
            ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(namesArray));
            if (!name.isBlank()){
                arrayList.add(name); //Only add name to array if it is not blank.
            }
            namesArray = arrayList.toArray(namesArray); //New array.
        }
        while (!name.isEmpty()); //Request names until user inputs blank.
        if (name.isBlank()) {
            int index = new Random().nextInt(namesArray.length);
            String random = (namesArray[index]); //Choosing winner at random.
            System.out.print("The winner is... " + random); //Printing winner.
            System.exit(1);
        }

        }
}



