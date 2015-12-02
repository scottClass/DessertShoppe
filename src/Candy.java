/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author Scott
 */
public class Candy extends DessertItem{
    private String name;
    private double weight;
    private int pricePerLbs;


    public Candy(String name, double weight, int pricePerLbs)
    {
        this.name = name;
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

 
    
    @Override
    public String toString()
    {
       return name;
    }

    @Override
    public int getCost() {
        return (int)weight*pricePerLbs;
    }
}
