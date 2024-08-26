
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.numbers = new ArrayList<>();
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        Random randomNum = new Random();
        // the method containsNumber is probably useful
        //generating 7 random numbers which is not repeated
        while (this.numbers.size() < 7) {
            int num = randomNum.nextInt(40) + 1;
            if (!containsNumber(num)) {
                this.numbers.add(num);
            }
        }
//        for (int i = 0; i < 7; i++) {
//        int num = randomNum.nextInt(40) + 1;
//        if (!containsNumber(num)) {
//            this.numbers.add(num);
//        } else {
//            i--; // Decrement i to repeat the iteration if a duplicate is found
//        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        if (this.numbers.contains(number)) {
            return true;
        }
        return false;
    }
}
