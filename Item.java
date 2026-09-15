public class Item {
  private String itemName;
  private double itemPrice;

public Item(String itemName, double itemPrice) {
 this.itemName = itemName;

   if (itemPrice > 0) {
     this.itemPrice = itemPrice;
    } else {
      System.out.println("Invalid price for " + itemName + ", setting it to 0.");
       this.itemPrice = 0;
        }
    }

public String getItemName() {
        return itemName;
    }

public double getItemPrice() {
        return itemPrice;
    }

public double calculateSubtotal(int quantity) {
    if (quantity < 0) {
      System.out.println("Invalid quantity for " + itemName + ", treating it as 0.");
         quantity = 0;
     }
        return itemPrice * quantity;
    }
}
