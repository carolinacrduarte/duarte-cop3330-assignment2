package ex27;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkInput {

    public static void validateFirstName(String firstName) {
        Pattern validFirstName = Pattern.compile("^.{2,}$"); //Must be at least 2 characters long.
        Matcher m1 = validFirstName.matcher(firstName);
        if (!m1.matches()) {
            System.out.print("The first name must be at least 2 characters long.\r\n");
        }
    }

    public static void validateLastName(String lastName) {
        int lastNameLength = lastName.length(); //Checking to see if field was completed.
        if (lastNameLength == 0) {
            System.out.print("The last name must be filled in.\r\n");
        } else {
            Pattern validLastName = Pattern.compile("^.{2,}$"); //Must be at least 2 characters long.
            Matcher m2 = validLastName.matcher(lastName);
            if (!m2.matches()) {
                System.out.print("The last name must be at least 2 characters long.\r\n");
            }
        }
    }

    public static void validateZipCode(String zipCode) {
        Pattern validZipCode = Pattern.compile("\\d{5}"); //Must be a 5-digit number.
        Matcher m3 = validZipCode.matcher(zipCode);
        if (!m3.matches()) {
            System.out.print("The zipcode must be a 5 digit number.\r\n");
        }
    }

    public static void validateEmployeeID(String employeeID) {
        Pattern validEmployeeID = Pattern.compile("^.*[A-Z]{2}(-\\d{4})?$"); //Must be AA-1234 format.
        Matcher m4 = validEmployeeID.matcher(employeeID);
        if (!m4.matches()) {
            System.out.print("The employee ID must be in the format of AA-1234.");
        }
    }



}
