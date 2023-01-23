public class TestAccount
{
    public static void main(String[] args)
    {
        Account account1 =  new Account(1122, 20000);
        String dateCreated = account1.getDateCreated();
        account1.setAnnualInterestRate(4.5);
        account1.withdraw(2500);
        account1.deposit(3000);

        
        System.out.println("The date the account was created is " +dateCreated+ ".");
        System.out.printf("The balance in the account is %.2f", account1.getBalance());
        System.out.printf("\nThe monthly interest is %.2f", account1.getMonthlyInterestRate());


    }
}
