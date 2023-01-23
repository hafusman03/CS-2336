/******************************************************************
 *                           Stock                                *
 *_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ *

 * symbol: String                                                *
 
 * name: String                                                  * 
 
 * previousClosingPrice: double                                  * 
 
 * currentPrice: double                                          * 
------------------------------------------------------------------
 * Stock(newSymbol: String, newName: String, newPCP: double)     *
 
 * setCurrentPrice(newCurrentPrice: double)                      *
 
 * getPercentageChange(): double                                 *
 
 *****************************************************************/

class Stock 
{
    String symbol, name;
    double previousClosingPrice, currentPrice;

    Stock(String newSymbol, String newName, double newPCP)
    {
        symbol = newSymbol;
        name = newName;
        previousClosingPrice = newPCP;
       
    }

    void setCurrentPrice(double newCurrentPrice)
    {
        currentPrice = newCurrentPrice;
    }
    double getPercentageChange()
    {
        double ratioOfPrev = currentPrice / previousClosingPrice;
        double ratioOfPercentChange = 1 - ratioOfPrev;
        double percentageChange  = ratioOfPercentChange * 100;
        return percentageChange;
    }
}
