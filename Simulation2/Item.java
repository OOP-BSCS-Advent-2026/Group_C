public class Item {

    private String Name;
    private double Price;

    
    public Item(String Name, double Price) {
        if (Price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero");
        }
        this.Name = Name;
        this.Price = Price;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return Price;
    }

    
    public double calculateTotal(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        return Price * quantity;
    }
}
