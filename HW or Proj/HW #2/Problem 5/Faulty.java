
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
 *                                     Faulty                                     *
 *_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ *

 + officeHrs: int                                                                 *
 
 + rank: int                                                                      * 
 -----------------------------------------------------------------------------------
 + Faulty()                                                                       *

 + Faulty(officeHrs: int, rank: int)                                              *
 
 + toString(): String                                                             * 
 **********************************************************************************/

public class Faulty extends Employee 
{
    int officeHrs, rank;
    public Faulty()
    {}

    public Faulty(int officeHrs, int rank)
    {
        this.officeHrs = officeHrs;
        this.rank = rank;
    }

    @Override
    public String toString()
    {
        return "These are He/She's office hours and rank: " +officeHrs+ " "+rank;
    }

}
