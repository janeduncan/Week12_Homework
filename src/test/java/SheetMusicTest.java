import org.junit.Before;
import org.junit.Test;
import shop.products.Brand;
import shop.products.accessories.SheetMusic;
import static org.junit.Assert.*;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setUp() {
        sheetMusic = new SheetMusic("Toto - Africa (Easy Piano Solo)", "S130", Brand.THEPIANOMUSIC, 3, 5);
    }

    @Test
    public void hasDescription() {
        assertEquals("Toto - Africa (Easy Piano Solo)", sheetMusic.getDescription());
    }

    @Test
    public void hasSKU() {
        assertEquals("S130", sheetMusic.getSKU());
    }

    @Test
    public void hasBrand() {
        assertEquals(Brand.THEPIANOMUSIC, sheetMusic.getBrand());
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(3, sheetMusic.getPurchasePrice());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(5, sheetMusic.getSellingPrice());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(2, sheetMusic.calculateMarkup());
    }

}