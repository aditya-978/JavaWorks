package Assignment.Games;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Game game = new Game();
        game.takeUserInput();
        while(game.isCorrectNumber()){
            game.takeUserInput();
        }
    }
}
class Game{
    int computerGuess, userGuess, noOfGuesses;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

//    public void setNoOfGuesses(int noOfGuesses) {
//        this.noOfGuesses = noOfGuesses;
//    }

    Game(){
        Random random = new Random();
        computerGuess = random.nextInt(100);
//        System.out.println(computerGuess);
    }

    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        userGuess = sc.nextInt();
    }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if(userGuess == computerGuess){
            System.out.println("Correct! You guessed the number in: "+ noOfGuesses+" attempt.");
            return false;
        }
        else if (userGuess<computerGuess) {
            System.out.println("Your input is smaller than the computer. Guess again.");
        } else {
            System.out.println("Your input is greater than the computer. Guess again.");
        }
        return true;
    }
}
