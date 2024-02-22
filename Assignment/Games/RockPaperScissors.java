package Assignment.Games;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rounds you wish to play: ");
        int numberOfTimes = sc.nextInt();

        int userTotal = 0, compTotal = 0;

        while(numberOfTimes != 0){
            System.out.print("Enter 0 for rock, 1 for paper, 2 for scissors: ");
            int userInput = sc.nextInt();

            if(userInput == 0 || userInput == 1 || userInput == 2){
                Random random = new Random();
                int computerInput = random.nextInt(3);
                System.out.println("Computer Input "+computerInput);

                if (computerInput == userInput) {
                    System.out.println("Game draw for this round!");
                    userTotal++; compTotal++; numberOfTimes--;
                }
                else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1){
                    System.out.println("You win the round!");
                    userTotal+=2; numberOfTimes--;
                }
                else {
                    System.out.println("You lost the round!");
                    compTotal+=2; numberOfTimes--;
                }
            } else {
                System.out.println("Wrong User Input.");
            }
        }
        System.out.println("Points scored by user: "+ userTotal);
        System.out.println("Points scored by computer: "+ compTotal);

        if(userTotal > compTotal){
            System.out.println("You win the game.");
        } else if(userTotal < compTotal){
            System.out.println("Computer win the game.");
        }
        else {
            System.out.println("Game Draw.");
        }
    }
}
