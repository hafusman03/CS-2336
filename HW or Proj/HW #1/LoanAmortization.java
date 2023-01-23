// 9/18/2022
import java.util.Scanner;
public class LoanAmortization
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // String heading1 = "Exam_Name";
        // String heading2 = "Exam_Grade";

       
        // user input
        System.out.printf("Loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.printf("Number of Years: ");
        int numOfYears = input.nextInt();

        System.out.printf("Annual Interest Rate: ");
        double annualIntRate = input.nextDouble();

        // Formula
        double monthlyInterestRate = (annualIntRate / 100) / 12;
        
        int numOfPayment = numOfYears * 12;

        
        double tMP =  loanAmount * ((monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numOfPayment)) / (Math.pow((1 + monthlyInterestRate), numOfPayment) - 1));
        double totalPayment = tMP * 12;

        // payments
        System.out.printf("Monthly Payment: %.2f", tMP);
        System.out.printf("\nTotal Payment: %.2f", totalPayment);

        System.out.println("\n");
        System.out.printf( "%-15s %15s %15s %15s %n", "Payment#", "Interest", "Principal", "Balance");

        double balance = loanAmount;

        // schedule
        for(int i = 0;  i < numOfPayment; i++)
        {
            double interest = balance * monthlyInterestRate;
            double principal = tMP - interest;

            balance -= principal;

            System.out.printf( "%-15s %15.5s  %15.6s  %15.7s  %n", i + 1, interest, principal, balance);
        }
    }
}
