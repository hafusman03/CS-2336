// 9/18/2022
// Business
import java.util.Scanner;
public class Business 
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the first 9 digits of an ISBN as an integer");
        int ISBN9 = input.nextInt();

        int checksum = 0;
        int placeVal = 1000000000;
        for(int i = 1; i <= 9; i++)
        {
        int reduced = ISBN9 % placeVal;
        placeVal /= 10;
        int digit = reduced / placeVal;

        checksum += digit * i ;

        }
        checksum %= 11;
        int ISBN10 = ISBN9 * 10 + checksum;
        
        String paddedChecksum = String.format("%02d", ISBN10);
        System.out.println("The ISBN-10 number is " + paddedChecksum);

        //int debug = IBSN9 % 10000000;
        //System.out. println((IBSN9 % 100000000) / 10000000);

    }
    
}
