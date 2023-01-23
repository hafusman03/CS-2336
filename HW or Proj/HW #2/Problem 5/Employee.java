/**********************************************************************************
 *                                      Person                                    *
 *_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ *

 + name: String                                                                   *
 
 + address: String                                                                * 
 
 + phone: String                                                                  * 
 
 + emailAddress: String                                                           * 
-----------------------------------------------------------------------------------
 + Person()                                                                       *

 + Person(name: String, address: String, phone: String, emailAddress: String)     *
 
 + toString(): String                                                             * 
 **********************************************************************************
                                         |
                                         |
                                         v
 **********************************************************************************
 *                                     Employee                                   *
 *_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ *

 + office: String                                                                 *
 
 + salary: double                                                                 * 
 
 + dateHired: MyData                                                              * 
-----------------------------------------------------------------------------------
 + Employee()                                                                     *

 + Employee(office: String, salary: double, dateHired: MyDate)                    *
 
 + toString(): String                                                             * 
 **********************************************************************************/
public class Employee extends Person 
{
    public String office;
    public Double salary;
    public MyDate dateHired;

    public Employee()
    {}

    Employee(String office, double salary, MyDate dateHired)
    {
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString()
    {
        return name + " lives at "+address+". He/She('s) phone number is "+phone+". Also he/she('s) email address is "+emailAddress+ "He/She('s) office is "+office+" and is paid $" +salary;
    }

}
