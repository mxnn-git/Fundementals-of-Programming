package com.um;

import java.util.Random;

public class L02Q05 {
    public static void main (String[] args) {
        Random r = new Random();
        
        int randomNum = r.nextInt(10001);
        System.out.println("Random number generated: " + randomNum);
        
        int sum = 0;
        while (randomNum > 0) {
            sum += randomNum % 10;
            randomNum /= 10;
        }
        
        System.out.println("The sum of the digits of the random number: " + sum);
    }
}
