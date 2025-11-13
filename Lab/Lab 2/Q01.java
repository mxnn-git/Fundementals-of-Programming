package com.um;

import java.util.Scanner;

public class L02Q01 {
    public static void main (String[] args) {
            Scanner k = new Scanner(System.in);
            double f, c;
            System.out.print("Enter the temperature in Fahrenheit: ");
            f = k.nextDouble();
            c = (f-32)/1.8;
            System.out.printf("The temperature converted to Celcius is %.2f\n", c);
    }
}
