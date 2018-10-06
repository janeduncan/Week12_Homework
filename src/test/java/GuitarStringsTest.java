import org.junit.Before;
import org.junit.Test;
import shop.products.Brand;
import shop.products.accessories.GuitarStrings;
import static org.junit.Assert.*;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void setUp() {
        guitarStrings = new GuitarStrings("Fender Super Bullets 3250L guitar strings", "S129", Brand.FENDER, 4, 6);
    }

    @Test
    public void hasDescription() {
        assertEquals("Fender Super Bullets 3250L guitar strings", guitarStrings.getDescription());
    }

    @Test
    public void hasSKU() {
        assertEquals("S129", guitarStrings.getSKU());
    }

    @Test
    public void hasBrand() {
        assertEquals(Brand.FENDER, guitarStrings.getBrand());
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(4, guitarStrings.getPurchasePrice());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(6, guitarStrings.getSellingPrice());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(2, guitarStrings.calculateMarkup());
    }

}