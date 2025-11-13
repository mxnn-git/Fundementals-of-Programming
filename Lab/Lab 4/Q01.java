package W05;

// @author 25054912@siswa.um.edu.my

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an Integer: ");
        int n = scanner.nextInt();
        
        System.out.printf("The factors of %d are: ", n);
        
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    System.out.print(i + ", ");
            }
        } else if (n < 0) {
            int absN = Math.abs(n);
            for (int i = 1; i <= absN; i++) {
                if (absN % i == 0) 
                    System.out.print("-" + i + " ");
            }
        } else
            System.out.println("Invalid: 0 has no factors!");
        
        scanner.close();
    }
}
