package ex25;

import java.util.regex.*;

public class checkPassword {

    public static int passwordValidator(String password) {
        //Holds password strength value:
        int strengthValue = 0;

        //Very weak check:
        Pattern p1 = Pattern.compile("^(?=.*[0-9]).{1,7}$");
        Matcher m1 = p1.matcher(password);
        //Weak check:
        Pattern p2 = Pattern.compile("^(?=.*[a-zA-Z]).{1,7}$");
        Matcher m2 = p2.matcher(password);
        //Strong check:
        Pattern p3 = Pattern.compile("^(?=.*[0-9])(?=.*[a-zA-Z])(?!.*[@#$%^&-+=()]).{8,}$");
        Matcher m3 = p3.matcher(password);
        //Very strong check:
        Pattern p4 = Pattern.compile("^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[@#$%^&-+=()]).{8,}$");
        Matcher m4 = p4.matcher(password);

        if (m1.matches())
        {
            int count = 1;
            strengthValue += count;
        }
        else if (m2.matches())
        {
            int count = 2;
            strengthValue += count;
        }
        else if (m3.matches())
        {
            int count = 3;
            strengthValue += count;
        }
        else if (m4.matches())
        {
           int count = 4;
           strengthValue += count;
        }

        return (strengthValue);
    }
}

