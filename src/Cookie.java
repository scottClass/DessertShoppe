/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author Scott
 */
public class Cookie extends DessertItem{
    private String name;
    private int number;
    private int pricePer12;
    
    private DessertShoppe d = new DessertShoppe();
    
    public Cookie(String name, int number, int pricePer12)
    {
        this.name = name;
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    
    @Override
    public String toString()
    {
        String totalCost = d.cents2dollarsAndCents(number * pricePer12);
        return name + "   " + totalCost;
    }

    @Override
    public int getCost() {
        return number * pricePer12;
    }
    
}
