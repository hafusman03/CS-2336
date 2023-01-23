public class TestRectangle
{
    public static void main(String[] args)
    {
        Rectangle rect1 = new Rectangle(4,40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        System.out.println("The width of rect1 is " + rect1.width + ". \nThe height of rect1 is " + rect1.height + ". \nThe area and perimeter is "+rect1.getArea()+" and "+ rect1.getPerimeter()
        +".");
        System.out.println("The width of rect2 is " + rect2.width + ". \nThe height of rect2 is " + rect2.height + ". \nThe area and perimeter is "+rect2.getArea()+" and "+ rect2.getPerimeter()
        +".");

    }
}
