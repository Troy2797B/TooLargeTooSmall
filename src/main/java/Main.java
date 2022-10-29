import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
//Write a guessing game which prompts a user to guess a mystery number within some range.
    //Display either "too large", "too small", "correct guess", respectively
    //upon the end of the game, the program should display the number of guesses before being right
    //a number that is input consecutively, should register as a single guess

    //below I am making variables for the number of guesses, the mystery number, and the user input
    static int numberOfGuesses;
    static boolean notEqual;
    static int mysteryNumber;

    public Main(int numberOfGuesses, boolean notEqual){
        this.numberOfGuesses = numberOfGuesses;
        this.notEqual = notEqual;
    }

    public static int getMysteryNumber(){
        int max = 10;
        int min = 1;
        int range = max - min+1;
        mysteryNumber = (int)(Math.random() * range + min);
        return mysteryNumber;
    }

    public static boolean areTheyEqual(int mysteryNumber, int yourInput){
        if (mysteryNumber == yourInput){
            return true;
        } else {
            return false;
        }
    }

        //A loop that checks if notEqual is true and increments numberOfGuesses




    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int yourInput = myObj.nextInt();
        mysteryNumber = getMysteryNumber();
        notEqual = false;
        while (!areTheyEqual(mysteryNumber, yourInput)) {
            numberOfGuesses++;

            if (mysteryNumber < yourInput) {
                System.out.print("too large");
            } else if (mysteryNumber > yourInput) {
                System.out.print("too small");
            } else {
                System.out.print("correct guess");
            }
            System.out.println(numberOfGuesses);
            break;
        }
    }
}
