
import java.util.Scanner;

public class Checker {

    public boolean isDayOfWeek(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        }
        return false;
    }

    public boolean allVowels(String string) {
        //Using + quantifier, vowels must appear one time and can be repeated multiple time.
        if (string.matches("[aeiouAEIOU]+")) {
            return true;
        }
        return false;
    }

    public boolean timeOfDay(String string) {
        //00:00:00 and 23:59:59 checking hours
        //first for checking hour if its start from 01 or 2, checking min,checking sec
        //"() in hour to check if any format 01-2 is correct"
        if (string.matches("([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]")) {
            return true;
        }
        return false;
    }
}
