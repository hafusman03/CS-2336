// 9/18/2022
// Geometry
import java.util.Scanner;
public class Geometry 
{
    
    public static void main(String[] args)
    {
        System.out.printf("r1's center x-, y-coordinates, width, and height: ");

        Scanner input = new Scanner(System.in);

        // rectangles
        double r1X = input.nextDouble();
        double r1Y = input.nextDouble();
        double r1W= input.nextDouble();
        double r1H = input.nextDouble();

        double r1X1 = r1X - (r1W / 2);
        double r1Y1 = r1Y - (r1H / 2);
        double r1XN = r1X1 + r1W;
        double r1YN = r1Y1 + r1H;
        
        System.out.printf("\nr2's center x-, y-coordinates, width, and height: ");

        double r2X = input.nextDouble();
        double r2Y = input.nextDouble();
        double r2W= input.nextDouble();
        double r2H = input.nextDouble();

        
        double r2X1 = r2X - (r2W / 2);
        double r2Y1 = r2Y - (r2H / 2);
        double r2XN = r2X1 + r2W;
        double r2YN = r2Y1 + r2H;
        
       
        // overlaps, inside, outside
        if((r2X1 < r1X1) && (r2X1 < r1XN) && (r2XN > r1X1) && (r2XN < r1XN)) // overlaps
        {
            
            if((r2Y1 < r1Y1) && (r2Y1 < r1YN) && (r2YN > r1Y1) && (r2YN < r1YN))  
            {
                //System.out.println("Hiiiiiii");
                System.out.println("r2 overlaps r1");
                return;
            }
            if((r2Y1 >= r1Y1) && (r2Y1 < r1YN) && (r2YN > r1Y1) && (r2YN <= r1YN))
            {
                System.out.println("r2 overlaps r1");
                return;
            }
            if((r2Y1 > r1Y1) && (r2Y1 < r1YN) && (r2YN > r1Y1) && (r2YN > r1YN))
            {
                System.out.println("r2 overlaps r1");
                return;
            }

        }

        // overlaps, inside, outside
        if((r2X1 >= r1X1) && (r2X1 < r1XN) && (r2XN > r1X1) && (r2XN <= r1XN)) // overlaps or inside 
        {
            if((r2Y1 < r1Y1) && (r2Y1 < r1YN) && (r2YN > r1Y1) && (r2YN < r1YN))  
            {
                System.out.println("r2 overlaps r1");
                return;
            }
            if((r2Y1 >= r1Y1) && (r2Y1 < r1YN) && (r2YN > r1Y1) && (r2YN <= r1YN))
            {
                System.out.println("r2 is inside r1");
                return;
            }
            if((r2Y1 > r1Y1) && (r2Y1 < r1YN) && (r2YN > r1Y1) && (r2YN > r1YN))
            {
                System.out.println("r2 overlaps r1");
                return;
            }
        }

        // overlaps, inside, outside
        if((r2X1 > r1X1) && (r2X1 < r1XN) && (r2XN > r1X1) && (r2XN > r1XN)) // overlaps
        {
            if((r2Y1 < r1Y1) && (r2Y1 < r1YN) && (r2YN > r1Y1) && (r2YN < r1YN))  
            {
                System.out.println("r2 overlaps r1");
                return;
            }
            if((r2Y1 >= r1Y1) && (r2Y1 < r1YN) && (r2YN > r1Y1) && (r2YN <= r1YN))
            {
                System.out.println("r2 overlaps r1");
                return;
            }
            if((r2Y1 > r1Y1) && (r2Y1 < r1YN) && (r2YN > r1Y1) && (r2YN > r1YN))
            {
                System.out.println("r2 overlaps r1");
                return;
            }
        }
        // no overlap
        System.out.println("r2 does not overlap r1");

    }
}
