package W05;

// @author 25054912@siswa.um.edu.my

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principle amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter interest in (%): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter total number of month(s): ");
        int months = scanner.nextInt();

        // Formula for monthly payment
        double monthlyPayment = (principal * rate / 1200) / (1 - Math.pow(1 + rate / 1200, -months));
        
        double balance = principal;
        double totalInterest = 0;

        System.out.println("\nMonth\t\tMonthly Payment\t\tPrincipal\tInterest\tUnpaid Balance\t\tTotal Interest");

        for (int j = 1; j <= months; j++) {
            double interest = balance * rate / 1200;
            double monthlyPrincipal = monthlyPayment - interest;
            
            balance -= monthlyPrincipal;
            
            totalInterest += interest;
            
            if (balance < 0.01)
                balance = 0;
            
            System.out.printf("%d\t\t%.2f\t\t\t%.2f\t\t%.2f\t\t%.2f\t\t\t%.2f\n", j, monthlyPayment, monthlyPrincipal, interest, balance, totalInterest);
        }

        scanner.close();
    }
}
