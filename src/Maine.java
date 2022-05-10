public class Maine {
    public static void main(String[] args) throws Exception {
        Product product = new Product(4.09, 10, "Gallon of gas");

        System.out.println("Welcome to *insert gas station* (QT/Citgo/Circle K/Exxon/Texaco/Shell), and this is a stick up!");
        System.out.println("Run them pockets, fam.  I already know what you'll be buying & how much.  Courtesy of *your local gas station*.");

        product.printProduct(4.09, 10, "Gallon of gas");
        product.totalCost(4.09, 10);
    }
}