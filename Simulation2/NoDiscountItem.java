public class NoDiscountItem extends Item {
    public NoDiscountItem(String name, double price) {
        super(name, price);
    }

    @Override
    public double getFinalPrice() {
        return getPrice(); // No discount applied
    }

    @Override
    public String toString() {
        return getName() + " - Price: " + getPrice() + " (No Discount)";
    }
}
