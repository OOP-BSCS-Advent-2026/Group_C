public class Item {

    private String ItemName;
    private double ItemPrice;

    
    public Item(String ItemName, double ItemPrice) {
        if (ItemPrice <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero");
        }
        this.ItemName = ItemName;
        this.ItemPrice = ItemPrice;
    }

    public String getName() {
        return ItemName;
    }

    public double getPrice() {
        return ItemPrice;
    }

    
    public double calculateTotal(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        return ItemPrice * quantity;
    }
}
