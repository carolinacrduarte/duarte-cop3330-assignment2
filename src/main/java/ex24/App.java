package ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.util.Scanner;
import static ex24.checkAnagram.isAnagram;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two strings and I'll tell you if they are anagrams:" + "\r\n" + "Enter the first string: ");
        String anagram1 = input.nextLine(); //Reads the first anagram from user.
        System.out.print("Enter the second string: ");
        String anagram2 = input.nextLine(); //Reads the second anagram from user.
        isAnagram(anagram1, anagram2);

    }

}
