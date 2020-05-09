public class ProductPriceService {

    private Product product;

    public ProductPriceService(Product product) {
        this.product = product;
    }

    public void calculateDiscount() {
        this.product.setDiscount(this.product.getPrice() / 2d);
    }
}
