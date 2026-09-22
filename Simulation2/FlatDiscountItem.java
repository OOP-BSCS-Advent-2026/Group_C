public class FlatDiscountItem extends Item {
    private int threshold;
    private double flatAmount;

    public FlatDiscountItem(String ItemName, double ItemPrice, int threshold, double flatAmount) {
        super(ItemName, ItemPrice);
        this.threshold = threshold;
        this.flatAmount = flatAmount;
    }

    @Override
    public double calculateTotal(int quantity) {
        double subtotal = super.calculateTotal(quantity);
        if (quantity >= threshold) {
            subtotal = subtotal - flatAmount;
        }
        return subtotal;
    }
}