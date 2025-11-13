package W05;

// @author 25054912@siswa.um.edu.my

import java.util.Scanner;

public class Q03 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double score = 0;
        double inputValue;
        double min = 10000;
        double max = 0;
        int totalInput = 0;
        double scoreSquared = 0;
        
        do {
            
            System.out.print("Enter a score [negative score to quit]: ");
            inputValue = scanner.nextDouble();
            
            if (inputValue < min && inputValue >= 0)
                min = inputValue;
            else if (inputValue > max)
                max = inputValue;
            
            if (inputValue >= 0) {
                score += inputValue;
                scoreSquared += Math.pow(inputValue, 2);
                totalInput++;
            }
            else {
                break;
            }
            
        } while (inputValue >= 0);
        
        System.out.printf("Total score: %.2f", score);
        
        double standardDeviation = Math.sqrt( (scoreSquared - (Math.pow(score, 2)/totalInput)) / (totalInput - 1) );
        
        System.out.printf("\nMinimum value: %.2f", min);
        System.out.printf("\nMaximum value: %.2f", max);
        
        double averageScore = score / totalInput;
        
        System.out.printf("\nAverage: %.2f", averageScore);
        
        System.out.printf("\nStandard Deviation: %f", standardDeviation);
        
        scanner.close();
    }
}
