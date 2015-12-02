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
    
    public Cookie(String name, int number, int pricePer12)
    {
        this.name = name;
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    
    @Override
    public String toString()
    {
        return name;
    }

    @Override
    public int getCost() {
        return number * pricePer12;
    }
    
}
