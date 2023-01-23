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
 *                                     Student                                    *
 *_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ *

 * CLASS_STATUS: String                                                           *
-----------------------------------------------------------------------------------
 + Student()                                                                      *

 + Student(status: String)                                                        *
 
 + toString(): String                                                             * 
 **********************************************************************************
 */
public class Student extends Person
{
    final String CLASS_STATUS;
    
    public Student()
    {
        CLASS_STATUS = "Freshman";
    }

    public Student(String status)
    {
        CLASS_STATUS = status;
    }

    @Override
    public String toString()
    {
        return name + " lives at "+address+". He/She('s) phone number is "+phone+". Also he/she('s) email address is "+emailAddress+ "He/She is a "+CLASS_STATUS;
    }

}

