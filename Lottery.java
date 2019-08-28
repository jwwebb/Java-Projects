package lottery;

import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
        
        //create a lottery number
        
        int lottery = (int)(Math.random() * 1000);
        
        //prompt the user to guess a number
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter 3 digits for your guess at the lottery number: ");
        
        int guess = input.nextInt();
        
        //get digits from lottery
        
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = lottery /10 % 10;
        int lotteryDigit3 = lottery % 10;
        
        //get digits from guess
        
        int guessDigit1 = guess / 100;
        int guessDigit2 = guess / 10 %10;
        int guessDigit3 = guess % 10;
        
        System.out.println("The lottery number is: " + lottery);
        
        //check the guess
        if (guess == lottery)
            
            System.out.println("Exact match! You win $10,000");
        
        else if (guessDigit3 == lotteryDigit1
                
            && guessDigit2 == lotteryDigit2
                
            && guessDigit1 == lotteryDigit3
                
            || guessDigit3 == lotteryDigit3
                
            && guessDigit2 == lotteryDigit2
                
            && guessDigit1 == lotteryDigit1
                
            || guessDigit3 == lotteryDigit2
                
            && guessDigit2 == lotteryDigit3
                
            && guessDigit1 == lotteryDigit1
                
            || guessDigit3 == lotteryDigit3
                
            && guessDigit2 == lotteryDigit1
                
            && guessDigit1 == lotteryDigit2)
            
            System.out.println("Partial match, You win $3,000");
        
        else if (guessDigit1 == lotteryDigit1
                
            || guessDigit1 == lotteryDigit2
                
            || guessDigit1 == lotteryDigit3
                
            || guessDigit2 == lotteryDigit1
                
            || guessDigit2 == lotteryDigit2
                
            || guessDigit2 == lotteryDigit3
                
            || guessDigit3 == lotteryDigit1
                
            || guessDigit3 == lotteryDigit2
                
            || guessDigit3 == lotteryDigit3)
            
            System.out.println("You matched at least one number, You win $1,000");
        
        else
            
            System.out.println("Sorry, there was no match.");
        
    }
    
}