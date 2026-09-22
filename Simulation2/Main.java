public class Main {
    public static void main(String[] args) {

            Item[] items = {
            new PercentDiscountItem("Pen", 500.00, 10, 10),
            new NoDiscountItem("Textbook", 8000.00),
            new FlatDiscountItem("Ruler", 300.00, 5, 200),
            new PercentDiscountItem("Maths Set", 15000.00, 3, 5)
        };
        int[] quantities = {9, 2, 4, 3};

        System.out.println("==== NEAT STATIONERY RECEIPT ====");
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            double lineTotal = items[i].calculateTotal(quantities[i]);
            System.out.println(items[i].getName() + " x" + quantities[i]
                    + " = UGX " + String.format("%.2f", lineTotal));
            total += lineTotal;
        }
        System.out.println("==== GRAND TOTAL ====");
        System.out.println("UGX " + String.format("%.2f", total));
    }
}