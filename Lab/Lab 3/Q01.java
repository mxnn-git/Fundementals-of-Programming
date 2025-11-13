package com.um.w04l03;

/**
 * @author 25054912
 */

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        
        System.out.print("Enter the first integer: ");
        int num1 = k.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = k.nextInt();
        System.out.print("Enter the operator (+, -, *, /, %): ");
        char op = k.next().charAt(0);
        
        switch (op) {
            case ('+') -> System.out.println("Addition product: " + (num1 + num2));
            case ('-') -> System.out.println("Subtraction product: " + (num1 - num2));
            case ('*') -> System.out.println("Multiplication product: " +(num1 * num2));
            case ('/') -> System.out.println("Division product: " + (num1 / num2));
            case ('%') -> System.out.println("Modulus product: " + (num1 % num2));
            default -> System.out.println("Invalid operator!");
        }
        
        k.close();
    }
}
