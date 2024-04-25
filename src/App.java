import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Principle: ");
            int principle = scanner.nextInt();
            System.out.print("Annual Interest Rate Percentage: ");
            float rate = scanner.nextFloat();
            double monthlyInterest = rate / PERCENT / MONTHS_IN_YEAR;
            System.out.print("Loan Term (Years): ");
            byte loanLength = scanner.nextByte();
            int numberOfPayments = loanLength * MONTHS_IN_YEAR;
            double result = principle * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments)) / (Math.pow(1+monthlyInterest, numberOfPayments) -1);
            String mortgageFormatted = NumberFormat.getCurrencyInstance().format(result);
            System.out.print("Monthly Payments = " + mortgageFormatted);
        }
    }
}
