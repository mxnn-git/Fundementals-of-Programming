package W05;

// @author 25054912@siswa.um.edu.my

import java.util.Random;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        
        Random dice = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int player1Score = 0;
        int player2Score = 0;
        int currentPlayer = 1;
        
        final int WINNING_SCORE = 100;
        
        System.out.println("First player to get over " + WINNING_SCORE + " points wins.");
        System.out.println("If you roll a 6, you get to roll again!");
        
        while (player1Score <= WINNING_SCORE && player2Score <= WINNING_SCORE) {
            
            System.out.println("\nPlayer " + currentPlayer + "'s Turn");
            System.out.println("Current score: Player 1: " + player1Score + " | Player 2: " + player2Score);
            System.out.print("Press Enter to roll the dice...");
            scanner.nextLine();
            
            boolean rollAgain = true;
            
            while (rollAgain) {
                
                int roll = dice.nextInt(6) + 1;
                System.out.println("\nPlayer " + currentPlayer + " rolled a " + roll);
                
                if (currentPlayer == 1)
                    player1Score += roll;
                else
                    player2Score += roll;
                
                if (player1Score >= WINNING_SCORE) {
                    
                    System.out.println("\nPlayer 1 WINS!");
                    rollAgain = false; 
                    break; 
                    
                }
                if (player2Score >= WINNING_SCORE) {
                    
                    System.out.println("\nPlayer 2 WINS!");
                    rollAgain = false;
                    break; 
                    
                }
                
                if (roll == 6){
                    
                    System.out.println("\nYou rolled a 6! You get to roll again.");
                    System.out.print("Press Enter to roll again...");
                    scanner.nextLine();
                    rollAgain = true;
                    
                } else
                    rollAgain = false;
                
            } 
            
            if (player1Score <= WINNING_SCORE && player2Score <= WINNING_SCORE) {
                
                if (currentPlayer == 1)
                    currentPlayer = 2;
                else
                    currentPlayer = 1;
                
            }
            
        }
        
        System.out.println("--- Game Over ---");
        System.out.println("Final Score: Player 1: " + player1Score + " | Player 2: " + player2Score);
    }
    
}
