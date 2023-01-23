// Pyramaid
public class Pyramid 
{
    public static void main(String[] args)
    {
        // for rows
        for(int i = 0; i < 9; i++)
        {
            // left adjust
            for(int j = 3 * (8 - i); j > 0; j--)
            {
                System.out.print(" ");
            }

            // powers of two counting up
            for(int j = 0; j < i; j++)
            {
                if(j >= 4)
                    System.out.print((int)(Math.pow(2,j))+ " ");
                else
                    System.out.print((int)(Math.pow(2,j))+ "  ");
            }

            // powers of two counting downs
            for(int j = i - 2; j >= 0; j--)
            {
                if(j >= 4)
                    System.out.print((int)(Math.pow(2,j))+ " ");
                else
                    System.out.print((int)(Math.pow(2,j))+ "  ");
            }
            System.out.print("\n");
        }
    }
    
}
