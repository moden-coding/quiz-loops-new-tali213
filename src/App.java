import java.util.*;
/*
 * Given:
 * A random number between 1 and 10 is given in the variable magicNumber
 * 
 * Task begins:
 * 1. Continually take input from the user until they guess the correct number.
 * STOP HERE FOR A B
 * 
 * 2. Modify #2 so that it only accepts values between 1 and 10 (inclusive).
 *    If the number is too high or low, give a message telling the user to 
 *    enter a valid number
 * STOP HERE FOR A B+
 * 
 * 3. Modify your code so that it keeps track of the number of guesses. When
 *    the correct number is guessed, report out the number of tries.
 * STOP HERE FOR AN A-
 * 
 * 4. Give the player feedback about their guess. If the guess is within 2, 
 *    say "Very close!" (or something similar). If the guess is more than 5 off, 
 *    say "Way off!" (or something similar)
 * STOP HERE FOR AN A+
 */

//SAMPLE USAGE: B
/**
 * The magic number is 9. Shh! Don't tell anyone
 * Enter a guess:
 * 2
 * Enter a guess:
 * 9
 */

//SAMPLE USAGE: B+
/**
 * The magic number is 10. Shh! Don't tell anyone
 * Enter a guess:
 * -1
 * Enter a number between 0 and 10!
 * Enter a guess:
 * 11
 * Enter a number between 0 and 10!
 * Enter a guess:
 * 10
 */

//SAMPLE USAGE: A-
/**
 * The magic number is 10. Shh! Don't tell anyone
 * Enter a guess:
 * 7
 * Enter a guess:
 * 2
 * Enter a guess:
 * 10
 * It took you 3 guesses.
 */

//SAMPLE USAGE: A+
/**
 * The magic number is 2. Shh! Don't tell anyone
 * Enter a guess:
 * 10
 * Way off!
 * Enter a guess:
 * 3
 * Very close!
 * Enter a guess:
 * 2
 * It took you 3 guesses.
 */

public class App {
    public static void main(String[] args) throws Exception {
        // DO NOT TOUCH THE THREE LINES BELOW
        int magicNumber = getMeARandomNumber();
        System.out.println("The magic number is " + magicNumber + ". Shh! Don't tell anyone");
        Scanner reader = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.println("Enter a guess:");
            int input = Integer.valueOf(reader.nextLine());
            count++;
            if(input > 10 || input < 1){
                System.out.println("Enter a number between 0 and 10!"); 
            }
            if (input == magicNumber) {
            System.out.println("It took you " + count + " guesses.");
            break;
            }
        }
    }

    // Do not modify!!!
    public static int getMeARandomNumber() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
}
