/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2ex2;

/**
 *
 * @author MUON
 */
import java.util.Scanner;
public class Q2Ex2 {
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String startup;
        int range = 5;
        int defaultGuess = 2;
        int guessCount;
        do {
            System.out.println("Welcome to Higher or Lower! What would you want to do? Type in the number of your choice! \n[1] Start playing \n[2] Change game settings \n[3] Quit game");
            startup = sc.nextLine();
            switch(startup) {
                case "1": 
                    int random = (int) Math.floor(Math.random()*range) + 1;
                    System.out.println("The number is set! Make your guess!");
                    for(guessCount = defaultGuess; guessCount >= 0; guessCount--){
                        String guess = sc.nextLine();
                        int trial = Integer.parseInt(guess);
                        if(random > trial){
                            if(guessCount == 0) {System.out.println("You lost...");}
                            else{System.out.printf("Sorry, guess higher! you have %s guesses left! Go again! \n", guessCount);}                        
                        }
                        else if(random < trial) {
                            if(guessCount == 0) {System.out.println("You lost...");}
                            else{System.out.printf("Sorry, guess lower! you have %s guesses left! Go again! \n", guessCount);}
                        }
                        else if(random == trial) {System.out.println("Congratulations! You got it!");}
                    }
                    break;
                
                case "2": 
                    System.out.println("How many guesses would you like to use?");
                    defaultGuess = sc.nextInt();
                    guessCount = defaultGuess;
                    defaultGuess -= 1;
                    System.out.println("What will be the highest possible number you can guess?");
                    int newrange = sc.nextInt();
                    range = newrange;
                    range -= 1;
                    break;
            
                case "3": 
                    System.out.println("See you next time!");
                    break;
            }
                    
        
        } while(!startup.equals("3"));
    } 
        
        
}
