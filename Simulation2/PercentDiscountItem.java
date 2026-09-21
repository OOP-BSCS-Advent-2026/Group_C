public class PercentDiscountItem extends Item {
    private int threshold;
    private int percentOff;

public PercentDiscountItem(String ItemName, double ItemPrice,int threshold,int percentOff)
{
    super(ItemName, ItemPrice);
    this.threshold = threshold;
    this.percentOff = percentOff;


}
 @Override 
 public double calculateTotal(int quantity){
    double subtotal = super.calculateTotal(quantity);
    if (quantity >= threshold){
        subtotal = subtotal*(1-percentOff/100.0);
    }
    return subtotal;
 }

 
    
}
