/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author Scott
 */
public class IceCream extends DessertItem {
    
    private String name;
    private int cost;
    
    private DessertShoppe d = new DessertShoppe();
    
    public IceCream(String name, int cost)
    {
        this.name = name;
        this.cost = cost;
    }

  
    @Override
    public String toString()
    {
        String totalCost = d.cents2dollarsAndCents(cost);
        return name + "   " + totalCost;
    }

    @Override
    public int getCost() {
        return cost;
    }
    
}
