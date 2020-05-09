import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ProductPriceServiceTest {

    Product book;
    @Test
    public void discountShouldBeCalculated() {
        book = new Product();
        book.setId(1L);
        book.setPrice(55D);
        ProductPriceService priceService = new ProductPriceService(book);

        priceService.calculateDiscount();

//        System.out.println(book);
        assertEquals(book.getDiscount(), 25.5);
    }
}
