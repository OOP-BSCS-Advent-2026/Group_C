public class Item {

    private String itemName;
    private double itemPrice;

    
    public Item(String itemName, double itemPrice) {
        if (itemPrice <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero");
        }
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return itemPrice;
    }

    
    public double calculateTotal(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        return itemPrice * quantity;
    }
}
