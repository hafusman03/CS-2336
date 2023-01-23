/******************************************************************
 *                              Account                           *
 *_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ *

 * -id: int                                                       *

 * -balance: double                                               *
 
 * -annualInterestRate: double                                    * 
-------------------------------------------------------------------
 * +Account()                                                     * 
 
 * +Account(id: int, balance: double, annualInterestRate: double) * 

 * +getId(): int                                                  *
  
 * +getId(): int                                                  *

 * +getBalance(): double                                          *
 
 * +getAnnualInterestRate(): double                               *
 
 * +getDateCreated(): String                                        *
 
 * +setId()                                                       *
 
 * +setBalance()                                                  *

 * +setAnnualInterestRate()                                       *
                                      
 * +getMonthlyInterestRate(): double                              *
                          
 * +getMonthlyInterest(): double                                  *
 
 * +withdraw(amount: double)                                      *
 
 * +deposit(amount: double)                                       *
 *****************************************************************/

import java.util.Date;
public class Account
{
   
    private int id  = 0;
    private double balance,annualInterestRate = 0;
    private Date dateCreated = new Date();
    

    public Account()
    {}

    public Account(int id, double balance)
    {
        this.id = id;
        this.balance = balance;
    }

    public int getId()
    {
        return id;
    }

    public double getBalance()
    {
        return balance;
    }

    public double getAnnualInteresteRate()
    {
        return annualInterestRate ;
    }

    public String getDateCreated()
    {
        return dateCreated.toString();
    }

    public void setId(int id)
    {
        id = this.id;
    }

    public void setBalance(double balance)
    {
        balance = this.balance;
    }

    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate()
    {
        return annualInterestRate / 12.0;
    }

    public double getMonthlyInterest()
    {
        return (balance * getMonthlyInterestRate()) * 100;
    }
    
    public void withdraw(double amount)
    {
        balance -= amount;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

   
    
    
}
