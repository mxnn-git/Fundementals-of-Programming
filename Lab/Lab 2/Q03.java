package com.um;

import java.util.Random;

public class L02Q03 { 
    public static void main (String[] args) {
        Random r = new Random();
        
        double randomNum01 = (r.nextDouble()*40) + 10;
        double randomNum02 = (r.nextDouble()*40) + 10;
        double randomNum03 = (r.nextDouble()*40) + 10;
        System.out.printf("The three random numbers generated are: %.2f %.2f and %.2f\n", randomNum01, randomNum02, randomNum03);
        
        double sum = randomNum01 + randomNum02 + randomNum03;
        System.out.printf("The sum of the three random numbers is: %.2f\n", sum);
        
        double average = (randomNum01 + randomNum02 + randomNum03) / 3;
        System.out.printf("The average of the three random numbers is: %.2f\n", average);
    }
}
