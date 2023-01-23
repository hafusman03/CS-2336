public class TestStock
{

    public static void main(String[] args)
    {
        Stock stock1 = new Stock("ORCL", "Oracle Coporation", 34.5);
        stock1.setCurrentPrice(30.35);
        
        System.out.printf("The percentage change from the previous price to the current price is %.2f", stock1.getPercentageChange());
    }
}