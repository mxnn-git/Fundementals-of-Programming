package com.um.w04l03;

/**
 * @author 25054912
 */

import java.util.Scanner;

public class Q03 {
    
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        
        System.out.print("Enter the sales volume: ");
        int sales = k.nextInt();
        
        if (sales <= 100) 
            System.out.println("Total commission: " + (sales * 0.05));
        else if (sales > 100 && sales <= 500) 
            System.out.println("Total commission: " + (sales * 0.075));
        else if (sales > 500 && sales <= 1000)
            System.out.println("Total commission: " + (sales * 0.1));
        else if (sales > 1000)
            System.out.println("Total commission: " + (sales * 0.125));
        else
            System.out.println("Insufficient sales.");
        
        
        k.close();
    }
}
