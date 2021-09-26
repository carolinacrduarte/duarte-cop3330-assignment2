package ex36;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.util.ArrayList;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Math {
    //Average function:
    public static double average (ArrayList<Integer> numbers){
        int total = 0;
        for(int num: numbers) {
            total += num;
        }
        return (double)(total)/numbers.size();
    }
    //Maximum function:
    public static double max (ArrayList<Integer> numbers){
        int maxNumber = numbers.get(0);

        for(int x: numbers) {
            if(x > maxNumber)
                maxNumber = x;
        }

        return maxNumber;
    }
    //Minimum function:
    public static double min (ArrayList<Integer> numbers){
        int minNumber = numbers.get(0);

        for(int x: numbers) {
            if(x < minNumber)
                minNumber = x;
        }

        return minNumber;
    }
    //Standard deviation:
    public static double std (ArrayList<Integer> numbers){
        double mean = average(numbers);

        double sum = 0;
        for(int x: numbers) {
            sum = sum + pow((x-mean), 2);
        }

        return sqrt(sum/numbers.size());
    }



}

