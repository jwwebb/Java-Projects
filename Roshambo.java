package roshambo;

import java.util.Scanner;
import java.util.Random;

public class Roshambo {

    public static void main(String[] args) {
        
        //declare variables
        int userpick;
        int computerpick;
        
        //prompt user for choice
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Select an option:\n(1)Rock (2)Scissors (3)Paper\n");
        userpick = keyboard.nextInt();
        
        //display user's choice
        switch(userpick) {            
            case 1:
                System.out.println("You chose: Rock");
                break;
            case 2:
                System.out.println("You chose: Scissors");
                break;
            case 3: 
                System.out.println("You chose: Paper");
                break;
            default:
                System.out.println("Invalid Choice.");
                return;
        }               
        
        //get computer's choice
        Random compPick = new Random();
        computerpick = compPick.nextInt(3) + 1;
        
        //display computer's choice
        switch(computerpick) {
            case 1:
                System.out.println("The computer chose: Rock");
                break;
            case 2:
                System.out.println("The computer chose: Scissors");
                break;
            case 3: 
                System.out.println("The computer chose: Paper");
                break;
        }
        
        //deciding the game's outcome
        if (userpick == computerpick)
            System.out.println("It's a draw.");
        
        else if (userpick == 1 && computerpick == 2)
            System.out.println("Rock beats Scissors, You Win!");
        
        else if (userpick == 1 && computerpick == 3)
            System.out.println("Paper bears Rock, You Lose :(");
        
        else if (userpick == 2 && computerpick == 1)
            System.out.println("Rock beats Scissors, You Lose :(");
        
        else if (userpick == 2 && computerpick == 3)
            System.out.println("Scissors beats Paper, You Win!");
        
        else if (userpick == 3 && computerpick == 1)
            System.out.println("Paper beats Rock, You Win!");
        
        else if (userpick == 3 && computerpick == 2)
            System.out.println("Scissors beats Paper, You Lose :(");
                
    }
    
}
