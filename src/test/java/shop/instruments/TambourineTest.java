package shop.instruments;
import org.junit.Before;
import org.junit.Test;
import shop.products.Brand;
import shop.products.instruments.InstrumentType;
import shop.products.instruments.Tambourine;
import static org.junit.Assert.assertEquals;

public class TambourineTest {

    Tambourine tambourine;

    @Before
    public void setUp() {
        tambourine = new Tambourine("Pearl Primero Rock Tambourine", "S125", Brand.PEARL, 18, 30, InstrumentType.PERCUSSION, "Plastic", "Matte Black", 9);
    }

    @Test
    public void getDescription() {
        assertEquals("Pearl Primero Rock Tambourine", tambourine.getDescription());
    }

    @Test
    public void getSKU() {
        assertEquals("S125", tambourine.getSKU());
    }

    @Test
    public void getBrand() {
        assertEquals(Brand.PEARL, tambourine.getBrand());
    }

    @Test
    public void getPurchasePrice() {
        assertEquals(18, tambourine.getPurchasePrice());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(30, tambourine.getSellingPrice());
    }

    @Test
    public void getInstrumentType() {
        assertEquals(InstrumentType.PERCUSSION, tambourine.getType());
    }

    @Test
    public void getMaterial() {
        assertEquals("Plastic", tambourine.getMaterial());
    }

    @Test
    public void getColour() {
        assertEquals("Matte Black", tambourine.getColour());
    }

    @Test
    public void getSize() {
        assertEquals(9, tambourine.getSize());
    }

    @Test
    public void play() {
        assertEquals("Tambourine sound", tambourine.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(12, tambourine.calculateMarkup());
    }
}
