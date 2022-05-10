public class Product {
    double productCost;
    int productQuant;
    String productName;

    public Product(double costy, int quanty, String namey) {
        productCost = costy;
        productQuant = quanty;
        productName = namey;
    }

    public void printProduct(double cost, int quant, String name) {
        productCost = cost;
        productQuant = quant;
        productName = name;
        
        System.out.println(name + " costs $" + cost + " and " + quant + " units were purchased");
    }

    public double totalCost(double costa, int quanta) {
        double total = costa * quanta;
        System.out.println("Total cost is $" + total);
        return total;
    }
}