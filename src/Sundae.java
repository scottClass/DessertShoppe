/**
 * A Sundae is a type of IceCream. 
 * 
 * A Sundae needs the name of the ice cream being used, 
 * the cost of that ice cream, the name of the topping, and 
 * the cost for the topping. 
 * The cost is determined by adding the cost of the ice cream with 
 * the price of the topping.
 * 
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 * 
 * @author Scott
 */
public class Sundae extends IceCream {
    private String icName;
    private int icCost;
    private String toppingName;
    private int toppingCost;
    private int totalCost;
    
    DessertShoppe d = new DessertShoppe();
    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
       super(icName, icCost);
       this.icName = icName;
       this.icCost = icCost;
       this.toppingName = toppingName;
       this.toppingCost = toppingCost;
       totalCost = this.icCost + this.toppingCost;
    }
    

    
    @Override
    public String toString()
    {
        String cost = d.cents2dollarsAndCents(totalCost);
        return toppingName + " sundae with \n" + icName + "   " + cost;
    }

    @Override
    public int getCost() {
        return totalCost;
    }
    
}
