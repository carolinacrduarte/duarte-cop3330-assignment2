package ex38;

import java.util.ArrayList;

public class evenNumbers {
    public static Integer[] filterEvenNumbers(String[] list) {
        ArrayList<Integer> newList = new ArrayList<>();

        for (String s : list) {
            int num = Integer.parseInt(s);

            if (num % 2 == 0) {
                newList.add(num);
            } //If number is divisible by two, then add it to list.
        }

        Integer[] arr = new Integer[newList.size()];
        arr = newList.toArray(arr);

        return arr; //Return array with only even numbers.
    }
}

