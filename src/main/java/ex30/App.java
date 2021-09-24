package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Carolina Duarte
 */

public class App {
    public static void main(String[] args){
        for(int i=1; i<=12; i++) //Initial column.
        {
            for(int j=1; j<=12; j++) //Initial row.
            {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}
