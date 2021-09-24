package ex33;

import java.util.Random;

public class responseCheck {
    public static void runResponse (String response){
        String[] optionsArray = {"Yes.", "No.", "Maybe.", "Ask again later."}; //Array to store outcome options.

        if (response.isEmpty()) {
            System.out.print("Please enter a response.");
        }
        else {
            int index = new Random().nextInt(optionsArray.length);
            String random = (optionsArray[index]);
            System.out.print(random);
        }
    }
}
