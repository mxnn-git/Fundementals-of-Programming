package com.um.w04l03;

/**
 * @author 25054912
 */

import java.util.Scanner;

public class Q05 {
    
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        
        double a, b, c, d, e, f;
        System.out.print("Enter the value of a: ");
        a = k.nextDouble();
        System.out.print("Enter the value of b: ");
        b = k.nextDouble();
        System.out.print("Enter the value of c: ");
        c = k.nextDouble();
        System.out.print("Enter the value of d: ");
        d = k.nextDouble();
        System.out.print("Enter the value of e: ");
        e = k.nextDouble();
        System.out.print("Enter the value of f: ");
        f = k.nextDouble();
        
        if ( ( (a*d)-(b*c) ) == 0) {
            System.out.println("The equation has no solution.");
        } else {
            double x = ((e*d)-(b*f))/((a*d)-(b*c));
            System.out.printf("The value of x is %.3f %n",x);
            double y = ((a*f)-(e*c))/((a*d)-(b*c));
            System.out.printf("The value of y is %.3f", y);
        }
        
        k.close();
    }
}
