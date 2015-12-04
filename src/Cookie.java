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
    private int totalPrice;
    
    public Cookie(String name, int number, int pricePer12)
    {
        this.name = name;
        this.number = number;
        this.pricePer12 = pricePer12;
        int thing = 12 / number;
        totalPrice =  pricePer12 / thing;
    }

    
    @Override
    public String toString()
    {
        //getting the cost in dollars to print out
        String totalCost = DessertShoppe.cents2dollarsAndCents(totalPrice);
        String dozenCost = DessertShoppe.cents2dollarsAndCents(pricePer12);
        return number + " @ " + dozenCost + " /dz \n" + name + "   " + totalCost;
    }

    @Override
    public int getCost() {
        return totalPrice;
    }
    
}
