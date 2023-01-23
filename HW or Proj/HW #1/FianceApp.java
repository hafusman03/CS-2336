import java.util.Scanner;
public class FianceApp
{
    
    // main
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double monthlySave;
        double annualInterestRate = 0.00417;

        System.out.printf("Enter the monthly saving amount: ");
        monthlySave = input.nextDouble();
        
        double accountValue = 0;

        // accountValue
        for(int i = 1; i <= 6; i++)
        {
            accountValue = (monthlySave + accountValue) * (1 + annualInterestRate);
        }

        System.out.println("After the sixth month, the account value is $" + accountValue);
    }
    
    
}