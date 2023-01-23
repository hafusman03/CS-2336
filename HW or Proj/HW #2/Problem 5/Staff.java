
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
 *********************************************************************************
                                         |
                                         |
                                         v
 **********************************************************************************
 *                                     Staff                                      *
 *_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ *

 + title: String                                                                  *
  -----------------------------------------------------------------------------------
 + Faulty()                                                                       *

 + Faulty(title: String)                                                          *
 
 + toString(): String                                                             * 
 **********************************************************************************/

public class Staff extends Employee 
{
    String title;
    public Staff()
    {}

    public Staff(String title)
    {
        this.title = title;
    }

    @Override
    public String toString()
    {
        return "This is He/She's title " +title;
    }

}
