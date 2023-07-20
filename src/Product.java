public class Product {
    private String productName;
    private Float productPrice;

    public Product(String name, Float price) {
        this.productName=name;
        this.productPrice = price;
    }

    public Float priceForXAQuantity(int quantity) {
        return this.productPrice * quantity;
    }
}
