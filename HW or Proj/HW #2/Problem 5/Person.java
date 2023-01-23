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
 *********************************************************************************/
public class Person {
    
    public String name;
    public String address;
    public String phone;
    public String emailAddress;

    public Person()
    {}

    public Person(String name, String address, String phone, String emailAddress)
    {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.emailAddress = emailAddress;
    }

    public String toString()
    {
        return name + " lives at "+address+". He/She('s) phone number is "+phone+". Also he/she('s) email address is "+emailAddress;
    }

}
