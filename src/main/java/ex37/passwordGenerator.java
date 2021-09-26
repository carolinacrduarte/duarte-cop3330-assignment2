package ex37;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class passwordGenerator {
    public static String generatePassword(int length, int special, int nums)
    {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$%^&*";
        String numbers = "1234567890";

        Random random = new Random();
        ArrayList<Character> chars = new ArrayList<>();

        //Loop for special characters.
        for(int i=0; i<special; i++){
            chars.add(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
        }

        //Loop for amount of numbers.
        for(int i=0; i<nums; i++){
            // find random numeral and add it to the list
            chars.add(numbers.charAt(random.nextInt(numbers.length())));
        }

        //Loop to complete the rest of the password according to input length.
        for(int i=chars.size()-1; i<length; i++){
            // find random letter and add it to the list
            chars.add(letters.charAt(random.nextInt(letters.length())));
        }

        //Random shuffle for password.
        Collections.shuffle(chars);

        //Empty string declaration to be filled with password created.
        StringBuilder password = new StringBuilder();

        //Putting the password together.
        for(Character s : chars)
        {
            password.append(s);
        }

        //Returns created final password.
        return password.toString();
    }
}
