package ex39;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class App {
    public static void main(String[] args)
    {
        Employee[] employees = {
                new Employee("John","Johnson","Manager",20161231),
                new Employee("Tou","Xiong","Software Engineer",20161005),
                new Employee("Michaela", "Michaelson", "District Manager", 20151219),
                new Employee("Jake","Jacobson","Programmer", 0),
                new Employee("Jacquelyn", "Jackson", "DBA", 0),
                new Employee("Sally","Webber","Web Developer",20151218)
        };

        //List to access all employee data.
        List<Employee> list = Arrays.asList(employees);

        //Obtaining first and last names:
        Function<Employee, String> byFirstName = Employee::FirstName;
        Function<Employee, String> byLastName = Employee::LastName;

        //Setting them in order by comparison:
        Comparator<Employee> lastThenFirst = Comparator.comparing(byLastName).thenComparing(byFirstName);
        System.out.print("Name              | Position              | Separation Date\r\n");
        System.out.print("-----------------------------------------------------------\r\n");
        list.stream().sorted(lastThenFirst).forEach(System.out::println);
    }
}


