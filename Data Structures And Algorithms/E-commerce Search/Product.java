public class Product {
    int productId;
    String productName;
    String Category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        Category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", Category='" + Category + '\'' +
                '}';
    }
}
