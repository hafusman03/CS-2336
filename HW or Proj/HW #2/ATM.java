import java.util.Scanner;
public class ATM
{
    public static void main(String[] args)
    {
        Account[] accounts = new Account[10];
        
        accounts[0] = new Account(0,1000);
        accounts[1] = new Account(1,1000);
        accounts[2] = new Account(2,1000);
        accounts[3] = new Account(3,1000);
        accounts[4] = new Account(4,1000);
        accounts[5] = new Account(5,1000);
        accounts[6] = new Account(6,1000);
        accounts[7] = new Account(7,1000);
        accounts[8] = new Account(8,1000);
        accounts[9] = new Account(9,1000);
        
        Scanner input = new Scanner(System.in);

        int currID;
        while(true)
        {  
            do
            {
                System.out.printf("Enter an account ID: ");
                int id = input.nextInt();

                currID = id;
                if(id >= 0 && id < 10)
                {
                    break;
                }
            }while(true);

            do
            {
                System.out.println("\n1: Current Balance");
                System.out.println("2: Withdraw Money");
                System.out.println("3: Desposit Money");
                System.out.println("4: Exit");
                System.out.printf("Enter a choice 1 to 4: ");

                int choice = input.nextInt();

                if( choice == 4)
                {
                    break;
                }

                else if(choice == 1)
                {
                    System.out.printf("\nThe current balance of account "+currID+" is "+ accounts[currID].getBalance());
                }

                else if(choice == 2)
                {
                    System.out.printf("\nHow much would you like withdraw: ");
                    double amount = input.nextDouble();

                    accounts[currID].withdraw(amount);
                    System.out.printf("\nThe current balance of account "+currID+" is now "+ accounts[currID].getBalance());
                }

                else if(choice == 3)
                {
                    System.out.printf("\nHow much would you like deposit: ");
                    double amount = input.nextDouble();

                    accounts[currID].deposit(amount);
                    System.out.printf("\nThe current balance of account "+currID+" is now "+ accounts[currID].getBalance());
                }
        
            }while(true);
        }
    }

}
