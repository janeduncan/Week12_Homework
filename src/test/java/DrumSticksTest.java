import org.junit.Before;
import org.junit.Test;
import shop.products.Brand;
import shop.products.accessories.DrumSticks;
import static org.junit.Assert.*;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void setUp() {
        drumSticks = new DrumSticks("Ahead Signature Rick Allen Def Leppard drumsticks", "S128", Brand.AHEAD, 26, 39);
    }

    @Test
    public void hasDescription() {
        assertEquals("Ahead Signature Rick Allen Def Leppard drumsticks", drumSticks.getDescription());
    }

    @Test
    public void hasSKU() {
        assertEquals("S128", drumSticks.getSKU());
    }

    @Test
    public void hasBrand() {
        assertEquals(Brand.AHEAD, drumSticks.getBrand());
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(26, drumSticks.getPurchasePrice());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(39, drumSticks.getSellingPrice());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(13, drumSticks.calculateMarkup());
    }

}
