public class NoDiscountItem extends Item {
    public NoDiscountItem(String Itemname, double ItemPrice) {
        super(Itemname, ItemPrice);
    }

    // No override needed - Item's calculateTotal() already does the right thing
}
