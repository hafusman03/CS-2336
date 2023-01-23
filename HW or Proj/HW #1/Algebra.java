// 9/18/2022
// Alegbra
import java.util.Scanner;
public class Algebra 
{
    public static void main(String[] args)
    {
        System.out.printf("Enter a, b, c: ");

        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        //System.out.println(a +" "+ b +" "+ c);

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double r1, r2;
        final double EPSILON = 1E-14;

        if(discriminant > EPSILON)
        {
            b *= -1;
            r1 = (b + Math.pow(discriminant, 0.5)) / (2*a);
            r2 = (b - Math.pow(discriminant, 0.5)) / (2*a);
            System.out.println("The equation had two roots: " + r1 +" "+ r2);
        }

        else if(discriminant < -EPSILON)
        {
            System.out.println("The equation has no real roots.");
             
        }

        else 
        {
            b *= -1;
            r1 = (b + Math.pow(discriminant, 0.5)) / (2*a);
            System.out.println("The equation had one root: " + r1);
        }

       // System.out.println(discriminant);

    }
}
