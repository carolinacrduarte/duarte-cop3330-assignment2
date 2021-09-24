package ex34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class employeeRemoval {
    public static void employeeNameRemoval(String name){
        String[] employeesArray = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        List<String> list = new ArrayList<>(Arrays.asList(employeesArray)); //Removing name from array.
        list.remove(name);
        employeesArray = list.toArray(new String[0]);

        System.out.print("There are 4 employees: \r\n " + Arrays.toString(employeesArray).replace(",", "\n").replace("[", "").replace("]", "")); //Printing new array command.

    }
}
